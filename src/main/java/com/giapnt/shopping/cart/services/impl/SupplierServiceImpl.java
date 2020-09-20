package com.giapnt.shopping.cart.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giapnt.shopping.cart.model.Suppliers;
import com.giapnt.shopping.cart.reposiroty.SupplierRepository;
import com.giapnt.shopping.cart.services.SupplierService;
import com.giapnt.shopping.cart.utils.pagination.PageHelper;

/**
 * The Class SupplierServiceImpl.
 *
 * @author GiapNT
 */
@Service("SupplierService")
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository suppliersRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PageHelper findAll(Integer pageNum, Integer pageSize) {

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

		PageHelper pageHelper = new PageHelper();

		pageHelper.setPageNum(pageNum);
		pageHelper.setPageSize(pageSize);
		pageHelper.setTotal(suppliersRepository.countAll());
		pageHelper.setObjects(suppliersRepository.findAll(limit, offset));

		return pageHelper;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Suppliers findById(String id) {
		return suppliersRepository.findById(id);
	}

}
