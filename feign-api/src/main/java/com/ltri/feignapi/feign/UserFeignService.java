package com.ltri.feignapi.feign;

import com.ltri.feignapi.entity.User;
import com.ltri.feignapi.error.UserFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "user-api")
public interface UserFeignService {

    @GetMapping("/users")
    List<User> listUser();

    @GetMapping("/users/{id}")
    User getById(@PathVariable Long id);
}
