package com.learningsystem.dao;

import com.learningsystem.pojo.Classwork;
import com.learningsystem.pojo.ClassworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassworkMapper {
    long countByExample(ClassworkExample example);

    int deleteByExample(ClassworkExample example);

    int deleteByPrimaryKey(Integer ckId);

    int insert(Classwork record);

    int insertSelective(Classwork record);

    List<Classwork> selectByExample(ClassworkExample example);

    Classwork selectByPrimaryKey(Integer ckId);

    int updateByExampleSelective(@Param("record") Classwork record, @Param("example") ClassworkExample example);

    int updateByExample(@Param("record") Classwork record, @Param("example") ClassworkExample example);

    int updateByPrimaryKeySelective(Classwork record);

    int updateByPrimaryKey(Classwork record);
}