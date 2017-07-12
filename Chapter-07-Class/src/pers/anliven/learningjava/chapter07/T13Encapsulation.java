package pers.anliven.learningjava.chapter07;

class EncapTest {
	private String name; // 设置私有属性，实现信息隐藏，只能本类访问，其他类都无法访问
	private int age;

	public int getAge() { // 创建成员变量age的取值方法
		return age;
	}

	public String getName() { // 创建成员变量name的取值方法
		return name;
	}

	public void setAge(int newAge) { // 创建成员变量name的赋值方法
		age = newAge;
	}

	public void setName(String name) { // 创建成员变量name的赋值方法
		this.name = name; // 使用this关键字调用类的成员变量name,解决同名冲突
	}
}

public class T13Encapsulation {
	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setName("Anliven");
		encap.setAge(29);
		System.out.print("Name: " + encap.getName() + "\n" + "Age: " + encap.getAge());
	}

}

/*### 封装（Encapsulation）
通过封装可以隐藏实现细节，防止代码和数据被外部类定义的代码随机访问。
合理的封装能够减少耦合，精确控制成员变量，让代码容易理解与维护，也加强了安全性。
封装后，可以只关注修改实现代码，而不用修改相关调用代码。

### 实现封装的步骤
1. 修改属性的可见性来限制对属性的访问（一般限制为private，只能本类访问）。
2. 对每个值属性提供对外的公共方法访问（创建一对赋取值方法，用于对私有属性的访问）。*/