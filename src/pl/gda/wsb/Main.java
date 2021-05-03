package pl.gda.wsb;

import pl.gda.wsb.device.Car;
import pl.gda.wsb.device.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello word");

        Animal animal1 = new Animal("Kot","Mruczek", 3, 5.0);
        Animal animal2 = new Animal("Pies","Burek", 2, 13.0);

        Car car1 = new Car("Astra",Producer.VOLKSWAGEN, 1990);
        Car car2 = new Car("Megan", Producer.SKODA, 2000);


        Human human1 = new Human("Basia", "Król", 23,true, 3400.0, animal1,car1);
        Human human2 = new Human( "Kasia", "Lew", 23, true, 4000.0,animal2,car2);
        Human human3 = new Human("Ala", "Kot",25, true, 5000.0,animal2, car2);
        Human human4 = new Human( "Ewa", "Pik", 45, true, 6000.0,animal2, car2);


        System.out.println(human1);
        System.out.println("Human" + human1.firstName + " ");

        Phone phone1 = new Phone("Samsung", 2020,"android");
        Phone phone2 = new Phone("Microsoft",2021,"Android");

        if(animal1.getWeight() > animal2.getWeight()){
            System.out.println("Zwierz o imieniu: " + animal1.name + "jest cieższy, waży: " + animal1.getWeight());
        } else {
            System.out.println("Zwierz o imieniu: " + animal2.name + "jest cieższy, waży: " + animal2.getWeight());
        }

        if(animal1.getAge() > animal2.getAge()){
            System.out.println("Zwierz o imieniu: " + animal1.name + "jego wiek " + animal1.getAge());
        } else{
            System.out.println("Zwierz o imieniu: " + animal2.name + "jego wiek " + animal2.getAge());
        }

        System.out.println("\n-----------------\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);
        humansList.add(human4);

        for (Human human : humansList ){
            System.out.println(human.lastName);
        }

        animal1.feed();
        animal2.feed();
        animal1.takeForWalk();
        animal2.takeForWalk();

        System.out.println("\n-----------------\n");

        human1.pet = animal1;
        human1.car = car1;
        System.out.println(human1.firstName + " " + human1.lastName + "ma: \npet:" + human1.pet + human1.pet.name);
        System.out.println(human1.firstName + " " + human1.lastName + "ma: \ncar:" + human1.car.producer + human1.car.model);

        human1.getSalary();
        human1.setSalary(22222.0);
    }
}
