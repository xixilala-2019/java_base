package demo;

import main.java.com.demo.Demo;
import main.java.com.demo.entity.Car;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // Car car = new Car();
        // car.introduce();
        

        System.out.println("哈哈哈");
        new Demo().testReflect1();
    }
}
