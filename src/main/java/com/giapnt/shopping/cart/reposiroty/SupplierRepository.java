package com.giapnt.shopping.cart.reposiroty;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.giapnt.shopping.cart.model.Suppliers;

/**
 * The Interface SuppliersRepository.
 *
 * @author GiapNT
 */
@Mapper
public interface SupplierRepository {
	
	/**
	 * Find all.
	 *
	 * @return the list suppliers
	 */
	List<Object> findAll(Integer limit, Integer offset);
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the suppliers
	 */
	Suppliers findById(String id);
	
	/**
	 * Count all.
	 *
	 * @return the count of number rerord
	 */
	Integer countAll();
}
