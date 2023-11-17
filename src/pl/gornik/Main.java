package pl.gornik;

import pl.gornik.animal.Animal;
import pl.gornik.animal.Bird;
import pl.gornik.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Doberman", 25, 'M', 4);
        Dog dog2 = new Dog("Pudel", 5, 'S', 4);

        Bird bird1 = new Bird("Wróbel", 0.05, 'S', true);
        Bird bird2 = new Bird("Struś",100 , 'L', false);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(bird1);
        animals.add(dog2);
        animals.add(bird2);

        animals.add(new Dog("Husky", 20, 'M', 4));

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}