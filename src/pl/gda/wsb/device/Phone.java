package pl.gda.wsb.device;

public class Phone {

    String producer;
    Integer year;
    String system;


    public Phone (String producer, Integer year, String system){
        this.producer = producer;
        this.year = year;
        this.system = system;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", system='" + system + '\'' +
                '}';
    }
}
