package com.fcc.provider.dao.mapper.base;

import com.fcc.provider.dao.entity.UserEntity;
import com.fcc.provider.dao.entity.UserEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    long countByExample(UserEntityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    int deleteByExample(UserEntityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    List<UserEntity> selectByExample(UserEntityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Apr 13 16:44:01 CST 2019
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityCriteria example);
}