package com.index.service;

import com.index.po.Admin;

/**
 * Created by Administrator on 2017/5/26.
 */
public interface AdminService {

   public Admin selectAdminById(Integer id) throws Exception;
   public Admin adminLogin(Admin admin) throws Exception;


}
