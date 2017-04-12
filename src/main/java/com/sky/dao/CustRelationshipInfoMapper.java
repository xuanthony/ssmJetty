package com.sky.dao;

import com.sky.pojo.CustRelationshipInfo;
import com.sky.pojo.CustRelationshipInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustRelationshipInfoMapper {
    int countByExample(CustRelationshipInfoExample example);

    int deleteByExample(CustRelationshipInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustRelationshipInfo record);

    int insertSelective(CustRelationshipInfo record);

    List<CustRelationshipInfo> selectByExample(CustRelationshipInfoExample example);

    CustRelationshipInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustRelationshipInfo record, @Param("example") CustRelationshipInfoExample example);

    int updateByExample(@Param("record") CustRelationshipInfo record, @Param("example") CustRelationshipInfoExample example);

    int updateByPrimaryKeySelective(CustRelationshipInfo record);

    int updateByPrimaryKey(CustRelationshipInfo record);
}