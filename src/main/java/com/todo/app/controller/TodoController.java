package com.todo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.dto.TodoDto;
import com.todo.app.service.TodoService;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	TodoService todoService;

	@GetMapping
	List<TodoDto> getTodoList() {
		List<TodoDto> todoEntityList = todoService.findAll();
        return todoEntityList;
    }

    @PostMapping
    public void postTodo(@RequestBody TodoDto todoDto) {
    	System.out.println(todoDto);
    	todoService.save(todoDto);
    }

}
