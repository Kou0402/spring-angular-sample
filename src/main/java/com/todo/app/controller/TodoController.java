package com.todo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.dto.TodoDto;
import com.todo.app.entity.TodoEntity;
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
	@GetMapping("{id}")
	TodoEntity getTodo(@PathVariable("id") Integer id) {
		TodoEntity todoEntity = todoService.findOne(id);
		return todoEntity;
	}

//    @PostMapping
//    public String postTodo(@RequestBody String item) {
//        Date date = new Date();
//        jdbcTemplate.update("INSERT INTO bbs_comment ( body , name, date ) VALUES (?, ?, ?)", item, item, date);
//        return "redirect:/post";
//    }

}
