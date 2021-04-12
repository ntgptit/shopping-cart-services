package com.giapnt.shopping.cart.utils.validation.string;

import org.apache.commons.lang3.StringUtils;

/**
 * The Class StringValidation.
 *
 * @author GiapNT
 */
public class StringValidation {

	/**
	 * Instantiates a new string validation.
	 */
	private StringValidation() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Checks if is empty.
	 *
	 * @param object the object
	 * @return check all blank result for object
	 */
	public static boolean notEmpty(Object object) {
		if (object == null) {
			return false;
		}
		return StringUtils.isNotBlank(object.toString());
	}
}
