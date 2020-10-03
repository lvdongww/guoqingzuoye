package com.kgc.service.impl;

import com.kgc.mapper.MeetingroomMapper;
import com.kgc.pojo.Meetingroom;
import com.kgc.service.MeetingroomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 18:25
 */
@Service
public class MeetingroomServiceImpl implements MeetingroomService {
    @Resource
    MeetingroomMapper meetingroomMapper;
    @Override
    public List<Meetingroom> selectAll() {
     return  meetingroomMapper.selectByExample(null);
    }

    @Override
    public int add(Meetingroom meetingroom) {
        return meetingroomMapper.insertSelective(meetingroom);
    }
}
