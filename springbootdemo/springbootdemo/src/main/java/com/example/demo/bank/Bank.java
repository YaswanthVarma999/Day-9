package com.example.demo.bank;

public class Bank {

    private Integer id;
    private String name;
    private String branch;
    private String ifscCode;
    private Double balance;

    public Bank(Integer id, String name, String branch, String ifscCode, Double balance) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.ifscCode = ifscCode;
        this.balance = balance;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
