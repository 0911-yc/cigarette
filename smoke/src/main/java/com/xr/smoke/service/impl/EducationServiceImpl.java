package com.xr.smoke.service.impl;

import com.xr.smoke.entity.NewsEntity;
import com.xr.smoke.mapper.EducationMapper;
import com.xr.smoke.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    EducationMapper educationMapper;

    @Override
    public List<NewsEntity> newList() {
        List<NewsEntity> newList = educationMapper.newList();
        return newList;
    }

    @Override
    public void delNewById(Integer id) {
        educationMapper.delNewById(id);
    }
}
