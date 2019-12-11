package service;

import mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.ExamRecode;
import pojo.TestAdmin;

import java.util.HashMap;
import java.util.List;
@Service
public class ExamDaoImpl implements ExamDao {
    @Autowired
    ExamMapper examMapper;
    @Override
    public List<ExamRecode> getExamRecodeList(HashMap map) {
        return examMapper.getExamRecodeList(map);
    }

    @Override
    public Integer examrecodeCount() {
        return examMapper.examrecodeCount();
    }

    @Override
    public List<TestAdmin> getTestAdminList(HashMap map) {
        return examMapper.getTestAdminList(map);
    }

    @Override
    public Integer testadminCount() {
        return examMapper.testadminCount();
    }

    @Override
    public int deleteit(Integer id) {
        return examMapper.deleteit(id);
    }
}
