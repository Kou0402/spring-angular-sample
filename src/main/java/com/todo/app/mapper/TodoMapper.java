package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.todo.app.entity.Todo;

@Mapper
public interface TodoMapper {
    @Select("select * from todo")
    List<Todo> findAll();

//    @Select("select * from player where id = #{id}")
//    Player findOne(Long id);
//
//    @Insert("insert into player (name, team, position) values (#{name}, #{team}, #{position})")
//    @Options(useGeneratedKeys = true)
//    void save(Player player);
//
//    @Update("update player set name = #{name}, team = #{team}, position = #{position} where id = #{id}")
//    void update(Player player);
//
//    @Delete("delete from player where id = #{id}")
//    void delete(Long id);
}