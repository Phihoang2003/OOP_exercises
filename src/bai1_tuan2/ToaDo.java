package hinhhoc;
public class ToaDo {
    private int x;
    private int y;
    private String ten;

    // Constructor mặc định
    public ToaDo() {
        this.x = 0;
        this.y = 0;
        this.ten = "Không xác định";
    }

    // Constructor đầy đủ tham số
    public ToaDo(int x, int y, String ten) {
        this.x = x;
        this.y = y;
        this.ten = ten;
    }

    // Phương thức set tọa độ x
    public void setX(int x) {
        this.x = x;
    }

    // Phương thức get tọa độ x
    public int getX() {
        return x;
    }

    // Phương thức set tọa độ y
    public void setY(int y) {
        this.y = y;
    }

    // Phương thức get tọa độ y
    public int getY() {
        return y;
    }

    // Phương thức set tên tọa độ
    public void setTen(String ten) {
        this.ten = ten;
    }

    // Phương thức get tên tọa độ
    public String getTen() {
        return ten;
    }

    // Phương thức toString trả về thông tin tọa độ
    @Override
    public String toString() {
        return ten + "(" + x + "," + y + ")";
    }
}
