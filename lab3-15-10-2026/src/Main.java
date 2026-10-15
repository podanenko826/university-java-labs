import java.util.Random;

void main() {

    // TASK 3

//    Scanner scanner = new Scanner(System.in);
//
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    IO.println(String.format("The program calculates the roots of the equation ax^2+bx+c = 0."));
//
//    System.out.print("Enter the value of a (and press Enter): ");
//    float A = scanner.nextFloat();
//
//    if (A == 0) {
//        System.out.println("Value 0 is illegal ('a' cannot be 0).");
//        scanner.close();
//        return;
//    }
//
//    System.out.print("Enter the value of b (and press Enter): ");
//    float B = scanner.nextFloat();
//
//    System.out.print("Enter the value of c (and press Enter): ");
//    float C = scanner.nextFloat();
//
//    float delta = (B * B) - (4 * A * C);
//
//    int numberOfRoots;
//    if (delta > 0) {
//        numberOfRoots = 2;
//    } else if (delta == 0) {
//        numberOfRoots = 1;
//    } else {
//        numberOfRoots = 0;
//    }
//
//    float x1, x2;
//
//    switch (numberOfRoots) {
//        case 2:
//            x1 = (-B - (float) Math.sqrt(delta)) / (2 * A);
//            x2 = (-B + (float) Math.sqrt(delta)) / (2 * A);
//            System.out.printf("Two roots: x1 = %.2f, x2 = %.2f%n", x1, x2);
//            break;
//
//        case 1:
//            x1 = -B / (2 * A);
//            System.out.printf("One root: x1 = %.2f%n", x1);
//            break;
//
//        case 0:
//            System.out.println("No real roots (delta is negative).");
//            break;
//    }
//
//    scanner.close();

    // TASK 5

    Random random = new Random();

    int count = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    System.out.println("Drawn integers:");

    while (count < 10) {
        int current = random.nextInt(100) + 1;
        System.out.print(current + " ");

        if (current < min) {
            min = current;
        }

        if (current > max) {
            max = current;
        }

        count++;
    }

    System.out.println("\n");
    System.out.println("Smallest number: " + min);
    System.out.println("Largest number: " + max);
}
