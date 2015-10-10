package org.cdac.models;

import javax.persistence.*;

/**
 * Created by Admin.
 * User: Admin
 * Date: 10/10/2015
 * Time: 1:08 AM
 */

@Entity
@Table(name = "test")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;

    @Column
    private String passWord;

    @Column
    private String emailId;


    public User() {
    }

    public User(String userName, String passWord, String emailId) {
        this.userName = userName;
        this.passWord = passWord;
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
