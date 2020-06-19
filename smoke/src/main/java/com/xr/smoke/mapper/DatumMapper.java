package com.xr.smoke.mapper;

import com.xr.smoke.entity.DatumEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatumMapper {
    public List<DatumEntity> datList();
}
