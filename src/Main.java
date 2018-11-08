import java.util.Scanner;

/**
 * Created by Roman on 29.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Car mersedes = new Car(2000, 300, "mersedes");
        Car bentli = new Car(2010, 500, "bentli");
        Car mazda = new Car(2006, 350, "mazda");
        Car honda = new Car(2015, 400, "honda");

        honda.toString();
        Car[] car = {mersedes, bentli, mazda, honda};

        Scanner in = new Scanner(System.in);
        System.out.println("Input year:");
        int year = in.nextInt();

        mazda.toString();
        for (int i=0; i < car.length; i++) {
            if (car[i].getYear() == year) {
                System.out.println(car[i]);
            }
        }
    }
}
