package com.giapnt.shopping.cart.services;

import org.springframework.stereotype.Service;

import com.giapnt.shopping.cart.model.Suppliers;
import com.giapnt.shopping.cart.utils.pagination.PageHelper;

/**
 * The Interface SupplierService.
 *
 * @author GiapNT
 */
@Service
public interface SupplierService {

	/**
	 * Find all.
	 *
	 * @param pageNum the page num
	 * @param pageSize the page size
	 * @return the page helper
	 */
	PageHelper findAll(Integer pageNum, Integer pageSize);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the suppliers
	 */
	Suppliers findById(String id);
}
