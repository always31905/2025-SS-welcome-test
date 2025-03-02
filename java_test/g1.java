package java_test;
import java.util.Scanner;

class Fan {
    private String model;
    private int price;

    public Fan() {}

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class g1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fan[] fans = new Fan[3];

        for (int i = 0; i < 3; i++) {
            fans[i] = new Fan();
            fans[i].setModel(sc.next());
            fans[i].setPrice(sc.nextInt());
        }

        sc.close();

        Fan cheapestFan = fans[0];
        for (int i = 1; i < 3; i++) {
            if (fans[i].getPrice() < cheapestFan.getPrice()) {
                cheapestFan = fans[i];
            }
        }

        System.out.println(cheapestFan.getModel());

    }

}
