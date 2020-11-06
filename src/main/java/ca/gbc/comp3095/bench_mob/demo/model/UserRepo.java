package ca.gbc.comp3095.bench_mob.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
