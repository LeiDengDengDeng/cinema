package com.example.cinema.data;

import com.example.cinema.po.MovieForm;
import com.example.cinema.vo.MovieVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fjj
 * @date 2019/3/12 6:26 PM
 */
@Mapper
public interface MovieMapper {
    /**
     * 插入一条电影信息
     * @param addMovieForm
     * @return
     */
    int insertOneMovie(MovieForm addMovieForm);

    /**
     * 根据id查找电影
     * @param id
     * @return
     */
    MovieVO selectMovieById(int id);

    /**
     * 根据id和userId查找电影
     * @param id
     * @param userId
     * @return
     */
    MovieVO selectMovieByIdAndUserId(int id, int userId);

    /**
     * 展示所有电影
     * @return
     */
    List<MovieVO> selectAllMovie();

    /**
     * 根据关键字搜索电影
     * @param keyword
     * @return
     */
    List<MovieVO> selectMovieByKeyword(String keyword);
}
