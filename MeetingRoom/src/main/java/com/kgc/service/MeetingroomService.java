package com.kgc.service;

import com.kgc.pojo.Meetingroom;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 18:25
 */
public interface MeetingroomService {
    List<Meetingroom> selectAll();
    int add(Meetingroom meetingroom);
}
