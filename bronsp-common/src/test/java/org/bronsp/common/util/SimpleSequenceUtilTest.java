package org.bronsp.common.util;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class SimpleSequenceUtilTest {

	@Test
	public void test() {

		String temp = "";
		List<String> l = new ArrayList<String>();
		String result = "不重复" ; 
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			temp = SimpleSequenceUtil.instance.getId();
			if (l.contains(temp)) {
				System.out.println("重复：" + temp);
				result = result + " 重复：" + temp ;
			} else {
				l.add(temp);
			}
		}
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
		
		Assert.assertEquals(1000, l.size());//生成1000个序号
		Assert.assertEquals("不重复", result);//不能有重复
	}

}
