package pers.anliven.learningjava.chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Externalizable 接口
class TestUser implements Externalizable {

	private String name;
	private int age;

	public TestUser() { // public无参构造方法
		System.out.println("none-arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
	}

	@Override
	public String toString() {
		return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

public class T07Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("tempFile.out"); // 创建文件

		ObjectOutputStream oosTest = new ObjectOutputStream(new FileOutputStream(file));
		TestUser user = new TestUser(); // 调用了被序列化类的无参构造方法
		user.setName("Anliven");
		user.setAge(29);
		oosTest.writeObject(user); // 将对象保存到文件
		oosTest.close();

		ObjectInputStream oisTest = new ObjectInputStream(new FileInputStream(file));
		TestUser newInstance = (TestUser) oisTest.readObject(); // 调用了被序列化类的无参构造方法   // 从文件读取对象
		oisTest.close();
		System.out.println(newInstance);

		file.delete(); // 删除文件

	}

}

/*### 基于Serializable接口的序列化
接口Externalizable继承于Serializable，使用序列化接口Externalizable之后，之前基于Serializable接口的序列化机制就将失效.
当使用Externalizable接口来进行序列化与反序列化时,需要开发人员重写writeExternal()与readExternal()方法.
如果使用Externalizable进行序列化，当读取对象时，会调用被序列化类的无参构造器去创建一个新的对象，然后再将被保存对象的字段的值分别填充到新对象中.

实现Externalizable接口的类必须要提供一个无参的构造函数，且它的访问权限为public.
如果没有无参数的构造函数，在运行时会抛出异常：java.io.InvalidClassException.*/