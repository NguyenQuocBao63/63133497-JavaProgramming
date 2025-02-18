import java.util.Scanner;

public class Lab2_Bai4 {

	public static void main(String[] args) {
		menu();
    }
    
    //  menu
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hien thi menu
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.print("Chọn chức năng: ");
            
            choice = scanner.nextInt();
            
            // Chon chuc nang
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            
        } while (choice != 4);

        scanner.close();
    }
    
    // PTBN
    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b != 0) {
                double x = -b / a;
                System.out.println("Phương trình có nghiệm: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm: x = " + x);
        }
    }
    
    // PTB2
    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

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
    }

    // Tinh tien dien
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        double soDien = scanner.nextDouble();

        double tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Số tiền điện phải trả là: " + tien + " VND");

	}

}
