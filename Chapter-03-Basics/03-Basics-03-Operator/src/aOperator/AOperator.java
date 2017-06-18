package aOperator;

public class AOperator {

	public static void main(String[] args) {
		
		//赋值操作符
		int a, b, c;
		a = 15;
		c = b = a + 4;
		System.out.println(">a值为：" + a +" >b值为：" + b + " >c值为：" + c); 
		
		//逻辑运算符
		boolean result = ((a > b) && (a != b));
		boolean result2 = ((a > b) || (a != b));
		System.out.println("(a>b)&&(a!=b)结果：" + result);
		System.out.println("(a>b)||(a!=b)结果：" + result2);
		
		//自增自减运算符
		int d = 123;
		++d;
		int e = d--;
		System.out.println(">d值为：" + d + " >e值为：" + e); 
		
		//三元运算符
		String x = 20>30?"Yes！":"No！";
		System.out.println(">h值为：" + x); 	
		boolean f;
		if (20 > 30)
			f = true;
		else
			f = false;
		boolean g = 20>30?true:false;
		System.out.println(">f值为：" + f + " >g值为：" + g); 
		
		//算术运算符
		int number1 = 123;
		int number2 = 456;
		System.out.println("和为：" + (number1+number2)+" 差为：" + (number2-number1)); 
		System.out.println("积为：" + (number1*number2)+" 商为：" + (number1/number2)); 
		
		//比较运算符
		System.out.println("是否大于：" +(number1>number2)+" 是否小于："+(number1<number2));
		System.out.println("是否等于："+(number1==number2)+" 是否不等："+(number1!=number2));
		System.out.println("是否大于等于："+(number1>=number2)+" 是否小于等于："+(number1<=number2));
		
		//位运算符
		System.out.println("5左移2位的结果：" + (5<<2));
		System.out.println("5位或3的结果：" + (5|3));

	}

}

/*

### 运算符

- 赋值运算符“=”，将右方操作数所含的值赋给左方的操作数
- 如果表达式中有多个赋值运算符“=”，会从最右方的“=”开始处理。不建议这种使用方法。

- 逻辑运算符“&&、&、||、!”，注意“&&、&”的区别。
- 操作元必须为boolean类型数据

- 自增自减运算符“++、--”，使变量的值加1或减1
- 操作元必须是整型或浮点型变量
- 放在操作元之前，表示使用变量之前，此变量先加1或减1；放在操作元之后，表示使用变量之后，此变量再加1或减1

- 三元运算符运算规则：“条件式？值1：值2”，若条件式的值为true，则整个表达式取值1，否则取值2。
- 三元运算符等价于if...else语句。

- 算术运算符“加+、减-、乘*、除/、余%”
- 0不能做除数，否则会报错

- 比较运算符“>、<、==、>=、<=、!=”的运算结果是boolean类型值
- 注意不同的比较运算符针对的数据类型有所不同

- 位运算符：左移<<、右移 >> 、无符号右移>>>、位与&、位或|、位非~、位异或^。

- 运算符优先级：自增自减》算术》比较》逻辑》赋值
- 强烈建议使用括号运算符限定运算次序，避免混乱。

 */
