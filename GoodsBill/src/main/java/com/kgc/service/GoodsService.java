package com.kgc.service;

import com.kgc.pojo.Goods;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 17:28
 */
public interface GoodsService {
    List<Goods> selectAll(Integer id);

     Goods selectAllById(Integer id);

     int update(Goods g);
}
