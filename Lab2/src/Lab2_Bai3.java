import java.util.Scanner;

public class Lab2_Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        //nhap
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        double soDien = scanner.nextDouble();

        double tien;

        // tinh tien dien
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        //ketqua
        System.out.println("Số tiền điện phải trả là: " + tien + " VND");

        scanner.close();

	}

}
