package com.giapnt.shopping.cart.model;

import java.util.Date;

import lombok.Data;

@Data
public class Suppliers {
	/**
	 * This field corresponds to the database column core_data.suppliers.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.suppliers.name
	 */
	private String name;

	/**
	 * This field corresponds to the database column core_data.suppliers.code
	 */
	private String code;

	/**
	 * This field corresponds to the database column core_data.suppliers.address
	 */
	private String address;

	/**
	 * This field corresponds to the database column core_data.suppliers.city
	 */
	private String city;

	/**
	 * This field corresponds to the database column core_data.suppliers.country
	 */
	private String country;

	/**
	 * This field corresponds to the database column core_data.suppliers.phone
	 */
	private String phone;

	/**
	 * This field corresponds to the database column core_data.suppliers.email
	 */
	private String email;

	/**
	 * This field corresponds to the database column core_data.suppliers.url
	 */
	private String url;

	/**
	 * This field corresponds to the database column
	 * core_data.suppliers.payment_methods
	 */
	private String paymentMethods;

	/**
	 * This field corresponds to the database column core_data.suppliers.type_goods
	 */
	private String rank;

	/**
	 * This field corresponds to the database column
	 * core_data.suppliers.discount_type
	 */
	private String discountType;

	/**
	 * This field corresponds to the database column
	 * core_data.suppliers.discount_available
	 */
	private Integer discountAvailable;

	/**
	 * This field corresponds to the database column
	 * core_data.suppliers.current_order
	 */
	private String currentOrder;

	/**
	 * This field corresponds to the database column core_data.suppliers.notes
	 */
	private String notes;

	/**
	 * This field corresponds to the database column core_data.suppliers.is_active
	 */
	private Boolean isActive;

	/**
	 * This field corresponds to the database column core_data.suppliers.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.suppliers.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.suppliers.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.suppliers.updated_timestamp
	 */
	private Date updatedTimestamp;

}