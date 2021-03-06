package pl.gda.wsb;

import pl.gda.wsb.device.Car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class Human {

    SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    String firstName;
    String lastName;
    Integer age;
    boolean isWorking;
    private Double salary;
    Animal pet;
    private Car car;

    public Human(String firstName, String lastName, Integer age, boolean isWorking, Double salary, Animal pet, Car car){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isWorking = isWorking;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return isWorking == human.isWorking &&
                formatter.equals(human.formatter) &&
                date.equals(human.date) &&
                firstName.equals(human.firstName) &&
                lastName.equals(human.lastName) &&
                age.equals(human.age) &&
                getSalary().equals(human.getSalary()) &&
                pet.equals(human.pet) &&
                car.equals(human.car);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary  > car.getValue()) {
            System.out.println("Super, kupiłeś auto za gotówkę " + car.toString());
            this.car = car;
        } else if (this.salary > 0.83*car.getValue()){
            System.out.println("Kupiłeś auto na raty");
        } else System.out.println("Potrzebujesz zarobić więcej");
    }

    @Override
    public int hashCode() {
        return Objects.hash(formatter, date, firstName, lastName, age, isWorking, getSalary(), pet, car);
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

    @Override
    public String toString() {
        return "Human{" +
                "formatter=" + formatter +
                ", date=" + date +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isWorking=" + isWorking +
                ", salary=" + salary +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
