package athis;

public class Athis {
	String name="abc";
	
	public void showName(String name){  //注意：此时成员方法的参数名称与成员变量名称重复
		System.out.println("名称为："+name);
	}
	
	public void showName2(String name){  //注意：此时成员方法的参数名称与成员变量名称重复
		System.out.println("名称为："+this.name);  //使用this关键字可以调用类的成员变量
	}
	
	public static void main(String[] args) {
		Athis book = new Athis();
		book.showName("123");
		book.showName2("123");
	}

}

/*
### this关键字
在类中，this代表类本身的对象。
使用this关键字可以调用类的成员变量、成员方法和构造方法。
*/