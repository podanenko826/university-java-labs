//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Car {

    private String model;
    private String brand;
    private int year;
    private float price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, float price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setModel(String newModel) {
        model = newModel;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public void setPrice(float newPrice) {
        price = newPrice;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }


    public void delivery() {
        quantity++;
    }

    public void sell(float money) {
        if (money >= price) {
            System.out.println("The car is sold!");
            quantity--;
        } else {
            System.out.println("No enough money!");
        }
    }

    @Override
    public String toString() {
        return "Car description:\n" +
                "  Brand: " + brand + "\n" +
                "  Model: " + model + "\n" +
                "  Year: " + year + "\n" +
                "  Price: " + price + " €" + "\n" +
                "  Color: " + color + "\n" +
                "  Quantity: " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Car denisCar = new Car("Passat B8", "VolksWagen", 2019, 20000, "white", 10);

        String carInfo = denisCar.toString();
        System.out.println(carInfo);

        denisCar.sell(21000);

        System.out.println("brand: " + denisCar.getBrand());
        System.out.println("color: " + denisCar.getColor());
        System.out.println("model: " + denisCar.getModel());
        System.out.println("price: " + denisCar.getPrice());
        System.out.println("quantity: " + denisCar.getQuantity());
        System.out.println("year: " + denisCar.getYear());


        denisCar.setColor("black");
        denisCar.setYear(2024);
        denisCar.setModel("T-Roc");

        carInfo = denisCar.toString();
        System.out.println(carInfo);
    }
}
