package com.xr.smoke.service;

import com.xr.smoke.entity.Contribute;
import com.xr.smoke.entity.ContributeExample;

import java.util.List;

public interface ContributeService {
    //查询所有
    List<Contribute> selectAll();

    void delCon(Integer id);

}
