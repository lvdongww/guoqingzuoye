package com.kgc.service;

import com.kgc.pojo.Assets;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 15:04
 */
public interface AssetsService {
    int add(Assets assets);

    List<Assets> selectAll(String assetsid, String assetstype);
}
