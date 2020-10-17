package kz.zhanbolat.memory;

public class Application {


    public static void main(String[] args) throws javassist.CannotCompileException {
        /* Uncomment to throw java.lang.OutOfMemoryError: Java heap space
        java.util.List<Integer> list = new java.util.ArrayList<>();

		java.util.Random random = new java.util.Random();

		while (true) {
            list.add(random.nextInt());
        }*/
        /* Uncomment to throw java.lang.OutOfMemoryError: Java heap space.
            Warning: can take a lot of time to cause the error if -Xmx is not changed
        java.util.Random random = new java.util.Random();
        ContinuousObject continuousObject = new ContinuousObject(random.nextInt(), random.nextInt(), random.nextInt());
        while(true) {
            continuousObject = new ContinuousObject(random.nextInt(), random.nextInt(), random.nextInt(), continuousObject);
        }*/
        /* Uncomment to throw java.lang.OutOfMemoryError: java.lang.OutOfMemoryError: Metaspace.
            Warning: can take a lot of time to cause the error
            if the option -XX:MaxMetaspaceSize is not changed
        javassist.ClassPool classPool = ClassPool.getDefault();
        for (long i = 0;;i++) {
            Class clazz = classPool.makeClass("kz.zhanbolat.memory.ContinuousObject" + i).toClass();
        }*/
        /* Uncomment to throw java.lang.OutOfMemoryError: java.lang.StackOverflowError.
        recursiveMethod();*/
        /* Uncomment to throw java.lang.OutOfMemoryError: java.lang.StackOverflowError.
        System.out.println(new RecursiveObject());*/
    }

    private static void recursiveMethod() {
        recursiveMethod();
    }
}
