package com.learningsystem.service;

import com.learningsystem.pojo.Lesson;

import java.util.List;

/**
*@Author : YangGuang
*@Description:Lesson课程Service接口
*@Date:Created in 17:51 2018/1/24
*
**/
public interface LessonService {
    //查询班级下的课表
    List<Lesson> findClassLesson(String cClassid);
}