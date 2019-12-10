package service;

import pojo.ExamRecode;

import java.util.HashMap;
import java.util.List;

public interface ExamDao {
    List<ExamRecode> getExamRecodeList(HashMap map);
}
