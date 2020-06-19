package com.xr.smoke.service;


import com.xr.smoke.entity.PoliticianTalk;

import java.util.List;

public interface PoliticianTalkService {
    public List<PoliticianTalk> list1(String talkType, Integer page, Integer limit);
    public void add(PoliticianTalk politicianTalk);
    public void delete(int id);
    public void update(PoliticianTalk politicianTalk);
    public List<PoliticianTalk> list(PoliticianTalk politicianTalk);
}
