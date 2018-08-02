package com.admin.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.admin.test.entity.Article;
import com.admin.test.mapper.ArticleMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {
	@Autowired
	private ArticleMapper articleMapper;

	@Test
	public void testInsertArticle() {
		Article insert = new Article();
		insert.setId(100);
		insert.setTitle("title");
		insert.setCategoryId(1);
		insert.setReadCount(1);
		insert.setSummary("12345");
		insert.setCreateTime(new Date());
		articleMapper.insert(insert);
	}

	@Test
	public void testDeleteArticle() {
		articleMapper.deleteByPrimaryKey(100);
	}

	@Test
	public void testSelectArticle() {
		Article select = articleMapper.selectByPrimaryKey(37);
		System.out.println(select);
	}

	@Test
	public void testUpdateArticle() {
		Article update = new Article();
		update.setId(100);
		update.setTitle("title100");
		update.setCategoryId(1);
		update.setReadCount(1);
		update.setSummary("12345--100");
		update.setCreateTime(new Date());
		articleMapper.updateByPrimaryKey(update);
	}
}
