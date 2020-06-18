package com.xr.smoke.mapper;

import com.xr.smoke.entity.AdministratorExample;
import com.xr.smoke.entity.Administrator;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminUserMapper {
    //登录
    @Select("select id,username,password,salt from Administrator where username=#{username}")//
    public Administrator login(String username);

    /**
     * 根据用户名查询角色集合
     * @param account
     * @return
     */
    public List<String> findUserRoles(String account);

    //查询角色权限
    public List<Administrator> findUserByUserName(String username);

    long countByExample(AdministratorExample example);

    int deleteByExample(AdministratorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    public List<Administrator> selectByExample(AdministratorExample example);

    Administrator selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    int updateByExample(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}
