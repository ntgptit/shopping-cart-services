/*
 * 
 */
package com.giapnt.shopping.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.giapnt.shopping.cart.model.Suppliers;
import com.giapnt.shopping.cart.services.SupplierService;
import com.giapnt.shopping.cart.utils.pagination.PageHelper;

/**
 * The Class SupplierController.
 *
 * @author GiapNT
 */
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/admin/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	/**
	 * Find all.
	 *
	 * @param pageNum  the page num
	 * @param pageSize the page size
	 * @return the page helper for suppliers
	 */
	@GetMapping(value = "")
	public PageHelper findAll(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
		return supplierService.findAll(pageNum, pageSize);
	}

	/**
	 * Creates the suppliers.
	 *
	 * @param suppliers the suppliers
	 * @return the suppliers
	 */
	@PostMapping(value = "")
	public Suppliers create(@RequestBody Suppliers suppliers) {
		return supplierService.createUser(suppliers, "");
	}

}
