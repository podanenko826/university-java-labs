public abstract class Mammal extends Animal {
    public Mammal(int age, String name, double weight) {
        super(age, name, weight);
    }

    @Override
    public void move() {
        System.out.println("Mammal walks");
    }
}
