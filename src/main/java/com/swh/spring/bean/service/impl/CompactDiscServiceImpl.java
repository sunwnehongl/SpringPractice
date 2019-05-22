package com.swh.spring.bean.service.impl;

import com.swh.spring.bean.service.CompactDiscService;
import org.springframework.stereotype.Component;

/**
 * @Auther: swh
 * @Date: 2019/5/22 21:48
 * @Description: CD播放器的实现类
 */
@Component
public class CompactDiscServiceImpl implements CompactDiscService {

    // 歌名
    private String title = "朋友别哭";
    // 作者
    private String artist = "吕方";

    @Override
    public void play() {
        System.out.println("播放音乐:"+title+" 作者:"+artist);
    }
}
