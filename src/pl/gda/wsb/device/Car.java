package pl.gda.wsb.device;

import pl.gda.wsb.Producer;

public class Car {
    public String model;
    public final Producer producer;
    Integer year;
    private Double value;

    public Car (String model, final Producer producer, Integer year, Double value){
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
