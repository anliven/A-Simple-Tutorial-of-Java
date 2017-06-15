package aconstructor05;

public class Aconstructor05 {

	private Aconstructor05(){  //私有构造方法：private修饰构造方法
		System.out.println("调用私有构造方法");
	}
	
	static public Aconstructor05 mytest(){  //创建静态方法，返回本类实例对象
		return new Aconstructor05();
	}
	
	public static void main(String[] args) {
		Aconstructor05 test=new Aconstructor05();
		Aconstructor05 test2=Aconstructor05.mytest();
	}


}

/*

### 私有构造方法
- 使用private关键字修饰的构造方法
- 无法在本类外部使用,也就无法使用new关键字实例化
- 可用来控制对象的生成

*/