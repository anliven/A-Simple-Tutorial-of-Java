package pers.anliven.learningjava.chapter04;

public class T05While {

	public static void main(String args[]) {
		
		# 1到10的求和
		int x = 1;
		int sum = 0;
		while (x <= 10) { // while循环语句，先判断条件是否成立，再执行循环体
			sum = sum + x;
			x++;
		}
		System.out.println("sum = " + sum);
		
		# 判断一个数（小于10位）的位数
        int num = 987;
        int count = 0;
        if ((num>=0) && (num<=999999999)){
            while(num != 0){
                count++;
                num/=10;
            }
            System.out.println("它是个"+count+"位的整数！");
            
        }else{
            System.out.println("输入有误");
        }
		
	}

}