package com.sky.dao;

import com.sky.pojo.CustEnterInfo;
import com.sky.pojo.CustEnterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustEnterInfoMapper {
    int countByExample(CustEnterInfoExample example);

    int deleteByExample(CustEnterInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustEnterInfo record);

    int insertSelective(CustEnterInfo record);

    List<CustEnterInfo> selectByExample(CustEnterInfoExample example);

    CustEnterInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustEnterInfo record, @Param("example") CustEnterInfoExample example);

    int updateByExample(@Param("record") CustEnterInfo record, @Param("example") CustEnterInfoExample example);

    int updateByPrimaryKeySelective(CustEnterInfo record);

    int updateByPrimaryKey(CustEnterInfo record);
}