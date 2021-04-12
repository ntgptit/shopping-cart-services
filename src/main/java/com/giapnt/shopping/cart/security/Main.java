package com.giapnt.shopping.cart.security;

import org.apache.commons.lang3.StringUtils;

/**
 * @author GiapNT
 *
 */
public class Main {

	static String toDecimalStr = "ToDecimal( x(z) + y(z), 15, 0)";
	static String toDecimalStr2 = "ToDecimal( aaaaaa, 15, 0)";
	static String toDecimalStr1 = "ToDecimal((x * -1), 18, 0)";

	private static String analysisToDecimal(String toDecimalStr) {
		String precision = "9999";
		String scale = "999";

		String toDecimal = toDecimalStr.split("ToDecimal")[1];

		String tmp = toDecimal.substring(toDecimal.indexOf("(") + 1, toDecimal.indexOf(")"));
		String tmp1 = "";
		if (StringUtils.contains(tmp, "(")) {
			tmp1 = toDecimal.replace(toDecimal.substring(toDecimal.indexOf("(") + 1, toDecimal.indexOf(",") ),
					"***TEMP");
			tmp = tmp1.substring(toDecimal.indexOf("(") + 1, tmp1.indexOf(")"));
		}
		if (StringUtils.contains(tmp, ",")) {
			precision = tmp.split(",")[1].trim();
			scale = tmp.split(",")[2].trim();
		}

		return "Precision: [" + precision + "]" + " ---- " + "Scale: [" + scale + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(analysisToDecimal(toDecimalStr1));
	}
}
