package pers.anliven.learningjava.chapter13;

import java.util.*;
import java.util.Map.Entry;

public class T04Map {

	public static void main(String[] args) {

		// HashMap实现类
		Map<String, String> testMap = new HashMap<String, String>(); // 声明为Map类型，并通过HashMap实现类来实例化
		testMap.put("key1", "$$$"); // 添加键值对
		testMap.put("key2", "111");
		testMap.put("key3", "aaa");
		testMap.put("key4", "aaa");
		System.out.println("显示集合内容：" + testMap);
		System.out.println("是否包含指定key：" + testMap.containsKey("key2"));
		System.out.println("是否包含指定value：" + testMap.containsValue("aaa"));
		System.out.println("获取指定key的value：" + testMap.get("key1"));
		System.out.println("获取所有key形成的Set集合：" + testMap.keySet());
		System.out.println("获取所有value形成的Collction集合" + testMap.values());

		// 遍历HashMap集合
		System.out.println("遍历Map集合中的key：");
		Iterator<String> it = testMap.keySet().iterator(); // 先通过keySet()方法构建所有key的Set集合，然后创建迭代器
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("遍历Map集合中的value：");
		Iterator<String> it2 = testMap.values().iterator(); // 先通过values()方法构建所有value的Set集合，然后创建迭代器
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("遍历Map集合：");
		Iterator<Entry<String, String>> it3 = testMap.entrySet().iterator(); // 先通过entrySet()方法构建所有键值对的Set集合，然后创建迭代器
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		// 通过key遍历Map集合
		Map<String, Integer> testMap2 = new TreeMap<String, Integer>(); // 声明为Map类型，并通过TreeMap实现类来实例化
		System.out.println("通过key遍历Map集合：");
		testMap2.put("数字1", 111);
		testMap2.put("数字2", 222);
		testMap2.put("数字3", 333);
		Set<String> keys = testMap2.keySet(); // 通过keySet()方法构建所有key的Set集合
		for (String key : keys) { // 使用for each语句获取每一个key
			Integer value = testMap2.get(key); // 使用 get()方法获取value
			System.out.println(key + "***" + value);
		}

	}

}

/*### 映射（Map）
- Map是独立的，和Collection接口没有关系
- 集合中存放是键值对（key-value）元素，每个key只能对应一个value
- key不能重复，value可以重复
- 常用实现类有HashMap和TreeMap
- 实现类TreeMap可以根据键值进行排序


### 常用实现类HashMap
- 底层数据结构是哈希表，根据键的HashCode值存储数据
- HashMap中元素的排列顺序是不固定的
- HashMap最多只允许一条记录的键为Null，允许多条记录的值为Null
- 由HashMap实现的Map集合，增删操作效率更高，建议使用

### 常用实现类TreeMap
- 底层数据结构是二叉树
- 默认按照键值的升序排序，也可以指定排序的比较器
- 不允许key值为空，按字符串排序进行输出*/