package com.itheima.maven;

import org.junit.Test;

import junit.framework.Assert;

/**
 * <p>Title: TestMavenFirst</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-20 上午10:37:50  
 * @version 1.0
 */
public class TestMavenFirst {

	@Test
	public void testSayHello(){
		MavenFirst first = new MavenFirst();
		
		String result = first.sayHello("hm19");
		
		Assert.assertEquals("hello hm19", result);
	}
}
