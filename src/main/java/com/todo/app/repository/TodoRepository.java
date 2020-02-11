package com.todo.app.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.todo.app.entity.TodoEntity;

@Mapper
public interface TodoRepository {

	@Select("select * from todo")
	List<TodoEntity> findAll();

	@Insert("insert into todo (title, detail, createdAt) values (#{title}, #{detail}, #{createdAt})")
	void save(TodoEntity todoEntity);

}
