package com.giapnt.shopping.cart.services.impl;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giapnt.shopping.cart.exception.ShoppingCartException;
import com.giapnt.shopping.cart.model.Suppliers;
import com.giapnt.shopping.cart.reposiroty.SupplierRepository;
import com.giapnt.shopping.cart.services.SupplierService;
import com.giapnt.shopping.cart.utils.pagination.PageHelper;
import com.giapnt.shopping.cart.utils.pagination.PaginationValidation;

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

		PageHelper pageHelper = new PageHelper();

		pageHelper.setPageNum(pageNum);
		pageHelper.setPageSize(pageSize);
		pageHelper.setTotal(suppliersRepository.countAll());
		pageHelper.setObjects(
				suppliersRepository.findAll(PaginationValidation.paramsVatidation(pageNum, pageSize).get("limit"),
						PaginationValidation.paramsVatidation(pageNum, pageSize).get("offset")));

		return pageHelper;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Suppliers findById(String id) {
		return suppliersRepository.findById(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Suppliers createUser(Suppliers suppliers, String userCreated) {
		
		if (suppliers == null) {
			throw new ShoppingCartException("Parameter is invalid");
		}

		String name = suppliers.getName();
		String code = suppliers.getCode();
		String address = suppliers.getAddress();
		String email = suppliers.getEmail();
		String phone = suppliers.getPhone();
		String rank = suppliers.getRank();
		if (StringUtils.isAllBlank(name)) {
			throw new ShoppingCartException("Supplier name is null or empty");
		}
		if (StringUtils.isAllBlank(code)) {
			throw new ShoppingCartException("Supplier code is null or empty");
		}
		if (StringUtils.isAllBlank(address)) {
			throw new ShoppingCartException("Supplier address is null or empty");
		}
		if (StringUtils.isAllBlank(email)) {
			throw new ShoppingCartException("Supplier email is null or empty");
		}
		if (StringUtils.isAllBlank(phone)) {
			throw new ShoppingCartException("Supplier phone is null or empty");
		}
		if (StringUtils.isAllBlank(rank)) {
			throw new ShoppingCartException("Supplier rank is null or empty");
		}
		if (name.length() < 8) {
			throw new ShoppingCartException("Supplier name is too short(less than 8 characters)");
		}
		if (name.length() > 100) {
			throw new ShoppingCartException("Supplier name is too long(more than 100 characters)");
		}
		if (code.length() < 5) {
			throw new ShoppingCartException("Supplier code is too short(less than 5 characters)");
		}
		if (code.length() > 40) {
			throw new ShoppingCartException("Supplier code is too long(more than 100 characters)");
		}
		if (address.length() < 8) {
			throw new ShoppingCartException("Supplier address is too short(less than 8 characters)");
		}
		if (address.length() > 300) {
			throw new ShoppingCartException("Supplier address is too long(more than 300 characters)");
		}
		if (phone.length() < 10) {
			throw new ShoppingCartException("Supplier phone is too short(less than 10 characters)");
		}
		if (phone.length() > 13) {
			throw new ShoppingCartException("Supplier phone is too long(more than 13 characters)");
		}
		if (StringUtils.equals(rank, "1") && StringUtils.equals(rank, "3")){
			throw new ShoppingCartException("Supplier rank is invalid");
		}
		if (suppliersRepository.isExistedName(name)) {
			throw new ShoppingCartException("Supplier name already exits");
		}
		if (suppliersRepository.isExistedCode(code)) {
			throw new ShoppingCartException("Supplier code already exits");
		}
		// TODO: check format Email: Not start

		// Settings parameters are missing supplier object
		suppliers.setId(UUID.randomUUID().toString());
		suppliers.setCreatedBy(userCreated);
		suppliers.setCreatedTimestamp(new Date());
		suppliers.setUpdatedBy(null);
		suppliers.setUpdatedTimestamp(null);

		// Execute sql insert for create supplier progress
		Integer createdResult = suppliersRepository.create(suppliers);

		// Check result
		if (createdResult == 0) {
			throw new ShoppingCartException("System error. Create supplier failed");
		}

		return suppliers;
	}

}
