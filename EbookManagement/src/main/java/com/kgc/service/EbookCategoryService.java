package com.kgc.service;

import com.kgc.pojo.EbookCategory;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-19 10:13
 */
public interface EbookCategoryService {
    List<EbookCategory> selectAll();
}
