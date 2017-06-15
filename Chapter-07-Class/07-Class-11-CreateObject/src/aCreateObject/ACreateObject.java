package aCreateObject;

public class ACreateObject {
	
	String str = "abcdef";  
	//特殊例子：没有用new关键字创建字符串对象
	//Java虚拟机在创建字符串对象的同时会创建一个匿名的字符串对象，交给str使用
	
	public ACreateObject(){  //定义构造方法
		System.out.println("创建对象");
	}
	
	public String getStr(){  //定义成员方法
		return this.str;
	}
	
	public static void main(String[] args) {
		new ACreateObject();  //使用new关键字调用构造方法创建对象
		
		ACreateObject test = new ACreateObject();  
		//ACreateObject --- 类
		//test --- 对象实体的引用（只是存放一个对象的内存地址）
		//new ACreateObject("hello") --- 对象实体
		System.out.println(test.getStr());
		System.out.println(new ACreateObject().getStr());
		//严格意义上，引用和对象是不同的；但实际使用上可以忽略这种区别
	}

}


/*

### 创建对象
- 使用new关键字调用构造方法创建对象
- 严格意义上，引用和对象是不同的；但实际使用上可以忽略这种区别

### 对象的销毁
- 对象的生命周期结束时，分配给该对象的内存地址将会被回收
- Java拥有完整的垃圾回收机制，回收器将处理由new操作符创建的对象，回收无用的但占用内存的资源
- Object类的finalize()方法回收非new操作符创建的对象
- 垃圾回收不受人为控制，具体执行时间不确定，可以通过System.gc()方法强制启动垃圾回收器

*/