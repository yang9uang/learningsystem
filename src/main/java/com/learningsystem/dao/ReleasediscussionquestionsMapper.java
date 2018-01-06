package com.learningsystem.dao;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.pojo.ReleasediscussionquestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleasediscussionquestionsMapper {
    long countByExample(ReleasediscussionquestionsExample example);

    int deleteByExample(ReleasediscussionquestionsExample example);

    int deleteByPrimaryKey(Integer rdqId);

    int insert(Releasediscussionquestions record);

    int insertSelective(Releasediscussionquestions record);

    List<Releasediscussionquestions> selectByExample(ReleasediscussionquestionsExample example);

    Releasediscussionquestions selectByPrimaryKey(Integer rdqId);

    int updateByExampleSelective(@Param("record") Releasediscussionquestions record, @Param("example") ReleasediscussionquestionsExample example);

    int updateByExample(@Param("record") Releasediscussionquestions record, @Param("example") ReleasediscussionquestionsExample example);

    int updateByPrimaryKeySelective(Releasediscussionquestions record);

    int updateByPrimaryKey(Releasediscussionquestions record);

    //查询问题讨论标题以及内容和所属的标签
    List<Releasediscussionquestions> selectRdqAndTag();
}