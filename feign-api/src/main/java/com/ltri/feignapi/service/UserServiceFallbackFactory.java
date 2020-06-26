package com.ltri.feignapi.service;

import com.ltri.feignapi.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceFallbackFactory implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new UserService() {
            String msg = throwable == null ? "" : throwable.getMessage();

            @Override
            public List<User> listUser() {
                System.out.println("listUser fallback");
                System.out.println(msg);
                return new ArrayList<>();
            }

            @Override
            public User getById(Long id) {
                System.out.println("getById fallback");
                System.out.println(msg);
                return new User();
            }

            @Override
            public String exception() {
                System.out.println("exception fallback");
                System.out.println(msg);
                return "exception fallback";
            }
        };
    }
}
