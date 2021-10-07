package homework6;

public class Worker {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        // 2. Все животные могут бежать и плыть.
        // В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль.
        // (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
        cat1.run(200);
        cat1.swim(1);
        System.out.println();
        dog1.run(500);
        dog1.swim(10);

    }
}
