package com.JackZ.BestForum.model;

import java.util.Date;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier_id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    private Long notifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.receiver_id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    private Long receiverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.type
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.gmt_create
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.status
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.id
     *
     * @return the value of notification.id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.id
     *
     * @param id the value for notification.id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier_id
     *
     * @return the value of notification.notifier_id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public Long getNotifierId() {
        return notifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier_id
     *
     * @param notifierId the value for notification.notifier_id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public void setNotifierId(Long notifierId) {
        this.notifierId = notifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.receiver_id
     *
     * @return the value of notification.receiver_id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.receiver_id
     *
     * @param receiverId the value for notification.receiver_id
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.type
     *
     * @return the value of notification.type
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.type
     *
     * @param type the value for notification.type
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.gmt_create
     *
     * @return the value of notification.gmt_create
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.gmt_create
     *
     * @param gmtCreate the value for notification.gmt_create
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.status
     *
     * @return the value of notification.status
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.status
     *
     * @param status the value for notification.status
     *
     * @mbg.generated Sat Oct 10 18:58:09 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}