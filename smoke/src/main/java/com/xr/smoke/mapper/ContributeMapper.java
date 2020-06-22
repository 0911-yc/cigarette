package com.xr.smoke.mapper;

import com.xr.smoke.entity.Contribute;
import com.xr.smoke.entity.ContributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributeMapper {
    long countByExample(ContributeExample example);

    int deleteByExample(ContributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contribute record);

    int insertSelective(Contribute record);

    List<Contribute> selectByExample(ContributeExample example);

    Contribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contribute record, @Param("example") ContributeExample example);

    int updateByExample(@Param("record") Contribute record, @Param("example") ContributeExample example);

    int updateByPrimaryKeySelective(Contribute record);

    int updateByPrimaryKey(Contribute record);

    List<Contribute> selectAll();

    @Update("UPDATE contribute SET `status`=0 where id=#{id}")
    void delCon(Integer id);

}
