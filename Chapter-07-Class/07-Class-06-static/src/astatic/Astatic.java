package astatic;

public class Astatic {
	static public int money = 60;
	
	public void cost(int i){
		if(money>=80){
			money = money - i;
		}else{
			System.out.println("财务风险");
		}
	}
	
	public void earn(int i){
		money += i;
	}
	
	static int x;  //同一个类的不同实例对象，共用同一静态变量，如果一个对象将其更改，另一个对象的静态变量也会更改。
	int y;
	public void others(int x, int y){
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Astatic inlet = new Astatic();
		Astatic outlet = new Astatic();
		inlet.earn(100);
		outlet.cost(40);
		System.out.println("当前剩余金额："+Astatic.money+"万");
		
		Astatic a = new Astatic();
		Astatic b = new Astatic();
		a.others(1, 2);
		b.others(100, 200);
		System.out.println("a.x的值："+a.x);
		System.out.println("a.y的值："+a.y);
		System.out.println("b.x的值："+b.x);
		System.out.println("b.y的值："+b.y);
	}

}

/*

### 静态修饰符static
- 用static关键字修饰的代码，被称为静态成员，存放在内存的“静态区(内存公共区)”中，和整个程序的生存周期相同。
- 静态成员提供共享数据和方法。
- 使用“类名.静态成员”的方式调用静态成员。
- 不建议使用“对象.静态类成员”的方式调用静态成员，容易混淆静态成员和非静态成员。
- 静态成员遵循private、protected和public关键字的约束。

### 静态变量
- 用static关键字修饰。
- 类的静态变量可以被类的所有对象共享。
- 同一个类的不同实例对象，共用同一静态变量，如果一个对象将其更改，另一个对象的静态变量也会更改。

*/