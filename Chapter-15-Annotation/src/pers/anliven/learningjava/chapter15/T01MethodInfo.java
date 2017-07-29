package pers.anliven.learningjava.chapter15;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)

public @interface T01MethodInfo {
	String author() default "Anliven";

	String date();

	int revision() default 1;

	String comments();
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
- ElementType.LOCAL_VARIABLE：可用来注解局部变量*/