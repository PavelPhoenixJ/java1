package ru.gb.pheonix.lesson5;

// 0 Абстракция
public class Employee {
    private String name;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    // конструкторы
    public Employee(String name, String post, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;


    }

    public void printEmployee() {
        System.out.println("имя: "+name + ",  должность: "+post + ",  эл.почта: "+email + ",  номер телефона: "+phoneNumber + ",  з/п в евро: "+salary + ",  возраст: "+age);

    }
    public int getAge() {
        return age;
    }
}
