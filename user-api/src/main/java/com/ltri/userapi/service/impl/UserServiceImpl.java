package com.ltri.userapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltri.userapi.entity.User;
import com.ltri.userapi.mapper.UserMapper;
import com.ltri.userapi.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
