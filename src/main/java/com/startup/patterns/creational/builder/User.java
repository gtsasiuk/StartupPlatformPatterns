package com.startup.patterns.creational.builder;

public class User {
    private String username;
    private String email;
    private String phone;
    private UserRole role;

    public User() {
    }

    public User(String username, String email, String phone, UserRole role) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User {").append("Username: ").append(username).append("; ");
        sb.append("Email: ").append(email).append("; ");
        sb.append("Phone: ").append(phone).append("; ");
        sb.append("Role: ").append(role).append(";}");
        return sb.toString();
    }
}
