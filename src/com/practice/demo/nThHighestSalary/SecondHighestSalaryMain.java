package com.practice.demo.nThHighestSalary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalaryMain {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(new Employee(1,1000,"Gopal","sales"));
        list1.add(new Employee(1,2000,"Gopal1","sales"));
        list1.add(new Employee(1,3000,"Gopal2","tech"));
        list1.add(new Employee(1,4000,"Gopal3","sales"));
        list1.add(new Employee(1,5000,"Gopal4","tech"));
        list1.add(new Employee(1,6000,"Gopal5","sales"));

        list1.stream().filter(i -> i.salary >1000 && i.department.equals("sales")).forEach(System.out::println);
        System.out.println("=======");
        Optional<Employee> emp =  list1.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println("Second highest salary object is ======="+emp);
    }
}
