package ca.gbc.comp3095.bench_mob.demo;

import ca.gbc.comp3095.bench_mob.demo.model.Admin;
import ca.gbc.comp3095.bench_mob.demo.model.AdminRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(AdminRepo repo){
        return args ->
        {
            repo.save(new Admin("admin@isp.net", "P@ssword1"));
        };
    }
}
