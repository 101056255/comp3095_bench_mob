package ca.gbc.comp3095.bench_mob.demo.contoller;

import ca.gbc.comp3095.bench_mob.demo.model.User;
import ca.gbc.comp3095.bench_mob.demo.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo repo;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(User user)
    {
        repo.save(user);
        return "Success";
    }

    @RequestMapping("/users")
    public List<User> getAll(){
        return repo.findAll();
    }
}
