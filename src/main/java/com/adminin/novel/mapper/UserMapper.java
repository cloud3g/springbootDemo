package com.adminin.novel.mapper;

import com.adminin.novel.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper{
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userName",  column = "user_name"),
            @Result(property = "passWord", column = "pass_word")
    })
    List<User> getAll();
}