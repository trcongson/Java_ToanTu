import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("width: ");
        width = sc.nextFloat();

        System.out.println("height: ");
        height = sc.nextFloat();

        float area = width*height;
        System.out.println("Aera = " + area);
    }
}
