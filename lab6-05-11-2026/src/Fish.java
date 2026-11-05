public abstract class Fish extends Animal {
    public Fish(int age, String name, double weight) {
        super(age, name, weight);
    }

    @Override
    public void move() {
        System.out.println("Fish swims");
    }
}
