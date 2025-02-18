import java.util.Scanner;

public class Lab2_Bai2PTB2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Nhap a,b,c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Kiem tra a==0
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            }
        } else {
            // tinh delta
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("Nghiệm x1 = " + x1);
                System.out.println("Nghiệm x2 = " + x2);
            }
        }
        
        scanner.close();

	}

}
