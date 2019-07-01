package com.swh.spring.bean.service.impl;

import com.swh.spring.bean.service.CDPlayer;
import com.swh.spring.bean.service.CompactDiscService;
import org.springframework.stereotype.Component;

/**
 * @Auther: swh
 * @Date: 2019/6/2 21:02
 * @Description:
 */
@Component
public class CDPlayerImpl implements CDPlayer {

    private CompactDiscService compactDiscService;

    public  CDPlayerImpl() {

    }

    public  CDPlayerImpl(CompactDiscService compactDiscService) {
        this.compactDiscService = compactDiscService;
    }

    @Override
    public void play() {
        compactDiscService.play();
    }
}
