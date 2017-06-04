package com.index.mapper;

import com.index.po.Admin;

/**
 * Created by Administrator on 2017/5/26.
 */
public interface AdminMapper {

    Admin selectAdminById(Integer id);

    Admin adminLogin(Admin admin);

}
