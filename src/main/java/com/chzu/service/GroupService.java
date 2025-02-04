package com.chzu.service;

import com.chzu.util.layimInit.GroupMember;

public interface GroupService {

    public boolean isGrouped(String claId);

    /**
     * 随机分组
     * @param claId
     * @param memberNumber
     */
    public void randomGrouping(String claId,int memberNumber);

    public GroupMember getMemberByGroId(long groId);


}
