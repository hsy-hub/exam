package mapper;

import pojo.ExamRecode;
import pojo.TestAdmin;

import java.util.HashMap;
import java.util.List;

public interface ExamMapper {
    List<ExamRecode> getExamRecodeList(HashMap map);
    Integer examrecodeCount();

    List<TestAdmin> getTestAdminList(HashMap map);
    Integer testadminCount();
    int deleteit(Integer id);
}
