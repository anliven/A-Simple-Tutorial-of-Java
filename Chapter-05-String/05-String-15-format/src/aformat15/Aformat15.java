package aformat15;
import java.util.Date;

public class Aformat15 {

	public static void main(String[] args) {
		//常见日期时间组合的格式化
		Date date = new Date();
		String nowday = String.format("%tF", date);  //"%tF"表示：“年-月-日”格式，4位数字年份。
		String nowtime = String.format("%tT", date);  //"%tT"表示：24小时制，显示“时：分：秒”。

		System.out.println("当前日期为：" + nowday);
		System.out.println("当前时间为：" + nowtime);
		
		String time = String.format("%tc", date);  //"%tc"表示：全部的日期和时间信息
		System.out.println("全部的时间信息为：" + time);
	}

}

/* 了解常见日期时间组合的格式转换符
 * "%tD"表示：“月/日/年”格式，4位数字年份
 * "%tR"表示：24小时制，显示“时：分”
 */