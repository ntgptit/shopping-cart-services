package com.giapnt.shopping.cart.utils.pagination;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GiapNT
 *
 */
public class PaginationValidation {

	public static Map<String, Integer> paramsVatidation(Integer pageNum, Integer pageSize) {

		Map<String, Integer> result = new HashMap<>();

		// Check page num invalid
		if (pageNum == null || pageNum <= 0) {
			pageNum = 1;
		}

		// Check page size invalid
		if (pageSize == null || pageSize <= 0) {
			pageSize = 10;
		}
		// Calculation parameters for pagination sql
		int limit = pageSize;
		int offset = (pageSize * pageNum) - pageSize;

		result.put("limit", limit);
		result.put("offset", offset);

		return result;
	}
}
