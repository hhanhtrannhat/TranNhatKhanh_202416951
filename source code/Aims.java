public class Aims {
    public static void main(String[] args){
        // 1. Khởi tạo giỏ hàng (Sửa 'cart' thành 'Cart' viết hoa)
        cart c1 = new cart();

        // 2. Tạo các đối tượng đĩa
        DigitalVideoDisc disc = new DigitalVideoDisc("ko loi");
        // Sửa lại chuẩn camelCase và lỗi dư chữ 't'
        disc.settittle("ko loi");
        disc.setcategory("indie");
        disc.setcost(99.0f); // Thêm chữ 'f' để Java hiểu đây là số thực (float)
        disc.setlength(99);
        disc.setdirector("j97");

        DigitalVideoDisc disc1 = new DigitalVideoDisc("loi");
        disc1.settittle("loi");
        disc1.setcategory("indie");
        disc1.setcost(99.0f);
        disc1.setlength(99);
        disc1.setdirector("j97");

        // 3. Test thêm đĩa và tính tiền
        System.out.println("--- TEST THÊM ĐĨA BÌNH THƯỜNG ---");
        c1.addDigitalVideoDisc(disc);
        c1.addDigitalVideoDisc(disc1);
        System.out.println("quantity is " + c1.qnt()); 
        // Phải đưa vào System.out.println thì mới xem được kết quả tính tiền
        System.out.println(c1.totalcost());

        // 4. Test xóa đĩa
        System.out.println("\n--- TEST XÓA ĐĨA ---");
        c1.removeDigitalVideoDisc(disc1);
        System.out.println("quantity is " + c1.qnt());
        System.out.println(c1.totalcost());

        // 5. TEST THÊM QUÁ GIỚI HẠN (20 ĐĨA)
        System.out.println("\n--- TEST VƯỢT GIỚI HẠN GIỎ HÀNG ---");
        // Tạo một đĩa mẫu để test
        DigitalVideoDisc sampleDisc = new DigitalVideoDisc("Test Limit");
        
        // Hiện tại giỏ đang có 1 đĩa (vì ban đầu thêm 2, xóa 1), 
        // Giờ ta lặp 21 lần thêm đĩa mới vào để ép nó vượt mốc 20
        for (int i = 1; i <= 19; i++) {
            System.out.print("loop " + i + " -> ");
            c1.addDigitalVideoDisc(sampleDisc);
        }
        System.out.println(c1.totalcost());
    }
}