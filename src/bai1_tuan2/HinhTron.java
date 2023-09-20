package hinhhoc;
 public class  HinhTron {
    public static void main(String[] args) {
        // Sử dụng constructor đầy đủ tham số để khởi tạo đối tượng ToaDo
        ToaDo toaDo1 = new ToaDo(5, 10, "Điểm A");

        // Sử dụng getter để lấy thông tin tọa độ
        System.out.println("Tên tọa độ: " + toaDo1.getTen());
        System.out.println("Tọa độ x: " + toaDo1.getX());
        System.out.println("Tọa độ y: " + toaDo1.getY());

        // In ra thông tin tọa độ bằng phương thức toString
        System.out.println(toaDo1.toString());
    }
}
