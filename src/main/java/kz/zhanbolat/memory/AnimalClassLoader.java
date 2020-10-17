package kz.zhanbolat.memory;

import java.util.Objects;

public class AnimalClassLoader extends ClassLoader {

    @Override
    @SuppressWarnings("unchecked")
    protected Class<Animal> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<Animal> clazz = (Class<Animal>) findLoadedClass(name);
        if (Objects.isNull(clazz)) {
            if (Objects.nonNull(getParent())) {
                clazz = (Class<Animal>) getParent().loadClass(name);
            }

            if (Objects.isNull(clazz)) {
                // TODO: ASK ABOUT THIS
                clazz = (Class<Animal>) findClass(name);
            }
        }
        if (resolve) {
            resolveClass(clazz);
        }
        return clazz;
    }
}
