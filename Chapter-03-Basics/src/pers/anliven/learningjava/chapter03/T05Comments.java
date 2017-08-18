package pers.anliven.learningjava.chapter03;

public class T05Comments {
	/**
	 * 
	 * @author anliven
	 * @version 1.0.0
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * 变量
		 */
		String str = "Hello Docs!";

		System.out.println("test row 1");
		System.out.println("test row 2");
		System.out.println("test row 3");
		System.out.println(str);
		System.out.println("test row 5");

		T05Comments book = new T05Comments();
		book.showName("123");

	}

	/**
	 * 方法
	 */
	private void showName(String name) {
		System.out.println("名称为：" + name);
	}

}

/*### 注释
- 被注释的代码块在程序运行时不被执行。
- 可读性第一，添加适量注释来提高程序的可读性和可维护性，注释一般占程序代码总量的30%~50%。
- Java提供3种注释方法：单行注释，多行注释，文档注释。
- 在多行注释中可以嵌套单行注释，但不可以嵌套多行注释。
- 文档注释内容会被Javadoc文档工具读取作为Javadoc文档内容。

 
### 注释的类型
- 文档注释以*//**开头，以*//*结尾
- 多行注释以开头，以结尾
- 当行注释以//开头，行末结尾


### 生成帮助文档
在源代码中为类、方法、变量等添加符合Javadoc语法的描述信息, 通过javadoc命令将描述信息自动生成一个HTML格式的帮助文档。
注意：公共的和受保护的类可以文档化，私有的类则不会在文档中显示。
生成文档前，必须先编译。


### 常用javadoc标记
@author       标明开发该类模块的作者
@version      标明该类模块的版本
@see          参考转向，也就是相关主题
@param        对方法中某参数的说明
@return       对方法返回值的说明
@exception    对方法可能抛出的异常进行说明


### 利用javadoc命令生成文档
示例：命令行执行“javadoc -d <生成文档的存放位置> -version -author <java文件位置>”，在生成文档的目录打开index.html即可查看。
通过javadoc -help命令查看javadoc使用说明。


### 利用Eclipse生成文档的3种方法
- 项目列表右键选择Export---》选择Java下的Javadoc---》Javadoc command选择jdk的javadoc.exe目录，自定义保存路径Destination---》点击Finish，生成文档。
- 菜单栏File---》点击Export---》后续步骤与方法一相同。
- 选中项目---》菜单栏Project---》点击Generate Javadoc---》后续步骤与方法一相同。*/