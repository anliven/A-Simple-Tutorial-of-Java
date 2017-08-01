package pers.anliven.learningjava.practices09;

import java.text.DecimalFormat;

public class P0902 {

	static public void SimpleFormat(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value + " " + pattern + " " + output);
	}

	public static double GetRoundArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}

	public static void main(String[] args) {
		System.out.println("圆的面积为：");
		SimpleFormat("#.#####", GetRoundArea(2));
	}
}

// 以圆半径为参数，求圆的面积，计算结果保留5位小数。