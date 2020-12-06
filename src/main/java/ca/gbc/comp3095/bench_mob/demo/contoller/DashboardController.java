/*********************************************************************************
* Project: COMP3095_bench_mob
 * Assignment: Assignment 2
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Nov 8th, 2020
 * Description: Dashboard controller, directs user to different tabs based on button input
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class DashboardController {

    @RequestMapping(value = "/dashboard" , method = RequestMethod.POST)
    public String dashboard()
    {
        return "dashboard";
    }

    @GetMapping("{tab}")
    public String tab(@PathVariable String tab) {
        if (Arrays.asList("Tab1", "Tab2", "Tab3", "Tab4")
                .contains(tab)) {
            return tab;
        }

        return "login";
    }

    @GetMapping("/myprofileadmin")
    public String myProfileAdmin()
    {
        return "AdminProfile";
    }
}
