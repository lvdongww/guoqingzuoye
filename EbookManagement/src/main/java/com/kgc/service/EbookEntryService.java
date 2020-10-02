package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.EbookEntry;

/**
 * @author shkstart
 * @create 2020-09-19 10:01
 */
public interface EbookEntryService {
    PageInfo<EbookEntry> selectPage(Integer bookid, Integer pageIndex, Integer pageSize);

    int add(EbookEntry ebookEntry);

    int delete(Integer id);

    int update(EbookEntry ebookEntry);
}
