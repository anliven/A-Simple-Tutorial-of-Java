package pers.anliven.learningjava.chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

enum Gender {
	MALE, FEMALE
}

// Serializable 接口
class TestPerson implements Serializable {

	private static final long serialVersionUID = 1L; // 在Eclipse下,生成了固定1L的序列化ID

	private String name = null;
	transient private Integer age = null; // 声明为transient后，默认序列化机制就会忽略该字段
	private Gender gender = null;

	public TestPerson() {
		System.out.println("none-arg constructor");
	}

	public TestPerson(String name, Integer age, Gender gender) { // 构造方法
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + gender + "]";
	}
}

public class T06Serialization {

	public static void main(String[] args) throws Exception {
		
		File file = new File("testPerson.out"); // 创建文件

		ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
		TestPerson person = new TestPerson("John", 31, Gender.MALE);
		oout.writeObject(person); // 将person对象保存到文件testPerson.out
		oout.close();


		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
		Object newPerson = oin.readObject(); // 读取testPerson.out文件中保存的Person对象
		oin.close();
		System.out.println(newPerson);
		
		file.delete(); // 删除文件
	}

}

/*### 序列化(Serialization) 
创建的Java对象都是存在于JVM的堆内存中.一旦JVM停止运行,对象也就不复存在.
对象序列化（Object Serialization）是Java语言内建的一种对象持久化方式.
通过对象序列化，可以把对象的状态保存为字节数组，并且可以在有需要的时候将这个字节数组通过反序列化的方式再转换成对象,这样就能够在JVM中的活动对象和字节数组（流）之间进行转换.
必须注意:对象序列化保存的是对象的"状态"，即它的成员变量。对象序列化不会关注类中的静态变量。

序列化是将对象的状态信息转换为可以存储或传输的形式的过程.
与序列化相反的过程,称为反序列化.

对象的序列化与反序列化被广泛应用到RMI(远程方法调用)及网络传输中.
Java对象通过网络进行传输时,因为数据只能够以二进制的形式在网络中进行传输，因此当把对象通过网络发送出去之前需要先序列化成二进制数据，在接收端读到二进制数据之后反序列化成Java对象.
字节或XML编码格式可以还原完全相等的对象.

一般使用ObjectOutputStream的writeObject方法把一个对象进行持久化,再使用ObjectInputStream的readObject从持久化存储中把对象读取出来。


### 相关接口及类
支持Java对象序列化及反序列化的接口和类：
- java.io.Serializable
- java.io.Externalizable
- 接口 ObjectOutput
- 接口 ObjectInput
- java.io.ObjectOutputStream
- java.io.ObjectInputStream


### Serializable接口
类通过实现java.io.Serializable接口以启用其序列化功能.
未实现Serializable接口的类将无法使其任何状态序列化或反序列化.
可序列化类的所有子类型本身都是可序列化的.
序列化接口没有方法或字段，仅用于标识可序列化的语义.

如果序列化对象时,遇到不支持Serializable接口的对象,将抛出NotSerializableException.
如果被写对象的类型是String，或数组，或Enum，或Serializable，那么就可以对该对象进行序列化，否则将抛出NotSerializableException.


### 默认序列化
如果仅仅只是让某个类实现Serializable接口，而没有其它任何处理的话，则就是使用默认序列化机制.
使用默认机制，在序列化对象时，不仅会序列化当前对象本身，还会对该对象引用的其它对象也进行序列化，同样地，这些其它对象引用的另外对象也将被序列化，以此类推.
所以，如果一个对象包含的成员变量是容器类对象，而这些容器所含有的元素也是容器类对象，那么这个序列化的过程就会较复杂，开销也较大.


### transient关键字
当某个字段被声明为transient后，默认序列化机制就会忽略该字段.


### 基于Serializable接口的序列化
接口Externalizable继承于Serializable，使用序列化接口Externalizable之后，之前基于Serializable接口的序列化机制就将失效.
当使用Externalizable接口来进行序列化与反序列化时,需要开发人员重写writeExternal()与readExternal()方法.
如果使用Externalizable进行序列化，当读取对象时，会调用被序列化类的无参构造器去创建一个新的对象，然后再将被保存对象的字段的值分别填充到新对象中.

实现Externalizable接口的类必须要提供一个无参的构造方法，且它的访问权限为public.
如果没有无参数的构造函数，在运行时会抛出异常：java.io.InvalidClassException.


### 序列化ID(serialVersionUID)
虚拟机是否允许反序列化，不仅取决于类路径和功能代码是否一致，还取决于两个类的序列化ID是否一致(private static final long serialVersionUID)

序列化ID在Eclipse下提供了两种生成策略，一个是固定的 1L，一个是随机生成一个不重复的 long 类型数据（实际上是使用JDK工具生成）.
如果没有特殊需求，使用默认的 1L 即可，可以确保代码一致时反序列化成功.*/
