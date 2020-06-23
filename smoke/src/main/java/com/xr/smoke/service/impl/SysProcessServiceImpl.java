package com.xr.smoke.service.impl;

import com.xr.smoke.entity.SysProcess;
import com.xr.smoke.mapper.SysProcessMapper;
import com.xr.smoke.mapper.SysRoleMapper;
import com.xr.smoke.service.SysProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysProcessServiceImpl implements SysProcessService {
    @Autowired
    private SysProcessMapper sysProcessMapper;

    @Override
    public List<SysProcess> list1(String title, String content,Integer page, Integer limit) {
        return sysProcessMapper.list1(title,content,page,limit);
    }

    @Override
    public List<SysProcess> list(SysProcess sysProcess) {
        return sysProcessMapper.list(sysProcess);
    }

    @Override
    public void add(SysProcess sysProcess) {
        sysProcessMapper.add(sysProcess);
    }

    @Override
    public void delete(Integer id) {
        sysProcessMapper.delete(id);
    }

    @Override
    public void update(SysProcess sysProcess) {
        sysProcessMapper.update(sysProcess);
    }
}
