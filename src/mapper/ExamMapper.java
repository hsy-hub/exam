package mapper;

import pojo.ExamRecode;

import java.util.HashMap;
import java.util.List;

public interface ExamMapper {
    List<ExamRecode> getExamRecodeList(HashMap map);
}
