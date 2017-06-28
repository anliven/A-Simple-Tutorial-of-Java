package pers.anliven.learningjava.chapter07;

public class T07Main {

	public static void main(String[] args) { // 定义主方法

		System.out.println("参数的个数：" + args.length);

		for (String x : args) {
			System.out.println("分别为：" + x);
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println("分别为：" + args[i]);
		}

	}

}

/*
 * 
 * ### 主方法体 
 * public：公有的；main方法是在程序启动时由java虚拟机调用的，所以要声明为public
 * static: 静态的；这样声明无需生成对象实例便可由java虚拟机直接调用 
 * void：无任何返回值 - main:方法名；
 * String[] args：命令行参数
 * 
 * ### 主方法 
 * 是类的入口点，定义程序从何处开始。
 * 提供对程序流程的控制，编译器通过主方法来执行程序
 * 
 * 主方法是静态的 
 * 在主方法中只能调用静态方法 
 * 不是静态的方法必须创建对象的实例
 * 
 * 主方法没有任何返回值
 * 主方法的形参为数组 - args[0]~args[n]分别代表程序的第一个参数到第n个参数 
 * 使用args.length获取参数的个数
 * 
 * main()方法可以重载、继承和被其他方法调用
 * 
 * ### 在Eclipse中设置主方法的形参 
 * 1. 选择项目，鼠标右键 
 * 2. ---》Run As---》Run Configurations---》选择对应的Java Application文件
 * 3. ---》右侧窗口的Argumnets---》Program Arguments---》填写内容并保存
 * 
 */