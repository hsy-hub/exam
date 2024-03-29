package mapper;

import pojo.Exam;
import pojo.ExamRecode;

import java.util.HashMap;
import java.util.List;

public interface ExamMapper {
    List<ExamRecode> getExamRecodeList(HashMap map);
    Integer examrecodeCount();

    List<Exam> getexamList(HashMap map);
    Integer examListCount();
    int deleteit(Integer id);
}
