package pers.anliven.learningjava.chapter15;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class T01AnnotationExample {


	public static void main(String[] args) {

		T01AnnotationExample test = new T01AnnotationExample();

		System.out.println(test.toString());

		test.oldMethod();

		try {
			test.genericsTest();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	@T01MethodInfo(author = "Anliven", comments = "Main method", date = "2016", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@T01MethodInfo(comments = "deprecated method", date = "2016")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@T01MethodInfo(author = "Anliven", comments = "Main method", date = "2016", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List testList = new ArrayList();
		testList.add("test");
		oldMethod();
	}
}
