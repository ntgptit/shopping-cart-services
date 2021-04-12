package mybatis_generator.model;

import java.util.Date;

public class Payments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.allowed
     *
     * @mbg.generated
     */
    private Integer allowed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.created_timestamp
     *
     * @mbg.generated
     */
    private Date createdTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.payments.updated_timestamp
     *
     * @mbg.generated
     */
    private Date updatedTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.id
     *
     * @return the value of core_data.payments.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.id
     *
     * @param id the value for core_data.payments.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.type
     *
     * @return the value of core_data.payments.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.type
     *
     * @param type the value for core_data.payments.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.allowed
     *
     * @return the value of core_data.payments.allowed
     *
     * @mbg.generated
     */
    public Integer getAllowed() {
        return allowed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.allowed
     *
     * @param allowed the value for core_data.payments.allowed
     *
     * @mbg.generated
     */
    public void setAllowed(Integer allowed) {
        this.allowed = allowed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.created_by
     *
     * @return the value of core_data.payments.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.created_by
     *
     * @param createdBy the value for core_data.payments.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.updated_by
     *
     * @return the value of core_data.payments.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.updated_by
     *
     * @param updatedBy the value for core_data.payments.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.created_timestamp
     *
     * @return the value of core_data.payments.created_timestamp
     *
     * @mbg.generated
     */
    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.created_timestamp
     *
     * @param createdTimestamp the value for core_data.payments.created_timestamp
     *
     * @mbg.generated
     */
    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.payments.updated_timestamp
     *
     * @return the value of core_data.payments.updated_timestamp
     *
     * @mbg.generated
     */
    public Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.payments.updated_timestamp
     *
     * @param updatedTimestamp the value for core_data.payments.updated_timestamp
     *
     * @mbg.generated
     */
    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }
}