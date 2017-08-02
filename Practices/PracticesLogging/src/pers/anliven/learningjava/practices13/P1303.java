package pers.anliven.learningjava.practices13;

import java.util.Map;
import java.util.TreeMap;

class Emp {
	private String e_id;
	private String e_name;

	public Emp(String e_id, String e_name) {
		this.e_id = e_id;
		this.e_name = e_name;
	}

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

}

public class P1303 {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		Emp emp = new Emp("001", "张三");
		Emp emp2 = new Emp("005", "李四");
		Emp emp3 = new Emp("004", "王一");
		Emp emp4 = new Emp("010", "王一");
		Emp emp5 = new Emp("015", "王一");
		map.put(emp.getE_id(), emp.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
		map.put(emp4.getE_id(), emp4.getE_name());
		map.put(emp5.getE_id(), emp5.getE_name());
		map.remove("015");
		for (String string : map.keySet()) {
			System.out.println(map.get(string));
		}
	}

}

// 创建Map集合，创建Emp对象并添加到集合（Emp对象的ID作为Map集合的键）；
// 将ID为“015”的对象从集合中移除。