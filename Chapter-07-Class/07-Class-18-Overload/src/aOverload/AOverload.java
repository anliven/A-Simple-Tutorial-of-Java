package aOverload;

public class AOverload {
	public static void main(String[] args) {
		Animal test = new Animal(); // 实例化对象，调用类的构造方法
		Animal test2 = new Animal("老虎"); // 实例化对象，调用类的构造方法
		Animal test3 = new Animal("老虎","大象","灰熊"); // 实例化对象，调用类的构造方法
	}
}

class Animal {
	public Animal() { // 构造方法
		System.out.println("调用构造方法一");
		System.out.println("我是动物");
	}
	public Animal(String myName) { // 有参数构造方法
		System.out.println("调用构造方法二");
		System.out.println("我是" + myName);
	}
	public Animal(String... i) { // 不定长参数构造方法
		System.out.println("调用构造方法三");
		for(String x:i){
			System.out.println("我是" + x);
		}
	}
	
}

/*

### 重载(Overload)
- 同一个类中同时存在多个同名方法，但每个同名方法的形参（参数类型、个数、顺序）或返回类型都不相同
- 也就是说，每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表
- 多用于构造器的重载
- 参数列表中可使用"..."形式定义不定长参数

- 编译器是利用方法名、参数类型、参数个数、参数顺序和返回类型来确定类中的方法是否唯一

*/
