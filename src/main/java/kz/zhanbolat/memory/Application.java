package kz.zhanbolat.memory;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new AnimalClassLoader();
        Class<?> catClass = classLoader.loadClass("kz.zhanbolat.memory.Cat");
        Animal catInstance = (Animal) catClass.getConstructors()[0].newInstance();
        Class<?> dogClass = classLoader.loadClass("kz.zhanbolat.memory.Dog");
        Animal dogInstance = (Animal) dogClass.getConstructors()[0].newInstance();
        List<Animal> animals = new ArrayList<>();
        animals.add(catInstance);
        animals.add(dogInstance);
        animals.forEach(animal -> {
            animal.play();
            animal.voice();
        });
    }
}
