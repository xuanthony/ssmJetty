package com.test.dao.customerInfo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.base.Preconditions;
import com.sky.dao.CustBaseInfoMapper;
import com.sky.pojo.CustBaseInfo;
import com.test.base.BaseJunitTest;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/12 21:52 xuxinbin Exp $$
 */
public class CustBaseInfoTest extends BaseJunitTest {

    @Autowired
    private CustBaseInfoMapper custBaseInfoMapper;

    @Test
    public void insertCustBaseInfo() {
        Preconditions.checkNotNull(custBaseInfoMapper, "custBaseInfoMapper注入失败，请确认.");

        CustBaseInfo custBaseInfo = new CustBaseInfo();
        custBaseInfo.setCertName("中天一");
        custBaseInfo.setCertNo("123456");
        Long id = custBaseInfoMapper.insert(custBaseInfo);

        Assert.assertNotNull(id);
    }
}
