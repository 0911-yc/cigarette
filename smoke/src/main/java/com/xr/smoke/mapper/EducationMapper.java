package com.xr.smoke.mapper;

import com.xr.smoke.entity.NewsEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationMapper {
    //查询所有
    public List<NewsEntity> newList();

    //根据id删除
    @Update("UPDATE news set `status`=0 where id=#{id}")
    public void delNewById(Integer id);

    //根据id修改
    public void updateNewById(Integer id);
}
