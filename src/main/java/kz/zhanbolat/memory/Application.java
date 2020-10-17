package kz.zhanbolat.memory;

import javassist.CannotCompileException;
import javassist.ClassPool;

public class Application {
    private static ClassPool classPool = ClassPool.getDefault();

    public static void main(String[] args) throws CannotCompileException {
        /* Uncomment to throw java.lang.OutOfMemoryError: Java heap space
        java.util.List<Integer> list = new java.util.ArrayList<>();

		java.util.Random random = new java.util.Random();

		while (true) {
            list.add(random.nextInt());
        }*/
        /* Uncomment to throw java.lang.OutOfMemoryError: Java heap space.
            Warning: can take a lot of time to cause the error
        java.util.Random random = new java.util.Random();
        ContinuousObject continuousObject = new ContinuousObject(random.nextInt(), random.nextInt(), random.nextInt());
        final long start = System.currentTimeMillis();
        while(true) {
            continuousObject = new ContinuousObject(random.nextInt(), random.nextInt(), random.nextInt(), continuousObject);
        }*/
        /* Uncomment to throw java.lang.OutOfMemoryError: java.lang.OutOfMemoryError: Metaspace.
            Warning: can take a lot of time to cause the error
            if the option -XX:MaxMetaspaceSize is not changed
        for (long i = 0;;i++) {
            Class clazz = classPool.makeClass("kz.zhanbolat.memory.ContinuousObject" + i).toClass();
        }*/
    }
}
