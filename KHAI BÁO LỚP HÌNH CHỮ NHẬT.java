package J04002;

import java.util.Scanner;

public class Rectange {
	private double width, height;
	private String color;
	Rectange(){
		this.height = 1;
		this.width = 1;
	}
	public Rectange(double width,double height,String color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeigth() {
		return height;
	}
	public void setHeigth(double heigth) {
		this.height = heigth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double findArea() {
		return this.height*this.width;
	}
	public double findPerimeter() {
		return (this.height+this.width)*2;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectange A = new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
		String s = A.getColor().toLowerCase();
		s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
		if(A.getWidth() > 0 && A.getHeigth() > 0)
            System.out.printf("%.0f %.0f %s", A.findPerimeter(), A.findArea(), s);
        else
            System.out.print("INVALID");
	}
}
