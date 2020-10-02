package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.EbookEntryMapper;
import com.kgc.pojo.EbookEntry;
import com.kgc.pojo.EbookEntryExample;
import com.kgc.service.EbookEntryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("ebookEntryService")
public class EbookEntryServiceImpl implements EbookEntryService {
    @Resource
    EbookEntryMapper ebookEntryMapper;

    @Override
    public PageInfo<EbookEntry> selectPage(Integer bookid, Integer pageIndex, Integer pageSize) {
        EbookEntryExample ebookEntryExample=new EbookEntryExample();
        EbookEntryExample.Criteria criteria = ebookEntryExample.createCriteria();
        if (bookid==0){
        }else{
            criteria.andCategoryidEqualTo(bookid);
        }
        ebookEntryExample.setOrderByClause("id desc");
        PageHelper.startPage(pageIndex,pageSize);
        List<EbookEntry> ebookEntries = ebookEntryMapper.selectByExample(ebookEntryExample);
        PageInfo<EbookEntry> pageInfo=new PageInfo<>(ebookEntries);
        return pageInfo;
    }

    @Override
    public int add(EbookEntry ebookEntry) {
        int i = ebookEntryMapper.insertSelective(ebookEntry);
        return i;
    }

    @Override
    public int delete(Integer id) {
        int i = ebookEntryMapper.deleteByPrimaryKey(id);
        return i;
    }
    @Override
    public int update(EbookEntry ebookEntry) {
        int i = ebookEntryMapper.updateByPrimaryKeySelective(ebookEntry);
        return i;
    }
}
