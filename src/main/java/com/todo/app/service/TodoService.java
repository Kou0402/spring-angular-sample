package com.todo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.app.entity.TodoEntity;
import com.todo.app.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

    @Transactional
    public List<TodoEntity> findAll() {
        return todoRepository.findAll();
    }
    @Transactional
    public TodoEntity findOne(int id) {
    	return todoRepository.findOne(id);
    }

}
