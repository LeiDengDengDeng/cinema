package com.example.cinema.data;

import com.example.cinema.po.DateLikeForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by liying on 2019/3/23.
 */
@Mapper
public interface MovieLikeMapper {
    /**
     * 插入一条想看记录
     * @param movieId
     * @param userId
     * @return
     */
    int insertOneLike(@Param("movieId")int movieId ,@Param("userId")int userId);

    /**
     * 删除一条想看记录
     * @param movieId
     * @param userId
     * @return
     */
    int deleteOneLike(@Param("movieId")int movieId ,@Param("userId")int userId);


    /**
     * 根据id查找想看的人数
     * @param movieId
     * @return
     */
    int selectLikeNums(int movieId);

    /**
     * 根据movieId和userId查找记录
     * @param movieId
     * @param userId
     * @return
     */
    int selectLikeMovie(@Param("movieId")int movieId ,@Param("userId")int userId);

    /**
     * 获得某个电影的喜爱的人数按日期统计
     * @param movieId
     * @return
     */
    List<DateLikeForm> getDateLikeNum(int movieId);
}
