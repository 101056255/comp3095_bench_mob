package ca.gbc.comp3095.bench_mob.demo.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private int id;
    private String userName, password;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Admin()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
