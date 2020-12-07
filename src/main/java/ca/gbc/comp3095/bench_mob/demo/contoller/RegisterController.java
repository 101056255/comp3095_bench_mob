/*********************************************************************************
 * Project: COMP3095_bench_mob
 * Assignment: Assignment 3
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Dec 6, 2020
 * Description: Registers a user
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register()
    {
        return "register";
    }
}
