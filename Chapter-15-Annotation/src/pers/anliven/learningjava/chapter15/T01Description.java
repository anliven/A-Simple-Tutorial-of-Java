package pers.anliven.learningjava.chapter15;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented

public @interface T01Description {
	String desc();

	String author();

	int age() default 18;
}

/*### 自定义注解
- 使用@interface关键字定义注解
- 只能使用public和abstract修饰注解，缺省为public
- 注解本身能够包含元注解，元注解是注解的注解

- 注解方法必须以无参数无异常的方式声明，也就是说所有的注解方法均没有方法体和异常抛出
- 注解可以没有注解方法，没有注解方法的注解称为标识注解
- 如果注解只有一个注解方法，则方法名必须取名为value(),在使用时可以忽略成员名和“=”

- 注解方法返回值类型限定为：基本类型、String、Enums、Annotation或者是这些类型的一维数组
- 可以使用default为注解方法指定默认返回值*/
