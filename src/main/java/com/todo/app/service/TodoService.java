package com.todo.app.service;

import java.text.ParseException;
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

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@Autowired
	private TodoRepository todoRepository;

    @Transactional
    public List<TodoDto> findAll() {

    	List<TodoEntity> todoEntityList = todoRepository.findAll();

    	// 日付フォーマットを施し、エンティティから Dto に詰め替える。
    	List<TodoDto> todoDtoList = new ArrayList<TodoDto>();
    	for (TodoEntity todoEntity: todoEntityList ) {
    		TodoDto todoDto = new TodoDto();
    		BeanUtils.copyProperties(todoEntity, todoDto);
    		todoDto.setCreatedAt(simpleDateFormat.format(todoEntity.getCreatedAt()));
    		todoDtoList.add(todoDto);
    	}

        return todoDtoList;
    }

    @Transactional
    public void save(TodoDto todoDto) {

    	TodoEntity todoEntity = new TodoEntity();
		BeanUtils.copyProperties(todoDto, todoEntity);
    	// 日付フォーマットを施し Dto からエンティティに詰め替える。
		try {
			todoEntity.setCreatedAt(simpleDateFormat.parse(todoDto.getCreatedAt()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		todoRepository.save(todoEntity);

    }
}
