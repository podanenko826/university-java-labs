public class Blowfish extends Fish implements AnimalBehaviour {
    private float diameter;

    public Blowfish(int age, String name, double weight, float diameter) {
        super(age, name, weight);

        this.diameter = diameter;
    }

    public void sleep() {
        System.out.println("Blowfish sleeps");
    }

    public void move() {
        System.out.println("Blowfish swims in ocean");
    }

    @Override
    public void eat() {
        System.out.println("Blowfish eats");
    }

    @Override
    public String getVoice() {
        return "Blowfish makes no sound";
    }

    @Override
    public String toString() {
        return "Blowfish info:\n" +
                "  Age: " + getAge() + "\n" +
                "  Name: " + getName() + "\n" +
                "  Weight: " + getWeight() + "\n" +
                "  Diameter: " + diameter + "\n";
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
