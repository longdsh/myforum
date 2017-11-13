package com.acm.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acm.service.Impl.UserServiceImpl;

/**
* @author 计算机网络软件应用1501 路素飞
* QQ 2512977541
* @version 创建时间：2017年11月9日 下午4:25:29
* 类说明
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })//导入 junit4 和springtest
public class DaoTest {

	@Resource
	UserServiceImpl UserServiceImpl;
	@Test
	public void test() {
		//fail("Not yet implemented");
		UserServiceImpl.add();
	}

}
