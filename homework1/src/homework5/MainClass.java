package homework5;

public class MainClass {

    public static void main(String[] args) {

        // 4. Создать массив из 5 сотрудников.
        Employee[] empArray =
                {new Employee("Иванов Иван Иванович", "менеджер", "1@1.ru", "8(800)555-35-35", 11111, 39),
                        new Employee("Азазель Карловна Михельсон", "прораб", "2@2.ru", "8(901)234-56-78", 22222, 40),
                        new Employee("Сергеев Сергей Сергеевич", "ключник", "3@3.ru", "8(987) 654-32-10", 33333, 41),
                        new Employee("Мкртчян Гага Магоевич", "повар", "4@4.ru", "8(900) 058-54-83", 44444, 21),
                        new Employee("Борт Анна Борисовна", "охранник", "5@5.ru", "8(495) 111-22-33", 55555, 115)
                };

        showOldEmployee(empArray);
    }

    // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public static void showOldEmployee (Employee[] empArray) {
        System.out.println("Вывести информацию о сотрудниках старше 40 лет:");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                System.out.println(empArray[i].getAllData());
            }
        }
    }
}