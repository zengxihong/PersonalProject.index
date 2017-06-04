package com.index.service.impl;

 import com.index.mapper.AdminMapper;
 import com.index.po.Admin;
 import com.index.service.AdminService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/26.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminMapper adminMapper;
    @Override
     public Admin selectAdminById(Integer id) throws Exception{
        return adminMapper.selectAdminById(id);
    }
    @Override
    public Admin adminLogin(Admin admin) throws Exception {
        return adminMapper.adminLogin(admin);
    }

}
