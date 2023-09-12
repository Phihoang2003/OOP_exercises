package bai7;

public class ToaDo {
	private String name;
	private float x;
	private float y;
	public ToaDo() {
		
	}
	public ToaDo(String name,float x,float y) {
		setTen(name);
		setX(x);
		setY(y);
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public String getTen() {
		return name;
	}
	public void setX(float x) {
		this.x=x;
	}
	public void setY(float y) {
		this.y=y;
	}
	public void setTen(String name) {
		this.name=name;
	}
	public String toString() {
		return  name+"("+x+","+y+")";
	}
}
