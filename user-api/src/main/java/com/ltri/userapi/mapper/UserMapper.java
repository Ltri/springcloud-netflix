package com.ltri.userapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ltri.userapi.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
