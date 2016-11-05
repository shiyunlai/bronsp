package org.fone.bronsp.base.biz;

import junit.framework.Assert;

import org.junit.Test;

public class SequenceBizTest {

	@Test
	public void test() {
		
		SequenceBiz sequenceBiz = new SequenceBiz() ; 
		System.out.println( sequenceBiz.getId() )  ;
		System.out.println( sequenceBiz.generateId("shiyunlai") );
		
		Assert.assertEquals(17, sequenceBiz.getId().length() );//获得的id为17位
		
	}
}
