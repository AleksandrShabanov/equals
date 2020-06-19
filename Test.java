package Homework.lesson26;

// перезапись метода equals

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");

        System.out.println(c1.equals(c2));
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) { //метод equals
        if (obj instanceof Car) { //является ли объект объектом класса Car
            Car c2 = (Car) obj; // casting
            return (color.equals(c2.color) && engine.equals(c2.engine)); // Если цвет и мотор равны, то и объекты будут равны
        } else {
            return false; // Если obj не является Car
        }
    }
}
