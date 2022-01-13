package ru.skypro;

public class Truck extends Transport implements Engine {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


}
