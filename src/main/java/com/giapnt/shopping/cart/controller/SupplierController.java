package com.giapnt.shopping.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping(value = "")
	public PageHelper findAll(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
		return supplierService.findAll(pageNum, pageSize);
	}
}
