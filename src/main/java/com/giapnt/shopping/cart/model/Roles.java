package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Roles {
	/**
	 * This field corresponds to the database column core_data.roles.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.roles.code
	 */
	private String code;

	/**
	 * This field corresponds to the database column core_data.roles.name
	 */
	private String name;

	/**
	 * This field corresponds to the database column core_data.roles.description
	 */
	private String description;

	/**
	 * This field corresponds to the database column core_data.roles.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.roles.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.roles.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.roles.updated_timestamp
	 */
	private Date updatedTimestamp;

	/**
	 * This field corresponds to the database column core_data.roles.is_active
	 */
	private Boolean isActive;

}