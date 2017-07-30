package pers.anliven.learningjava.chapter15;

public interface T01People {
	public String name();

	public int age();

	@Deprecated // @Deprecated表示方法已经过时
	public void work();
}

// 接口
/*### 内建注解（JDK注解）
@Override -- 告知编译器将要复写父类中的方法,当父类中的方法移除或者发生更改时编译器将提示错误信息。

@Deprecated -- 告知编译器被修饰的程序元素已被“废弃”,不建议使用。建议注明不推荐使用的原因以及替代的方法。

@SuppressWarnings -- 告知编译器忽略特定的警告信息。此注解仅在源文件中有效,在编译后的class文件中便不再存在。取值类型为Sring[]类型。
- deprecation：忽略使用了废弃的类或方法时的警告
- unchecked：执行了未检查的转换
- fallthrough：swich语句款中case忘加break从而直接“落入”下一个case
- path：类路径或原文件路径等不存在
- serial：可序列化的类缺少serialVersionUID
- finally：存在不能正常执行的finally子句
- all：以上所有情况产生的警告均忽略*/
