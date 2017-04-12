package com.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/12 21:55 xuxinbin Exp $$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/config/applicationContext.xml", "classpath*:/config/spring-mvc.xml"})
public class BaseJunitTest {
}
