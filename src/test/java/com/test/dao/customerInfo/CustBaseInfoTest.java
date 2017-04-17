package com.test.dao.customerInfo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;
import com.sky.dao.CustBaseInfoMapper;
import com.sky.pojo.CustBaseInfo;
import com.sky.pojo.CustBaseInfoExample;
import com.sky.util.Paginator;
import com.test.base.BaseJunitTest;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/12 21:52 xuxinbin Exp $$
 */
public class CustBaseInfoTest extends BaseJunitTest {

    @Autowired
    private CustBaseInfoMapper custBaseInfoMapper;

    //@Test
    public void insertCustBaseInfo() {
        Preconditions.checkNotNull(custBaseInfoMapper, "custBaseInfoMapper注入失败，请确认.");

        CustBaseInfo custBaseInfo = new CustBaseInfo();
        custBaseInfo.setCertName("中天二");
        custBaseInfo.setCertNo("12345611");
        custBaseInfo.setCategory("0");
        custBaseInfoMapper.insert(custBaseInfo);
        System.out.println("PrimaryKey is " + custBaseInfo.getId());
        Assert.assertNotNull(custBaseInfo.getId());

        CustBaseInfo custBaseInfo1 = custBaseInfoMapper.selectByPrimaryKey(custBaseInfo.getId());
        System.out.println("select customter ==> " + custBaseInfo1.toString());
        Assert.assertNotNull(custBaseInfo1);

        CustBaseInfo custBaseInfo2 = new CustBaseInfo();
        custBaseInfo2.setId(1001238L);
        custBaseInfo2.setContact("18798761526");
        custBaseInfo2.setAlipayAccount("18798761526");
        custBaseInfo2.setCreator("xuxinbin");
        System.out.println(custBaseInfo1.toString());
        Long result = custBaseInfoMapper.updateByPrimaryKey(custBaseInfo2);
        //Long result = custBaseInfoMapper.updateByPrimaryKeySelective(custBaseInfo1);
        System.out.println("result = " + result);
        Assert.assertNotNull(result);
    }

    @Test
    public void selectListByExample() {
        CustBaseInfoExample custBaseInfoExample = new CustBaseInfoExample();
        custBaseInfoExample.createCriteria().andCategoryEqualTo("0");
        List<CustBaseInfo> lists = custBaseInfoMapper.selectByExample(custBaseInfoExample);

        System.out.println(JSONObject.toJSONString(lists));
        Assert.assertNotNull(lists);
    }

    @Test
    public void selectPaginateListByExample() {
        CustBaseInfoExample custBaseInfoExample = new CustBaseInfoExample();
        custBaseInfoExample.createCriteria().andCategoryEqualTo("0");
        int offIndex = 0;
        int pageSize = 5;
        Paginator paginator = new Paginator(offIndex, pageSize);
        custBaseInfoExample.setPaginator(paginator);
        List<CustBaseInfo> lists = custBaseInfoMapper.selectPaginateCustBaseInfo(custBaseInfoExample);
        int size = custBaseInfoMapper.countByExample(custBaseInfoExample);

        System.out.println(size);
        System.out.println(JSONObject.toJSONString(lists));

        Assert.assertNotNull(lists);
    }
}
