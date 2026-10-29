public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Blowfish(1, "Nemo", 0.5, 50);
        animals[1] = new Dog(7, "Jack", 10.5, true);
        animals[2] = new Pigeon(2, "Birdy", 1.5, "darkblue", "blue pigeon");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal #" + i);
            System.out.println(animals[i].toString());
            animals[i].eat();
            System.out.println(animals[i].getVoice());
        }
    }
}