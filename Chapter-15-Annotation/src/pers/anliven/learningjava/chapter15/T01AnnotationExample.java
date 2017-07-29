package pers.anliven.learningjava.chapter15;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class T01AnnotationExample {


	public static void main(String[] args) {

		T01AnnotationExample test = new T01AnnotationExample();

		System.out.println(test.toString());

		test.oldMethod();

		try {
			test.genericsTest();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	@T01MethodInfo(author = "Anliven", comments = "Main method", date = "2016", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@T01MethodInfo(comments = "deprecated method", date = "2016")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@T01MethodInfo(author = "Anliven", comments = "Main method", date = "2016", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List testList = new ArrayList();
		testList.add("test");
		oldMethod();
	}
}

/*### 注解（Annotation）
用来描述源代码的特殊修饰符，应用在类、方法、参数、变量、构造器及包声明中。简而言之，注解是用来描述解释Java代码的代码。
使用注解可以向编译器做特定的解释说明,能够有效避免重复的工作，让代码清晰简洁。
当前许多java框架中大量使用注解，例如Spring等，来避免一些重复的工作。
java.lang.annotation包为注解提供支持。


### 元注解
用来描述注解的注解,称为原注解。元注解都能够保留到运行时。

@Documented –- 注解是否包含可以被Javadoc等工具文档化

@Inherited –- 是否允许子类自动继承该注解

@Retention –该注解被保留的时间范围。取值类型为枚举类型。
- RetentionPolicy.SOURCE：表示在编译时这个注解会被移除，不会包含在编译后产生的class字节码文件中。
- RetentionPolicy.CLASS：表示这个注解会被包含在class字节码文件中，但在运行时会被移除。默认使用。
- RetentionPolicy.RUNTIME：表示这个注解始终不会丢弃，运行期也保留该注解，可以在运行时通过反射解析这个注解。自定义的注解通常使用这种方式。

@Target -- 该注解的应用范围（可以用来注解哪些程序元素）。如果没有@Target，那么该注解可以应用于任何程序元素。取值类型为枚举类型。
- ElementType.TYPE：表示可以用来注解类、接口、注解类型或枚举类型
- ElementType.PACKAGE：可以用来注解包
- ElementType.PARAMETER：可以用来注解参数
- ElementType.ANNOTATION_TYPE：可以用来注解 注解类型
- ElementType.METHOD：可以用来注解方法
- ElementType.FIELD：可以用来注解属性（包括枚举常量）
- ElementType.CONSTRUCTOR：可以用来注解构造器
- ElementType.LOCAL_VARIABLE：可用来注解局部变量


### 内建注解
@Override -- 告知编译器将要复写父类中的方法,当父类中的方法移除或者发生更改时编译器将提示错误信息。

@Deprecated -- 告知编译器被修饰的程序元素已被“废弃”,不建议使用。建议注明不推荐使用的原因以及替代的方法。

@SuppressWarnings -- 告知编译器忽略特定的警告信息。此注解仅在源文件中有效,在编译后的class文件中便不再存在。取值类型为Sring[]类型。
- deprecation：忽略使用了废弃的类或方法时的警告
- unchecked：执行了未检查的转换
- fallthrough：swich语句款中case忘加break从而直接“落入”下一个case
- path：类路径或原文件路径等不存在
- serial：可序列化的类缺少serialVersionUID
- finally：存在不能正常执行的finally子句
- all：以上所有情况产生的警告均忽略


### 自定义注解
- 使用@interface关键字定义注解
- 只能使用public和abstract修饰注解，缺省为public
- 注解本身能够包含元注解，元注解是注解的注解

- 注解方法必须以无参数无异常的方式声明，也就是说所有的注解方法均没有方法体和异常抛出
- 注解可以没有注解方法，没有注解方法的注解称为标识注解
- 如果注解只有一个注解方法，则方法名必须取名为value(),在使用时可以忽略成员名和“=”

- 注解方法返回值类型限定为：基本类型、String、Enums、Annotation或者是这些类型的一维数组
- 可以使用default为注解方法指定默认返回值*/
