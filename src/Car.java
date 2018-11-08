/**
 * Created by Roman on 29.10.2018.
 */
public class Car {
    private int year;
    private int capacityEngine;
    private String name;

    public Car(int year, int capacityEngine, String name) {
        this.year = year;
        this.capacityEngine = capacityEngine;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public int getCapacityEngine() {
        return capacityEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", capacityEngine=" + capacityEngine +
                ", name='" + name + '\'' +
                '}';
    }
}
