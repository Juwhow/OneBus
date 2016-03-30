package com.onebus.others;

import java.util.Random;


public class SecurityCode {

	public static String getSecurityCode() {
		Random rd = new Random();
		String n = "";
		int getNum;
		do {
			getNum = Math.abs(rd.nextInt()) % 10 + 48;// 产生数字0-9的随机数
			// getNum = Math.abs(rd.nextInt())%26 + 97;//产生字母a-z的随机数
			char num1 = (char) getNum;
			String dn = Character.toString(num1);
			n += dn;
		} while (n.length() < 6);
		System.out.println("随机的6位密码是：" + n);
		return n;
	}
}
