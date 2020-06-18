package com.xr.smoke.mapper;

import com.xr.smoke.entity.Datum;
import com.xr.smoke.entity.DatumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatumMapper {
    long countByExample(DatumExample example);

    int deleteByExample(DatumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Datum record);

    int insertSelective(Datum record);

    List<Datum> selectByExample(DatumExample example);

    Datum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Datum record, @Param("example") DatumExample example);

    int updateByExample(@Param("record") Datum record, @Param("example") DatumExample example);

    int updateByPrimaryKeySelective(Datum record);

    int updateByPrimaryKey(Datum record);
}