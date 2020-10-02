package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.EbookEntry;


public interface EbookEntryService {
    PageInfo<EbookEntry> selectPage(Integer bookid, Integer pageIndex, Integer pageSize);

    int add(EbookEntry ebookEntry);

    int delete(Integer id);

    int update(EbookEntry ebookEntry);
}
