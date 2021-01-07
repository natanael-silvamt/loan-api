package com.app.loan.model;

public class Client {
    private String name;
    private String cpf;
    private Integer age;
    private String uf;
    private Double salary;

    public Client(String name, String cpf, Integer age, String uf, Double salary) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.uf = uf;
        this.salary = salary;
    }

    public Client() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", age=" + age +
                ", uf='" + uf + '\'' +
                ", salary=" + salary +
                '}';
    }
}
