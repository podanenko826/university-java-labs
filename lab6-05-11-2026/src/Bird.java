public abstract class Bird extends Animal {
    private String featherColor;

    public Bird(int age, String name, double weight, String featherColor) {
        super(age, name, weight);

        this.featherColor = featherColor;
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
