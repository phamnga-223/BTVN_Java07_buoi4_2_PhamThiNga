package baiTap;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		//B1: Nhập đơn hàng
		System.out.println("Xin vui lòng nhập đơn hàng: ");
		Scanner scan = new Scanner(System.in);
		String ten = scan.nextLine();
		double soLuong = scan.nextDouble();
		Long donGia = scan.nextLong();
		
		//B2: Kiểm tra
		if (soLuong < 0) {
			System.out.println("Số lượng nhập vào không hợp lệ!");
			return;
		}
		
		//B3: Tính số tiền phải trả:
		//1. Nếu mua số lượng từ 50-100 được giảm 8%
		//2. Mua với số lượng > 100 thì từ số lượng 100 trở đi được giảm 12%
		double giaTien = 0;
		double giaGiam1 = 0.08;
		double giaGiam2 = 0.12;
		if (soLuong >= 50 && soLuong <= 100) {
			giaTien = soLuong * donGia * (1-giaGiam1);
		} else if (soLuong > 100) {
			giaTien = ((soLuong - 99) * donGia * (1-giaGiam2)) + (99 * donGia);
		} else {
			giaTien = soLuong * donGia;
		}
		
		//B4: In kết quả
		String ketQua = "Giá tiền phải trả là: " + giaTien;
		System.out.println(ketQua);
	}
	
}
