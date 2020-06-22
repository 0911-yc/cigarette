package com.xr.smoke.service.impl;

import com.xr.smoke.entity.RiskPointwarning;
import com.xr.smoke.mapper.RiskPointwarningMapper;
import com.xr.smoke.service.RiskPointwarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiskPointwarningServiceImpl implements RiskPointwarningService {
    @Autowired
    private RiskPointwarningMapper riskPointwarningMapper;
    @Override
    public List<RiskPointwarning> list1(String title, String content, Integer page, Integer limit) {
        return riskPointwarningMapper.list1(title,content,page,limit);
    }

    @Override
    public List<RiskPointwarning> list(RiskPointwarning riskPointwarning) {
        return riskPointwarningMapper.list(riskPointwarning);
    }

    @Override
    public void add(RiskPointwarning riskPointwarning) {
        riskPointwarningMapper.add(riskPointwarning);
    }

    @Override
    public void delete(Integer id) {
        riskPointwarningMapper.delete(id);
    }

    @Override
    public void update(RiskPointwarning riskPointwarning) {
        riskPointwarningMapper.update(riskPointwarning);
    }
}
