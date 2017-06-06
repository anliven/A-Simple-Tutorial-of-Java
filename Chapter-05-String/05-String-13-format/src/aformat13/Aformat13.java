package aformat13;
import java.util.Date;  //导入Data类

public class Aformat13 {

	public static void main(String[] args) {
		//日期格式化
		Date date = new Date();  //创建Data对象data
		String year = String.format("%ty", date);  //日期格式化转换符"%ty"表示：2位年份。"%tY"表示：4位年份
		String month = String.format("%tm", date);  //"%tm"表示：月份
		String day = String.format("%td", date);  //"%td"表示：在月份中的第几天
		
		System.out.println("今天日期是：20" + year + "-" + month + "-" + day);
	}

}

/* 了解常用的日期格式化转换符
 */