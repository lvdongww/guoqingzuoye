package com.kgc.service.impl;

import com.kgc.mapper.CredentialtypeMapper;
import com.kgc.pojo.Credentialtype;
import com.kgc.service.CredentialtypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 18:48
 */
@Service
public class CredentialtypeServiceImpl implements CredentialtypeService {
    @Resource
    CredentialtypeMapper credentialtypeMapper;
    @Override
    public List<Credentialtype> selectAll() {
        return credentialtypeMapper.selectByExample(null);
    }
}
