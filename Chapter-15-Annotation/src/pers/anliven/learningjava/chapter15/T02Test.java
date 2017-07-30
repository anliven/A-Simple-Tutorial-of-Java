package pers.anliven.learningjava.chapter15;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class T02Test {

	public static void main(String[] args) {

		try {
			Class<?> c = Class.forName("pers.anliven.learningjava.chapter15.T02Child"); // 使用类加载器加载类
			boolean isExist = c.isAnnotationPresent(T02Description.class); // 判断注解是否存在
			if (isExist) { // 解析注解
				T02Description d = (T02Description) c.getAnnotation(T02Description.class);
				System.out.println(d.value());
			}

			Method[] ms = c.getMethods(); // 获取所有的方法
			// 遍历所有的方法
			for (Method m : ms) {
				boolean isExist1 = m.isAnnotationPresent(T02Description.class);
				if (isExist1) {
					T02Description d1 = m.getAnnotation(T02Description.class);
					System.out.println(d1.value());
				}
			}

			// 另一种解析方法
			for (Method m : ms) { // 拿到方法上的所有的注解
				Annotation[] as = m.getAnnotations();
				for (Annotation a : as) { // 用二元操作符判断a是否是Description的实例
					if (a instanceof T02Description) {
						T02Description d = (T02Description) a;
						System.out.println(d.value());
					}
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

// 解析注解
// 通过反射获取类 、函数或成员上的运行时注解信息，从而实现动态控制程序运行的逻辑。
