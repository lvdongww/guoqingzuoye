package com.kgc.mapper;

import com.kgc.pojo.EbookEntry;
import com.kgc.pojo.EbookEntryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EbookEntryMapper {
    int countByExample(EbookEntryExample example);

    int deleteByExample(EbookEntryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EbookEntry record);

    int insertSelective(EbookEntry record);

    List<EbookEntry> selectByExample(EbookEntryExample example);

    EbookEntry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EbookEntry record, @Param("example") EbookEntryExample example);

    int updateByExample(@Param("record") EbookEntry record, @Param("example") EbookEntryExample example);

    int updateByPrimaryKeySelective(EbookEntry record);

    int updateByPrimaryKey(EbookEntry record);
}