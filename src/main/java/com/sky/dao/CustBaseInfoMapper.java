package com.sky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.pojo.CustBaseInfo;
import com.sky.pojo.CustBaseInfoExample;

public interface CustBaseInfoMapper {

    Long insert(CustBaseInfo record);

    List<CustBaseInfo> selectByExample(CustBaseInfoExample example);

    List<CustBaseInfo> selectPaginateCustBaseInfo(CustBaseInfoExample example);

    Integer countByExample(CustBaseInfoExample example);

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // 暂时只用到以上方法
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    int deleteByExample(CustBaseInfoExample example);

    int deleteByPrimaryKey(Long id);


    int insertSelective(CustBaseInfo record);


    CustBaseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustBaseInfo record, @Param("example") CustBaseInfoExample example);

    int updateByExample(@Param("record") CustBaseInfo record, @Param("example") CustBaseInfoExample example);

    Long updateByPrimaryKeySelective(CustBaseInfo record);

    Long updateByPrimaryKey(CustBaseInfo record);
}