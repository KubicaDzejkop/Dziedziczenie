package pl.gornik.animal;

public class Animal {
    private String name;
    private double weight;
    private char size;

    public Animal(String name, double weight, char size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public char getSize() {
        return size;
    }
}
