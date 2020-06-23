package com.xr.smoke.service;

import com.xr.smoke.entity.EducationEntity;
import com.xr.smoke.entity.NewsEntity;

import java.util.List;

public interface EducationService {
    //查询所有
    public List<NewsEntity> newList();

    //根据id删除
    public void delNewById(Integer id);
}
