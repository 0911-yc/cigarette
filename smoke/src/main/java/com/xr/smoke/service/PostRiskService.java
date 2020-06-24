package com.xr.smoke.service;

import com.xr.smoke.entity.Institution;
import com.xr.smoke.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PostRiskService {
    List<Institution> deptsel();
    List<Post> postdid(Integer did);
    List<Map<String, Object>> getsel();
    List<Map<String, Object>> getselCondition(Integer did,Integer pid);
}
