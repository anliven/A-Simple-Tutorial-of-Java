package aconstructor04;

public class Aconstructor04 {
	
	public Aconstructor04(){
		System.out.println("调用无参数构造方法");
	}
	
	public Aconstructor04(int x){
		System.out.println("调用有参数构造方法，参数值为："+x);
	}
	
	public static void main(String[] args) {
		Aconstructor04 test=new Aconstructor04();
		Aconstructor04 test2=new Aconstructor04(123);
	}

}

/*
### 构造方法
- 与类同名，完成对象的创建和初始化
- 没有返回值，并且不需要使用void关键字修饰
- 一个类中可以存在多个构造方法

- 实例化一个类的对象时，类会自动调用构造方法
- 在构造方法中可以为成员变量赋值

- 如果没有定义构造方法，编译器会自动创建一个默认无参数的构造方法
- 如果已经定义了有参数的构造方法，那么创建对象时，就必须输入参数

*/