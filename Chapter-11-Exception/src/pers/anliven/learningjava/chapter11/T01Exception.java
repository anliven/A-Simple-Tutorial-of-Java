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
 * 异常在Java语言中作为类的实例出现。
 * 当某一方法中发生错误时，这个方法会创建一个对象并且传递给正在运行的系统，这个对象就是异常对象。
 * 
 * java.lang.Throwable类是所有错误或异常的超类，有两个子类：java.lang.Error类和java.lang.Exception类。
 *   java.lang.Error（合理的严重的故障或问题，应用程序通常不试图捕获）
 *   常见的Error：虚拟机错误（VirtualMachineError）、线程死锁（ThreadDeath）等。
 *   java.lang.Exception（编码、环境、用户操作输入出现问题）
 *   两个主要的子类：IOException类和RuntimeException类。
 * 由于java.lang包是默认加载到所有的Java程序，所以大部分从异常类继承而来的异常都可以直接使用。
 * 
 * ### 分类 
 * 1.检查性异常（非运行异常）: 不处理编译不能通过 
 *   文件异常IOException
 *   SQL异常SQLException
 *   等
 * 2.非检查性异常（运行时异常）: 不处理编译可以通过，如果有抛出直接抛到控制台
 *   空指针异常NullPointerException、
 *   数组下标越界异常ArrayIndexOutOfBoundsException、
 *   类型转换异常ClassCastException
 *   算术异常java.lang.ArithmeticException
 *   等
 * 
 */
