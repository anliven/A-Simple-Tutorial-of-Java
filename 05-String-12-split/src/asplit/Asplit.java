package asplit;

public class Asplit {

	public static void main(String[] args) {
		//字符串分割
		String str = "IP address : 192.168.1.1";
		String[] firstArry = str.split(" |\\.");  //按照空格和“.”进行分割。这里使用了转义字符"\\."
		String[] secondArry = str.split("\\.",3);  //按照“.”进行分割，分割为块数为3
		
		System.out.println("原字符串str为：" + "[" + str + "]");
		
		System.out.print("全部分割的结果：");
		for(String x : firstArry){
			System.out.print("[" + x + "]");
		}
		
		System.out.println();
		
		System.out.print("分割成3部分的结果：");
		for(String x : secondArry){
			System.out.print("[" + x + "]");
		}

	}

}

/* split()方法 --- 按照指定的分割符对内容进行分割，并以字符串数组的方式返回结果。
 * 使用符号“|”可以定义多个分隔符。
 * 如果期望分割的块数大于实际块数，将返回实际块数。
 */
