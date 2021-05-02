package pl.gda.wsb;


public class Animal {

    static boolean isAlive = true;
    final String species;
    String name;
    Integer age;
    private Double weight;

    public Animal(final String species, String name, Integer age, Double weight){
        this.species = species;
        this.name = name;
        this.age = age;
        this.weight = weight;


        if (species == "pies") this.weight = 40.0;
        else if (species == "kot") this.weight = 6.0;
        else if (species == "chomik") this.weight = 0.03;
    }

    public static boolean isItAlive(){
        return isAlive;
    }

    public Double getWeight(){
        return weight;
    }

    public Integer getAge(){
        return age;
    }

    void feed(){
        if (this.weight > 0){
            this.weight++;
        } else System.out.println("Zwierz" + this.name + "zmarł!");
    }

    void takeForWalk(){
        if (this.weight > 0){
            this.weight--;
        } else System.out.println("Zwierz" + this.name + "zmarł!");
    }


}
