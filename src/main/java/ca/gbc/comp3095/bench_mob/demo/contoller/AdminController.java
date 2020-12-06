/*********************************************************************************
 * Project: COMP3095_bench_mob
 * Assignment: Assignment 2
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Nov 8th, 2020
 * Description: Checks whether an admin has logged in and sends them to the dashboard
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.contoller;

import ca.gbc.comp3095.bench_mob.demo.model.AdminRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    private final AdminRepo adminRepo;

    public AdminController(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    public String adminLogin(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "password") String password)
    {
        if(userName.equals("admin@isp.net") && password.equals("P@ssword1"))
        {
            return "DashboardAdmin";
        }
        else
        {
            return "dashboard";
        }
    }
}
