package com.todo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.app.entity.Todo;
import com.todo.app.mapper.TodoMapper;

@Service
public class TodoService {

	@Autowired
	private TodoMapper todoMapper;

    @Transactional
    public List<Todo> findAll() {
        return todoMapper.findAll();
    }

}