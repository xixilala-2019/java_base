package main.java.com.demo.entity;


public class Car {
    private String name;
    private String color;
    private boolean isChinaProduce;
    private long produceTimeStamp;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isChinaProduce() {
        return isChinaProduce;
    }

    public void setChinaProduce(boolean isChinaProduce) {
        this.isChinaProduce = isChinaProduce;
    }

    public long getProduceTimeStamp() {
        return produceTimeStamp;
    }

    public void setProduceTimeStamp(long produceTimeStamp) {
        this.produceTimeStamp = produceTimeStamp;
    }

    public void introduce() {
        System.out.println("name=" + name  + "  color=" + color + " isChinaCar=" + isChinaProduce + " produceTime=" + produceTimeStamp);
    }

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    
}