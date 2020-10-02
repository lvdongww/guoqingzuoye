package com.kgc.mapper;

import com.kgc.pojo.EbookCategory;
import com.kgc.pojo.EbookCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EbookCategoryMapper {
    int countByExample(EbookCategoryExample example);

    int deleteByExample(EbookCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EbookCategory record);

    int insertSelective(EbookCategory record);

    List<EbookCategory> selectByExample(EbookCategoryExample example);

    EbookCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EbookCategory record, @Param("example") EbookCategoryExample example);

    int updateByExample(@Param("record") EbookCategory record, @Param("example") EbookCategoryExample example);

    int updateByPrimaryKeySelective(EbookCategory record);

    int updateByPrimaryKey(EbookCategory record);
}