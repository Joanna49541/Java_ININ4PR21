package pl.gda.wsb.device;

import pl.gda.wsb.Producer;

public class Car {
    public String model;
    public final Producer producer;
    Integer year;

    public Car (String model, final Producer producer, Integer year){
        this.model = model;
        this.producer = producer;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", year=" + year +
                '}';
    }
}
