package com.todo.app.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/todo")
public class TodoController {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@GetMapping
    Object getTodoList() {

    	List<Map<String, Object>> dataList = jdbcTemplate.queryForList("SELECT * FROM TEST_TABLE");
    	System.out.println("Getが作動しました");
        return dataList;
    }

    @PostMapping
    public String postTodo(@RequestBody String item) {
        Date date = new Date();
        jdbcTemplate.update("INSERT INTO bbs_comment ( body , name, date ) VALUES (?, ?, ?)", item, item, date);
        return "redirect:/post";
    }

}
