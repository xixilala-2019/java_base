package main.java.com.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import main.java.com.demo.entity.Car;

public class Demo {

    public Demo () {

    }


    public void testReflect1() {
        System.out.println("来来来");

        try {

            ClassLoader loader =  Thread.currentThread().getContextClassLoader();
            Class clazz = loader.loadClass("main.java.com.demo.entity.Car");
            Method setColorM =  clazz.getDeclaredMethod("setColor", String.class);
            Car car = (Car)clazz.newInstance();
            setColorM.invoke(car, "红色");
            car.introduce();


            
            ClassLoader loader2 =  Thread.currentThread().getContextClassLoader();
            Class clazz2 = loader2.loadClass("main.java.com.demo.entity.Car");
            Constructor<Car> cs = clazz2.getConstructor(String.class);
            Car whiteCar = cs.newInstance("白色");
            whiteCar.introduce();

        } catch(Exception e) {
            e.printStackTrace();
        }



    }
}