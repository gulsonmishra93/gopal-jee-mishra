package com.practice.demo.nThHighestSalary;

import java.util.Objects;

public class Employee {
    int id;
    int salary;
    String name;
    String department;
    public Employee(int id, int salary, String name, String department) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department = department;

    }
    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salary);
    }
}
