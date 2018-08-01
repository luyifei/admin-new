package com.admin.test.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.admin.test.entity.Article;

public interface ArticleMapper {
	@Delete("DELETE FROM t_article WHERE id =#{id}")
	int deleteByPrimaryKey(Integer id);

	@Insert("INSERT INTO blog.t_article (id, title, category_id, read_count, summary, create_time) VALUES (#{id}, #{title}, #{categoryId}, #{readCount}, #{summary}, #{createTime})")
	int insert(Article record);

	@Select("SELECT * FROM t_article WHERE id =#{id}")
	@Results({ @Result(property = "id", column = "id"), @Result(property = "title", column = "title"),
			@Result(property = "categoryId", column = "category_id"),
			@Result(property = "readCount", column = "read_count"), @Result(property = "summary", column = "summary") })
	Article selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKey(Article record);
}