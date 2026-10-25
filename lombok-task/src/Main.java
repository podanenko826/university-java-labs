import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
class CarWithLombok {
    private String model;

    @EqualsAndHashCode.Include
    private String brand;

    private int year;
    private int price;
    private String color;
    private int quantity;
}

class CarDemoWithLombok {
    public static void main(String[] args) {

        CarWithLombok CarWithLombok1 = new CarWithLombok("Passat B8", "VolksWagen", 2019, 20_000, "white", 5);
        CarWithLombok CarWithLombok2 = new CarWithLombok("T-Roc", "VolksWagen", 2024, 18_000, "silver", 7);

        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);

        System.out.println(CarWithLombok1.getColor());

        int year = CarWithLombok1.getYear();
        CarWithLombok1.setColor("black");

        System.out.println("Are these objects equal? " + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HashCode of this object is: " + CarWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: " + CarWithLombok1.hashCode());
    }
}