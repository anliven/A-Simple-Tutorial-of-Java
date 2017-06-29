package pers.anliven.learningjava.chapter11;

public class T05SelfDefining {

	public static void main(String[] args) {
		CreatAccount xxx = new CreatAccount(101.00);
		System.out.println("账户余额：" + xxx.getNumber());
		System.out.println("存入￥500");
		xxx.deposit(500.00);
		try {
			System.out.println("支出￥100");
			xxx.withdraw(100.00);
			System.out.println("支出￥600");
			xxx.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("账户余额不足： " + e.getAmount());
			e.printStackTrace();
		}
	}

}

// 自定义异常类
class InsufficientFundsException extends Exception { // 所有的异常类（包括自定义）都继承于Exception类
	private static final long serialVersionUID = 1L;
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}

class CreatAccount {
	private double balance = 0.00; // 初始余额为零

	public CreatAccount(double number) {
		this.balance = number;
	}

	public void deposit(double earn) {
		balance += earn;
	}

	public void withdraw(double cost) throws InsufficientFundsException {
		if (cost <= balance) {
			balance -= cost;
		} else {
			double needs = balance - cost;
			throw new InsufficientFundsException(needs); // 抛出自定义异常
		}
	}

	public double getNumber() {
		return balance;
	}
}

/*
 * ### 分类 
 * 1.检查性异常（非运行异常）: 不处理编译不能通过 
 * 2.非检查性异常（运行时异常）: 不处理编译可以通过，如果有抛出直接抛到控制台
 * 
 * 
 * ### 自定义异常 
 * 编写检查性异常类，需要继承java.lang.Exception类。
 * 编写运行时异常类，需要继承java.lang.RuntimeException类。 
 * 一个异常类和其它任何类一样，包含有变量和方法。
 * 
 * 
 * ### 异常使用原则 
 * 1. 在当前方法被覆盖时，覆盖他的方法必须抛出相同的异常或异常的子类； 
 * 2. 在当前方法声明中使用try-catch语句捕获异常；
 * 3. 如果父类抛出多个异常，则覆盖方法必须抛出那些异常的一个子集，不能抛出新异常。
 * 
 */



