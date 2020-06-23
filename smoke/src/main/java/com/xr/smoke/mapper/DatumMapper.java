package com.xr.smoke.mapper;

import com.xr.smoke.entity.DatumEntity;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatumMapper {
    public List<DatumEntity> datList();

    @Update("UPDATE datum SET `status`=0 where id=#{id}")
    public void delListById(Integer id);
}
