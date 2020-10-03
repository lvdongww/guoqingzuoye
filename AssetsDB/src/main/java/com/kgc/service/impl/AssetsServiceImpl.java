package com.kgc.service.impl;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.pojo.AssetsExample;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 15:04
 */
@Service
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public int add(Assets assets) {
        return assetsMapper.insertSelective(assets);
    }

    @Override
    public List<Assets> selectAll(String assetsid, String assetstype) {
        AssetsExample assetsExample=new AssetsExample();
        AssetsExample.Criteria criteria = assetsExample.createCriteria();
        if (assetsid!=""&&assetsid!=null){
            criteria.andAssetidLike("%"+assetsid+"%");
        }
        if (assetstype!=""&&assetstype!=null){
            criteria.andAssettypeEqualTo(assetstype);
        }
        return assetsMapper.selectByExample(assetsExample);
    }
}
