package com.JackZ.BestForum.mapper.generated;

import com.JackZ.BestForum.model.Advertisement;
import com.JackZ.BestForum.model.AdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAdvertisementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    long countByExample(AdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int deleteByExample(AdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int insert(Advertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int insertSelective(Advertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    List<Advertisement> selectByExample(AdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    Advertisement selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int updateByExample(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int updateByPrimaryKeySelective(Advertisement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertisement
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    int updateByPrimaryKey(Advertisement record);
}