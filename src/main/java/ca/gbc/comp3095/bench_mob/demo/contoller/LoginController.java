/*********************************************************************************
 * Project: COMP3095_bench_mob
 * Assignment: Assignment 2
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Nov 8th, 2020
 * Description: Login controller displays the login.html file to the web page
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping({"", "/"})
    public String login()
    {
        return "login";
    }
}
