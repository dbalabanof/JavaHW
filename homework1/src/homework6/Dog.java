package homework6;

// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {

    // 3. У каждого животного есть ограничения на действия (собака - бег: 500 м.; плавание: 10 м.).
    @Override
    public void run(int runDistance) {
        if ((runDistance <= 0) || (runDistance > 500)) {
            System.out.println("Ошибка. Укажите дистанцию бега собаки от 1 до 500 метров");
        } else {
            System.out.println("Собака пробежала " + runDistance + " м.");
        }
    }


    @Override
    public void swim(int swimDistance) {
        if ((swimDistance <= 0) || (swimDistance > 10)) {
            System.out.println("Ошибка. Укажите дистанцию плавания собаки от 1 до 10 метров");
        } else {
            System.out.println("Собака проплыла " + swimDistance + " м.");
        }
    }
}
