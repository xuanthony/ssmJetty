package com.sky.dao;

import com.sky.pojo.CustPersonalInfo;
import com.sky.pojo.CustPersonalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustPersonalInfoMapper {
    int countByExample(CustPersonalInfoExample example);

    int deleteByExample(CustPersonalInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustPersonalInfo record);

    int insertSelective(CustPersonalInfo record);

    List<CustPersonalInfo> selectByExample(CustPersonalInfoExample example);

    CustPersonalInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustPersonalInfo record, @Param("example") CustPersonalInfoExample example);

    int updateByExample(@Param("record") CustPersonalInfo record, @Param("example") CustPersonalInfoExample example);

    int updateByPrimaryKeySelective(CustPersonalInfo record);

    int updateByPrimaryKey(CustPersonalInfo record);
}