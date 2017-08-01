package pers.anliven.learningjava.practices07;

public class P0702 {

	private float height;
	private float width;

	public P0702(float height, float width) {
		this.height = height;
		this.width = width;
	}

	public float square() {
		return height * width;
	}

	public static void main(String args[]) {
		P0702 rectangle = new P0702(3.5f, 4.5f);
		System.out.println("矩形的面积：" + rectangle.square());
	}

}

// 编写一个类：
// 将矩形的长和宽作为该类的属性，并在构造方法中初始化；定义一个矩形方法求矩形的面积。