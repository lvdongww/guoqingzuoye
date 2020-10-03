package com.kgc.service.impl;

import com.kgc.mapper.GoodsMapper;
import com.kgc.pojo.Goods;
import com.kgc.pojo.GoodsExample;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 17:28
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> selectAll(Integer id) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andGoodsdistrictEqualTo(id);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public Goods selectAllById(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Goods g) {
        return goodsMapper.updateByPrimaryKeySelective(g);
    }
}
