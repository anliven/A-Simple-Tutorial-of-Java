package aformat14;
import java.util.Date;

public class Aformat14 {

	public static void main(String[] args) {
		//时间格式化
		Date date = new Date();
		String hour = String.format("%tH", date);  //2位数字显示24小时制的小时数
		String minute = String.format("%tM", date);  //2位数字的分钟数
		String second = String.format("%tS", date);  //2位数字的秒数
		System.out.println("当前时间为：" + hour + ":" + minute + ":" + second);
		
		String timezone = String.format("%tZ", date);  //缩写形式显示时区
		System.out.println("当前时区为：" + timezone);
		
		String secondsum = String.format("%tQ", date);  //1970-01-01零时零分零秒到现在经过的毫秒数
		System.out.println("1970-01-01零时零分零秒到现在经过的毫秒数：" + secondsum);
	}

}

/* 了解常用的时间格式转换符
 */