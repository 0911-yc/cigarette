package com.xr.smoke.service.impl;

import com.xr.smoke.entity.DatumEntity;
import com.xr.smoke.mapper.DatumMapper;
import com.xr.smoke.service.DatumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DatumServiceImpl implements DatumService {
    @Autowired
    private DatumMapper datumMapper;

    @Override
    public List<DatumEntity> datList() {
        List<DatumEntity> datList = datumMapper.datList();
        return datList;
    }
}
