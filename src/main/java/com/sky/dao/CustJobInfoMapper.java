package com.sky.dao;

import com.sky.pojo.CustJobInfo;
import com.sky.pojo.CustJobInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustJobInfoMapper {
    int countByExample(CustJobInfoExample example);

    int deleteByExample(CustJobInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustJobInfo record);

    int insertSelective(CustJobInfo record);

    List<CustJobInfo> selectByExample(CustJobInfoExample example);

    CustJobInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustJobInfo record, @Param("example") CustJobInfoExample example);

    int updateByExample(@Param("record") CustJobInfo record, @Param("example") CustJobInfoExample example);

    int updateByPrimaryKeySelective(CustJobInfo record);

    int updateByPrimaryKey(CustJobInfo record);
}