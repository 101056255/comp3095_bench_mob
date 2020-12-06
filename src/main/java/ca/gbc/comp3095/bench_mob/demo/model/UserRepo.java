/*********************************************************************************
 * Project: COMP3095_bench_mob
 * Assignment: Assignment 2
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Nov 8th, 2020
 * Description: Extends the JpaRepository to store and save the inputted data into the database
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
