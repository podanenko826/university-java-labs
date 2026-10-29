public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    abstract void eat();
    abstract String getVoice();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
