package com.kgc.mapper;

import com.kgc.pojo.Credentialtype;
import com.kgc.pojo.CredentialtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CredentialtypeMapper {
    int countByExample(CredentialtypeExample example);

    int deleteByExample(CredentialtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Credentialtype record);

    int insertSelective(Credentialtype record);

    List<Credentialtype> selectByExample(CredentialtypeExample example);

    Credentialtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Credentialtype record, @Param("example") CredentialtypeExample example);

    int updateByExample(@Param("record") Credentialtype record, @Param("example") CredentialtypeExample example);

    int updateByPrimaryKeySelective(Credentialtype record);

    int updateByPrimaryKey(Credentialtype record);
}