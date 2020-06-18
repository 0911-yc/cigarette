package com.xr.smoke.service.impl;

import com.xr.smoke.entity.Administrator;
import com.xr.smoke.entity.AdministratorExample;
import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.InstitutionExample;
import com.xr.smoke.mapper.InstitutionMapper;
import com.xr.smoke.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    private InstitutionMapper institutionMapper;

    @Override
    public void add(Institution institution) {
        institutionMapper.insert(institution);
    }

    @Override
    public void deleteById(Integer id) {
        institutionMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void update(Institution institution) {
        institutionMapper.updateByPrimaryKeySelective(institution);

    }

    @Override
    public List<Institution> list() {
        return institutionMapper.list();
    }


}
