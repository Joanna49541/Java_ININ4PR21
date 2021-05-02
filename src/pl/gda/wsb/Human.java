package pl.gda.wsb;

import pl.gda.wsb.device.Car;
import pl.gda.wsb.Animal;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Human {

    SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    String firstName;
    String lastName;
    Integer age;
    boolean isWorking;
    private Double salary;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, Integer age, boolean isWorking, Double salary, Animal pet, Car car){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isWorking = isWorking;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    public Double getSalary() {
        System.out.println(new Date() + ": Informacja o wypłacie" + this.lastName );
        return salary;
    }

    public void setSalary(double newSalary){
        if (newSalary > 0){
            System.out.println("Całkiem nieźle");
        } else if (newSalary < 0){
            System.out.println("Postaraj się następnym razem!");
        }
    }


}
