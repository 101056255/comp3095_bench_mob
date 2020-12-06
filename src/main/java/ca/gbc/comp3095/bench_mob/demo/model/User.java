/*********************************************************************************
 * Project: COMP3095_bench_mob
 * Assignment: Assignment 2
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Nov 8th, 2020
 * Description: Builds the user entity to be saved into the database
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private int id;
    private String userName, password, firstName, lastName, address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
