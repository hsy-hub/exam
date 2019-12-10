package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.ExamRecode;
import service.ExamDao;
import tool.Tool;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ExamController {
    @Autowired
    ExamDao examDao;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/examList.action")
    @ResponseBody       //加上 @ResponseBody 后，会直接返回 json 数据
    public Map<String, Object> userList(ExamRecode examRecode, int page, int limit) {
        HashMap<String, Object> map = new HashMap<>();
        int pagestart = (page - 1) * limit;
        map.put("pagestart", pagestart);
        map.put("size", limit);
        map.put("userName", examRecode.getUserName());//查询条件
        List<ExamRecode> examList = examDao.getExamRecodeList(map);
        Integer pagecount = examDao.examrecodeCount();
        Map<String, Object> returnTable = Tool.testLayui(examList, page, limit);
        returnTable.put("count", pagecount);
        return returnTable;
    }

}
