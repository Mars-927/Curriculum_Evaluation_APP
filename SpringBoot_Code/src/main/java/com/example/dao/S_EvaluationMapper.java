package com.example.dao;

import com.example.pojo.S_Evaluation;
import java.util.List;

public interface S_EvaluationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table StudentEvaluation
     *
     * @mbg.generated
     */
    int insert(S_Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table StudentEvaluation
     *
     * @mbg.generated
     */
    List<S_Evaluation> selectAll();

    /**
     * 获取所有的课程id
     */
    List<String> getcourseid();
    /**
     * 输入课程id获取指定的评价
     */
    List<S_Evaluation> getappoint(String courseid);
}