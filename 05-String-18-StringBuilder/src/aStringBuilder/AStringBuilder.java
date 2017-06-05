package aStringBuilder;

public class AStringBuilder {

	public static void main(String[] args) {
		//字符串生成器
		String str1 = "";  //定义空字符串
		long startTime1 = System.currentTimeMillis();  //当前毫秒 数，距离1970年1月1日0时起的毫秒总数
		for(int i=0;i<=10000;i++){
			str1 = str1 +i;  //循环追加字符
			//System.out.println("str1：" + str1);
		}
		long endTime1 = System.currentTimeMillis();
		long costTime1 = endTime1 - startTime1;
		System.out.println("'+'方式的花费时间：" + costTime1);
		
		StringBuilder str2 = new StringBuilder("");
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<=10000;i++){
			str2.append(i);  //追加字符
			//System.out.println("str2：" + str2.toString());
		}
		long endTime2 = System.currentTimeMillis();
		long costTime2 = endTime2 - startTime2;
		System.out.println("StringBuilder方式的花费时间：" + costTime2);
		
		StringBuilder str3 = new StringBuilder("Hello");
		str3.append(" world!");  //追加字符
		System.out.println("str3：" + str3.toString());
		str3.insert(5," my");  //在索引位置插入字符
		System.out.println("str3：" + str3.toString());
		str3.delete(5,8);  //删除指定索引位置范围的字符
		System.out.println("str3：" + str3.toString());
	}

}

/* 使用“+”虽然可以对字符串对象添加新的内容，但会产生新的string实例，如果重复地对字符串进行修改，将极大地增加系统开销。
 * 如果频繁地附加字符串，使用可变字符序列StringBuilder，可以很大提升效率。
 * StringBuilder对象初始容量16个字符，可以自行指定初始长度。
 * 使用toString()方法获取StringBuilder最后输出的字符串结果。
 * 
 * StringBuilder类中的append()方法、insert()方法、delete()方法支持动态地执行添加、插入和删除等编辑操作。
 * 
 * 关于更多关于StringBuilder类的方法，可查询java.lang.StringBuilder的API说明。
 */