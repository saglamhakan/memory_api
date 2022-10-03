package com.example.demo.api;

import com.example.demo.business.UserService;
import com.example.demo.business.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserApi {
    UserService service = new UserService();

    @GetMapping("/getAll")
    public List<User> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        service.add(user);
    }
}
