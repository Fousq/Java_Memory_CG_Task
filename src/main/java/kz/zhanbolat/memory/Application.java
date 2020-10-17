package kz.zhanbolat.memory;

public class Application {
    public static void main(String[] args) {
        /* Uncomment to throw java.lang.OutOfMemoryError: Java heap space
        java.util.List<Integer> list = new java.util.ArrayList<>();

		java.util.Random random = new java.util.Random();

		while (true) {
            list.add(random.nextInt());
        }*/
        /* Uncomment to throw java.lang.OutOfMemoryError: Java heap space.
            Warning: can take a lot of time to cause the error
        java.util.Random random = new java.util.Random();
        ContinuousObject continuousObject = new ContinuousObject(random.nextInt());
        while(true) {
            continuousObject = new ContinuousObject(random.nextInt(), continuousObject);
        }*/
    }
}
