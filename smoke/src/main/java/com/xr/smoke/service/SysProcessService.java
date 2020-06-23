package com.xr.smoke.service;

import com.xr.smoke.entity.SysProcess;
import java.util.List;

public interface SysProcessService {
    List<SysProcess> list1(String title,String content,Integer page,Integer limit);
    List<SysProcess> list(SysProcess sysProcess);
    void add(SysProcess sysProcess);
    void delete(Integer id);
    void update(SysProcess sysProcess);

}
