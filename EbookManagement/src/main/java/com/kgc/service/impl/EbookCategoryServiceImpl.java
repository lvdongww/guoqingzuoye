package com.kgc.service.impl;

import com.kgc.mapper.EbookCategoryMapper;
import com.kgc.pojo.EbookCategory;
import com.kgc.service.EbookCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("ebookCategoryService")
public class EbookCategoryServiceImpl implements EbookCategoryService {
    @Resource
    EbookCategoryMapper ebookCategoryMapper;
    @Override
    public List<EbookCategory> selectAll() {
        return  ebookCategoryMapper.selectByExample(null);
    }
}
