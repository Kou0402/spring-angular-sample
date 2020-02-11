package com.todo.app.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.app.dto.TodoDto;
import com.todo.app.entity.TodoEntity;
import com.todo.app.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

    @Transactional
    public List<TodoDto> findAll() {

    	List<TodoEntity> todoEntityList = todoRepository.findAll();

    	// 日付フォーマットを施し、エンティティから Dto に詰め替える。
    	List<TodoDto> todoDtoList = new ArrayList<TodoDto>();
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	for (TodoEntity todoEntity: todoEntityList ) {
    		TodoDto todoDto = new TodoDto();
    		BeanUtils.copyProperties(todoEntity, todoDto);
    		todoDto.setCreatedAt(simpleDateFormat.format(todoEntity.getCreatedAt()));
    		todoDtoList.add(todoDto);
    	}

        return todoDtoList;
    }

    @Transactional
    public TodoEntity findOne(int id) {
    	return todoRepository.findOne(id);
    }

}
