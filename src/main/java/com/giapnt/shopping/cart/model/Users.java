package com.giapnt.shopping.cart.model;

import java.util.Date;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.credit_card
     *
     * @mbg.generated
     */
    private String creditCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.credit_card_type_id
     *
     * @mbg.generated
     */
    private Integer creditCardTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.card_exp_mo
     *
     * @mbg.generated
     */
    private String cardExpMo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.card_exp_yr
     *
     * @mbg.generated
     */
    private String cardExpYr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.billing_address
     *
     * @mbg.generated
     */
    private String billingAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.billing_city
     *
     * @mbg.generated
     */
    private String billingCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.billing_country
     *
     * @mbg.generated
     */
    private String billingCountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.ship_address
     *
     * @mbg.generated
     */
    private String shipAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.ship_city
     *
     * @mbg.generated
     */
    private String shipCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.ship_country
     *
     * @mbg.generated
     */
    private String shipCountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.date_entered
     *
     * @mbg.generated
     */
    private Date dateEntered;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.is_active
     *
     * @mbg.generated
     */
    private Integer isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.login_failed_count
     *
     * @mbg.generated
     */
    private Integer loginFailedCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.is_account_non_expired
     *
     * @mbg.generated
     */
    private Boolean isAccountNonExpired;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.is_account_non_locked
     *
     * @mbg.generated
     */
    private Boolean isAccountNonLocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.is_credentials_non_expired
     *
     * @mbg.generated
     */
    private Boolean isCredentialsNonExpired;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.is_enabled
     *
     * @mbg.generated
     */
    private Boolean isEnabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.created_timestamp
     *
     * @mbg.generated
     */
    private Date createdTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.users.updated_timestamp
     *
     * @mbg.generated
     */
    private Date updatedTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.id
     *
     * @return the value of core_data.users.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.id
     *
     * @param id the value for core_data.users.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.code
     *
     * @return the value of core_data.users.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.code
     *
     * @param code the value for core_data.users.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.first_name
     *
     * @return the value of core_data.users.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.first_name
     *
     * @param firstName the value for core_data.users.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.last_name
     *
     * @return the value of core_data.users.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.last_name
     *
     * @param lastName the value for core_data.users.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.address
     *
     * @return the value of core_data.users.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.address
     *
     * @param address the value for core_data.users.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.city
     *
     * @return the value of core_data.users.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.city
     *
     * @param city the value for core_data.users.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.country
     *
     * @return the value of core_data.users.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.country
     *
     * @param country the value for core_data.users.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.phone
     *
     * @return the value of core_data.users.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.phone
     *
     * @param phone the value for core_data.users.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.email
     *
     * @return the value of core_data.users.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.email
     *
     * @param email the value for core_data.users.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.username
     *
     * @return the value of core_data.users.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.username
     *
     * @param username the value for core_data.users.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.password
     *
     * @return the value of core_data.users.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.password
     *
     * @param password the value for core_data.users.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.credit_card
     *
     * @return the value of core_data.users.credit_card
     *
     * @mbg.generated
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.credit_card
     *
     * @param creditCard the value for core_data.users.credit_card
     *
     * @mbg.generated
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.credit_card_type_id
     *
     * @return the value of core_data.users.credit_card_type_id
     *
     * @mbg.generated
     */
    public Integer getCreditCardTypeId() {
        return creditCardTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.credit_card_type_id
     *
     * @param creditCardTypeId the value for core_data.users.credit_card_type_id
     *
     * @mbg.generated
     */
    public void setCreditCardTypeId(Integer creditCardTypeId) {
        this.creditCardTypeId = creditCardTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.card_exp_mo
     *
     * @return the value of core_data.users.card_exp_mo
     *
     * @mbg.generated
     */
    public String getCardExpMo() {
        return cardExpMo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.card_exp_mo
     *
     * @param cardExpMo the value for core_data.users.card_exp_mo
     *
     * @mbg.generated
     */
    public void setCardExpMo(String cardExpMo) {
        this.cardExpMo = cardExpMo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.card_exp_yr
     *
     * @return the value of core_data.users.card_exp_yr
     *
     * @mbg.generated
     */
    public String getCardExpYr() {
        return cardExpYr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.card_exp_yr
     *
     * @param cardExpYr the value for core_data.users.card_exp_yr
     *
     * @mbg.generated
     */
    public void setCardExpYr(String cardExpYr) {
        this.cardExpYr = cardExpYr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.billing_address
     *
     * @return the value of core_data.users.billing_address
     *
     * @mbg.generated
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.billing_address
     *
     * @param billingAddress the value for core_data.users.billing_address
     *
     * @mbg.generated
     */
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.billing_city
     *
     * @return the value of core_data.users.billing_city
     *
     * @mbg.generated
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.billing_city
     *
     * @param billingCity the value for core_data.users.billing_city
     *
     * @mbg.generated
     */
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.billing_country
     *
     * @return the value of core_data.users.billing_country
     *
     * @mbg.generated
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.billing_country
     *
     * @param billingCountry the value for core_data.users.billing_country
     *
     * @mbg.generated
     */
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.ship_address
     *
     * @return the value of core_data.users.ship_address
     *
     * @mbg.generated
     */
    public String getShipAddress() {
        return shipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.ship_address
     *
     * @param shipAddress the value for core_data.users.ship_address
     *
     * @mbg.generated
     */
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.ship_city
     *
     * @return the value of core_data.users.ship_city
     *
     * @mbg.generated
     */
    public String getShipCity() {
        return shipCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.ship_city
     *
     * @param shipCity the value for core_data.users.ship_city
     *
     * @mbg.generated
     */
    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.ship_country
     *
     * @return the value of core_data.users.ship_country
     *
     * @mbg.generated
     */
    public String getShipCountry() {
        return shipCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.ship_country
     *
     * @param shipCountry the value for core_data.users.ship_country
     *
     * @mbg.generated
     */
    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.date_entered
     *
     * @return the value of core_data.users.date_entered
     *
     * @mbg.generated
     */
    public Date getDateEntered() {
        return dateEntered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.date_entered
     *
     * @param dateEntered the value for core_data.users.date_entered
     *
     * @mbg.generated
     */
    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.is_active
     *
     * @return the value of core_data.users.is_active
     *
     * @mbg.generated
     */
    public Integer getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.is_active
     *
     * @param isActive the value for core_data.users.is_active
     *
     * @mbg.generated
     */
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.login_failed_count
     *
     * @return the value of core_data.users.login_failed_count
     *
     * @mbg.generated
     */
    public Integer getLoginFailedCount() {
        return loginFailedCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.login_failed_count
     *
     * @param loginFailedCount the value for core_data.users.login_failed_count
     *
     * @mbg.generated
     */
    public void setLoginFailedCount(Integer loginFailedCount) {
        this.loginFailedCount = loginFailedCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.is_account_non_expired
     *
     * @return the value of core_data.users.is_account_non_expired
     *
     * @mbg.generated
     */
    public Boolean getIsAccountNonExpired() {
        return isAccountNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.is_account_non_expired
     *
     * @param isAccountNonExpired the value for core_data.users.is_account_non_expired
     *
     * @mbg.generated
     */
    public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
        this.isAccountNonExpired = isAccountNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.is_account_non_locked
     *
     * @return the value of core_data.users.is_account_non_locked
     *
     * @mbg.generated
     */
    public Boolean getIsAccountNonLocked() {
        return isAccountNonLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.is_account_non_locked
     *
     * @param isAccountNonLocked the value for core_data.users.is_account_non_locked
     *
     * @mbg.generated
     */
    public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
        this.isAccountNonLocked = isAccountNonLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.is_credentials_non_expired
     *
     * @return the value of core_data.users.is_credentials_non_expired
     *
     * @mbg.generated
     */
    public Boolean getIsCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.is_credentials_non_expired
     *
     * @param isCredentialsNonExpired the value for core_data.users.is_credentials_non_expired
     *
     * @mbg.generated
     */
    public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
        this.isCredentialsNonExpired = isCredentialsNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.is_enabled
     *
     * @return the value of core_data.users.is_enabled
     *
     * @mbg.generated
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.is_enabled
     *
     * @param isEnabled the value for core_data.users.is_enabled
     *
     * @mbg.generated
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.created_by
     *
     * @return the value of core_data.users.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.created_by
     *
     * @param createdBy the value for core_data.users.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.updated_by
     *
     * @return the value of core_data.users.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.updated_by
     *
     * @param updatedBy the value for core_data.users.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.created_timestamp
     *
     * @return the value of core_data.users.created_timestamp
     *
     * @mbg.generated
     */
    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.created_timestamp
     *
     * @param createdTimestamp the value for core_data.users.created_timestamp
     *
     * @mbg.generated
     */
    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.users.updated_timestamp
     *
     * @return the value of core_data.users.updated_timestamp
     *
     * @mbg.generated
     */
    public Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.users.updated_timestamp
     *
     * @param updatedTimestamp the value for core_data.users.updated_timestamp
     *
     * @mbg.generated
     */
    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }
}