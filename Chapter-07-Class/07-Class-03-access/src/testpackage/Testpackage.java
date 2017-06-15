package testpackage;
import aaccess.Aaccess;  //导入aaccess包中的Aaccess类

public class Testpackage {

	public static void main(String[] args) {
		Aaccess book = new Aaccess();
		// book.showName("123");  //将会提示报错
		//book.showName2("456");  //将会提示报错
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