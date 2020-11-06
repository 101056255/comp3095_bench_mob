package ca.gbc.comp3095.bench_mob.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @RequestMapping(value = "/dashboard" , method = RequestMethod.POST)
    public String dashboard()
    {
        return "dashboard";
    }
}
