package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Payments {
	/**
	 * This field corresponds to the database column core_data.payments.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.payments.type
	 */
	private String type;

	/**
	 * This field corresponds to the database column core_data.payments.allowed
	 */
	private Integer allowed;

	/**
	 * This field corresponds to the database column core_data.payments.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.payments.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.payments.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.payments.updated_timestamp
	 */
	private Date updatedTimestamp;

}