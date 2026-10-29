public class Pigeon extends Bird {
    private String species;

    public Pigeon(int age, String name, double weight, String featherColor, String species) {
        super(age, name, weight, featherColor);

        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon eats");
    }

    @Override
    public String getVoice() {
        return "Pigeon sounds";
    }

    @Override
    public String toString() {
        return "Blowfish info:\n" +
                "  Age: " + getAge() + "\n" +
                "  Name: " + getName() + "\n" +
                "  Weight: " + getWeight() + "\n" +
                "  Species: " + species + "\n";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
