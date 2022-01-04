package com.thw.test.service.impl;

import com.thw.test.entity.Admin;
import com.thw.test.mapper.AdminMapper;
import com.thw.test.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin getAdminInfo(Long id) {
        return this.adminMapper.selectAdminInfoById(id);
    }

}
