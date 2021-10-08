package homework6;

// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {

    // 3. У каждого животного есть ограничения на действия (кот - бег: 200 м.; плавание: кот не умеет плавать).
    @Override
    public void run (int runDistance) {
        if ((runDistance <= 0) || (runDistance > 200)) {
            System.out.println("Ошибка. Укажите дистанцию бега кота от 1 до 200 метров");
        } else {
            System.out.println("Кот пробежал " + runDistance + " м.");
        }
    }


    @Override
    public void swim (int swimDistance) {
        System.out.println("Кот не умеет плавать");
    }
}
