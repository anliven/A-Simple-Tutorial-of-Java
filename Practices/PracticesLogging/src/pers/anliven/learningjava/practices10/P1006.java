package pers.anliven.learningjava.practices10;

import java.util.*;

public class P1006<T> {

	public void doSomething(P1006<? extends List<Object>> a) {
		System.out.println(a.getClass().getName());
	}

	public static void main(String[] args) {
		P1006<? extends List<Object>> a = new P1006<ArrayList<Object>>();
		a.doSomething(new P1006<ArrayList<Object>>());
		a.doSomething(new P1006<LinkedList<Object>>());

	}

}

// 定义一个泛型类，并使用通配符。