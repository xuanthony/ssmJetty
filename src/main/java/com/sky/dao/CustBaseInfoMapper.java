package com.sky.dao;

import com.sky.pojo.CustBaseInfo;
import com.sky.pojo.CustBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustBaseInfoMapper {
    int countByExample(CustBaseInfoExample example);

    int deleteByExample(CustBaseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustBaseInfo record);

    int insertSelective(CustBaseInfo record);

    List<CustBaseInfo> selectByExample(CustBaseInfoExample example);

    CustBaseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustBaseInfo record, @Param("example") CustBaseInfoExample example);

    int updateByExample(@Param("record") CustBaseInfo record, @Param("example") CustBaseInfoExample example);

    int updateByPrimaryKeySelective(CustBaseInfo record);

    int updateByPrimaryKey(CustBaseInfo record);
}