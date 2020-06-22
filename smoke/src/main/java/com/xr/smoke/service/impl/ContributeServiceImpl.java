package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Contribute;
import com.xr.smoke.entity.ContributeExample;
import com.xr.smoke.mapper.ContributeMapper;
import com.xr.smoke.service.ContributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContributeServiceImpl implements ContributeService {
    @Autowired
    private ContributeMapper contributeMapper;

    @Override
    public List<Contribute> selectAll() {
        return contributeMapper.selectAll();
    }

    @Override
    public void delCon(Integer id) {
         contributeMapper.delCon(id);
    }
}
