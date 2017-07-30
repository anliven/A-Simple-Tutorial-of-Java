package pers.anliven.learningjava.practices03;

public class Practices0303 {

	public static void main(String[] args) {
		long testLong = 987654321;
		byte testByte = 123;
		short testShort = 9876;

		int myint1 = (int) testLong;
		int myint2 = (int) testShort;
		int myint3 = (int) testByte;

		System.out.println("long to int: " + myint1);
		System.out.println("byte to int: " + myint2);
		System.out.println("short to int: " + myint3);
	}

}

// 将所有整型数值全部转换成int型，并将转换后的值输出。
