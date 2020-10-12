package com.JackZ.BestForum.mapper.generated;

import com.JackZ.BestForum.model.UserInformation;
import com.JackZ.BestForum.model.UserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    long countByExample(UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int deleteByExample(UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int insert(UserInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int insertSelective(UserInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    List<UserInformation> selectByExample(UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int updateByExample(@Param("record") UserInformation record, @Param("example") UserInformationExample example);
}