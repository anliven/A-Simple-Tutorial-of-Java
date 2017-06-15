package afinalstatic;

public class Afinalstatic {
	final static double PI=3.1415926;  //定义静态常量
	public static void main(String[] args) {
		Circular cir = new Circular(3.0);
		Spherical sph = new Spherical(3.0);
	}

}

class Circular{  //定义类
	double radius;
	double area;
	public Circular(double i){  //定义类的构造方法
		this.radius = i;
		area=Afinalstatic.PI*radius*radius;
		System.out.println("圆的半径="+radius);
		System.out.println("圆的面积="+area);
	}
}

class Spherical{  //定义类
	double radius;
	double volume;
	public Spherical(double i){  //定义类的构造方法
		this.radius = i;
		volume=4/3*Afinalstatic.PI*radius*radius*radius;
		System.out.println("球的半径="+radius);
		System.out.println("球的体积="+volume);
	}
}



/*

### 静态常量
- 用final static修饰
- 静态常量名称必须大写
- 不可更改

*/