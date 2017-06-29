package pers.anliven.learningjava.chapter11;

public class T01Exception {

	public static void main(String[] args) {
		
        int a = 5, b =0;  
        System.out.println(a/b); // 零不可以作为除数,抛出异常java.lang.ArithmeticException

	}

}

/*
 * 
 * ### 异常
 * 异常在Java语言中是作为类的实例出现的。
 * 当某一方法中发生错误时，这个方法会创建一个对象并且传递给正在运行的系统，这个对象就是异常对象。
 * 
 * java.lang.Throwable类是所有错误或异常的超类，有两个子类：java.lang.Error类和java.lang.Exception类。
 * 
 * java.lang.Error类用于指示合理的应用程序不应该试图捕获的严重问题。
 * 错误一般发生在严重故障时，Java程序通常不捕获错误。
 * 
 * java.lang.Exception类及其子类指出了合理的应用程序想要捕获的条件。
 * 两个主要的子类：IOException类和RuntimeException类。
 * 
 * 由于java.lang包是默认加载到所有的Java程序，所以大部分从异常类继承而来的异常都可以直接使用。
 * 
 * ### 分类 
 * 1.检查性异常（非运行异常）: 不处理编译不能通过 
 * 2.非检查性异常（运行时异常）: 不处理编译可以通过，如果有抛出直接抛到控制台
 * 
 * ### java.lang.ArithmeticException 
 * 当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。
 * 
 */
