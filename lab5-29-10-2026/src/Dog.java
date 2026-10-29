public class Dog extends Mammal {
    private boolean hasTag;

    public Dog(int age, String name, double weight, boolean hasTag) {
        super(age, name, weight);

        this.hasTag = hasTag;
    }

    @Override
    public String getVoice() {
        return "Bark";
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public String toString() {
        return "Blowfish info:\n" +
                "  Age: " + getAge() + "\n" +
                "  Name: " + getName() + "\n" +
                "  Weight: " + getWeight() + "\n" +
                "  Tag: " + hasTag + "\n";
    }

    public boolean getTag() {
        return hasTag;
    }

    public void setTag(boolean newHasTag) {
        this.hasTag = newHasTag;
    }
}
