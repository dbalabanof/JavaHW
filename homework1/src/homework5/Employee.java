package homework5;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.println
        ("ФИО сотрудника: " + fullName + ", должность: " + position + ", email: " + email + ", телефон: " + phone + ", зарплата: " + salary + ", возраст: " + age);
    }

    public String getFullName() {return fullName;}
    public String getPosition() {return position;}
    public String getEmail() {return email;}
    public String getPhone(){return phone;}
    public int getSalary(){return salary;}
    public int getAge(){return age;}

    public String getAllData() {
        return "ФИО: " + this.fullName
        + ", должность: " + this.position
        + ", email: " + this.email
        + ", телефон: " + this.phone
        + ", зар.плата: " + this.salary
        + ", возраст: " + this.age;
    }
}
