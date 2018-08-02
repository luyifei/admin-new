package com.admin.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.admin.test.entity.AccessLog;
import com.admin.test.mapper.AccessLogMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccessLogMapperTest {
	@Autowired
	private AccessLogMapper accessLogMapper;

	@Test
	public void testInsertAccessLog() {
		AccessLog record = new AccessLog();
		record.setId(1);
		record.setIp("127.0.0.1");
		record.setUrl("1234");
		accessLogMapper.insert(record);
	}

	@Test
	public void testDeleteAccessLog() {
		accessLogMapper.deleteByPrimaryKey(1);
	}

	@Test
	public void testSelectAccessLog() {
		System.out.println(accessLogMapper.selectByPrimaryKey(2));
	}

	@Test
	public void testUpdateAccessLog() {
		AccessLog record = new AccessLog();
		record.setId(1006);
		record.setIp("127.0.0.1");
		record.setUrl("55555551111111155555555");
		record.setCreateTime(new Date());
		accessLogMapper.updateByPrimaryKey(record);
	}
}
