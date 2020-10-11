package com.JackZ.BestForum.mapper.manual;

import org.apache.ibatis.annotations.Param;

public interface UserPriorityMapper {

    Integer findPriorityById(Long id);

    Integer insertPriority(@Param("userId") Long id,
                           @Param("rank") Integer code,
                           @Param("score") Integer score);

}
