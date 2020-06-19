package com.ltri.feignapi.error;

import com.ltri.feignapi.entity.User;
import com.ltri.feignapi.feign.UserFeignService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFeignFallback implements UserFeignService {
    @Override
    public List<User> listUser() {
        return new ArrayList<>();
    }

    @Override
    public User getById(Long id) {
        return null;
    }
}
