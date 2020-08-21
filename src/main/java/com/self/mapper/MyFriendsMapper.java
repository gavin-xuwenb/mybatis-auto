package com.self.mapper;

import com.self.pojo.MyFriends;
import com.self.pojo.MyFriendsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyFriendsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int countByExample(MyFriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int deleteByExample(MyFriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int insert(MyFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int insertSelective(MyFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    List<MyFriends> selectByExample(MyFriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    MyFriends selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MyFriends record, @Param("example") MyFriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MyFriends record, @Param("example") MyFriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MyFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MyFriends record);
}