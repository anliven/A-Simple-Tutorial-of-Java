package aconstructor05;

public class Atest {

	public static void main(String[] args) {
		//Aconstructor05 test=new Aconstructor05();  //无法在本类外部使用，将会提示报错。
		Aconstructor05 test3=Aconstructor05.mytest();
	}

}

/*
### 私有构造方法
- 使用private关键字修饰的构造方法
- 无法在本类外部使用,也就无法使用new关键字实例化
- 可用来控制对象的生成
*/