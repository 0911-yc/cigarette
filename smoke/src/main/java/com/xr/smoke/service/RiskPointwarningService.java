package com.xr.smoke.service;

import com.xr.smoke.entity.RiskPointwarning;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RiskPointwarningService {
    List<RiskPointwarning> list1(String title,String content,Integer page,Integer limit);
    List<RiskPointwarning> list(RiskPointwarning riskPointwarning);
    void add(RiskPointwarning riskPointwarning);
    void delete(Integer id);
    void update(RiskPointwarning riskPointwarning);

}
