package aaccess;

public class Aaccess {

	private void showName(String name){  //使用private关键字限定对类成员方法的访问
		System.out.println("名称为："+name);
	}
	
	protected void showName2(String name){  //使用protected关键字限定对类成员方法的访问
		System.out.println("名称为："+name); 
	}
	
	public void showName3(String name){  //使用public关键字限定对类成员方法的访问
		System.out.println("名称为："+name);
	}
	
	public static void main(String[] args) {
		Aaccess book = new Aaccess();
		book.showName("123");
		book.showName2("456");
		book.showName3("789");
	}

}

/*

### 权限修饰符
使用private、protected和public关键字限定对类、类的成员变量、成员方法的访问。
- private ： 本类
- protected ：本类、同包其他类或子类
- public ：本类、同包其他类或子类、其他包的类或子类

*/