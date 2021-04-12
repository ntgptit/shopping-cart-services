package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class UsersRoles {
	/**
	 * This field corresponds to the database column core_data.users_roles.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column
	 * core_data.users_roles.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column
	 * core_data.users_roles.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.users_roles.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.users_roles.updated_timestamp
	 */
	private Date updatedTimestamp;

	/**
	 * This field corresponds to the database column core_data.users_roles.role_id
	 */
	private String roleId;

	/**
	 * This field corresponds to the database column core_data.users_roles.user_id
	 */
	private String userId;

}