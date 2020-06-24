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
        institutionMapper.add(institution);
    }

    @Override
    public void deleteById(Integer id) {
        institutionMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void update(Institution institution) {
        institutionMapper.update(institution);

    }

    @Override
    public List<Institution> list(Institution institution) {
//        InstitutionExample example = new InstitutionExample();
//        InstitutionExample.Criteria criteria = example.createCriteria();
        List<Institution> list =  institutionMapper.list(institution);
        return list;
    }

    @Override
    public List<Institution> list1(String departmenthead, Integer page, Integer limit) {
       return institutionMapper.list1(departmenthead,page,limit);
    }


}
