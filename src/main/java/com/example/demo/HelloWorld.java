package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

	@Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String home() {

    	List<Map<String, Object>> dataList = jdbcTemplate.queryForList("SELECT * FROM TEST_TABLE");

        return dataList.toString();
    }

}
