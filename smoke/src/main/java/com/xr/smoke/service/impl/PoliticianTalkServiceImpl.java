package com.xr.smoke.service.impl;

import com.xr.smoke.entity.PoliticianTalk;
import com.xr.smoke.mapper.PoliticianTalkMapper;
import com.xr.smoke.service.PoliticianTalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticianTalkServiceImpl  implements PoliticianTalkService {
    @Autowired
    private PoliticianTalkMapper politicianTalkMapper;

    @Override
    public List<PoliticianTalk> list1(String talkType, Integer page, Integer limit) {
        List<PoliticianTalk> list1 = politicianTalkMapper.list1(talkType, page, limit);
        return list1;
    }

    @Override
    public void add(PoliticianTalk politicianTalk) {
        politicianTalkMapper.add(politicianTalk);
    }

    @Override
    public void delete(int id) {
        politicianTalkMapper.delete(id);
    }

    @Override
    public void update(PoliticianTalk politicianTalk) {
        politicianTalkMapper.update(politicianTalk);

    }

    @Override
    public List<PoliticianTalk> list(PoliticianTalk politicianTalk) {
        List<PoliticianTalk> list = politicianTalkMapper.list(politicianTalk);
        return list;
    }
}
