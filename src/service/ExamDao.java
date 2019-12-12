package service;

import pojo.Exam;
import pojo.ExamRecode;

import java.util.HashMap;
import java.util.List;

public interface ExamDao {
    List<ExamRecode> getExamRecodeList(HashMap map);
    Integer examrecodeCount();

    List<Exam> getexamList(HashMap map);
    Integer examListCount();
    int deleteit(Integer id);
}
