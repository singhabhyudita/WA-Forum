package com.waforum.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Integer id;
    private Integer registrationNumber;
    private Integer contribution;
    private String displayName;
    private String aboutMe;
    private String github;
    private String codechef;
    private String codeforces;
    private String email;
    private String password;
    @Transient
    private FollowStatus followStatus;
    @Transient
    private boolean isItYou;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistrationNumber() {
        System.out.println("Get registration number for user " + this + " called");
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Integer getContribution() {
        return contribution;
    }

    public void setContribution(Integer contribution) {
        this.contribution = contribution;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getCodechef() {
        return codechef;
    }

    public void setCodechef(String codechef) {
        this.codechef = codechef;
    }

    public String getCodeforces() {
        return codeforces;
    }

    public void setCodeforces(String codeforces) {
        this.codeforces = codeforces;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FollowStatus getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(FollowStatus followStatus) {
        this.followStatus = followStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", registrationNumber=" + registrationNumber +
                ", contribution=" + contribution +
                ", displayName='" + displayName + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", github='" + github + '\'' +
                ", codechef='" + codechef + '\'' +
                ", codeforces='" + codeforces + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean isItYou() {
        return isItYou;
    }

    public void setItYou(boolean itYou) {
        isItYou = itYou;
    }
}
