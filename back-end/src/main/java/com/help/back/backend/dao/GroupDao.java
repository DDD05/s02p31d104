package com.help.back.backend.dao;

import com.help.back.backend.domain.Group;
import com.help.back.backend.domain.GroupUser;

import java.util.List;
import java.util.Map;

public interface GroupDao {
    int postGroup(Group group);
    int deleteGroup(int id);
    int updateGroup(Group group);
    int postGroupUser(GroupUser groupUser);
    int deleteGroupUser(Map map);
    int updateGroupUser(GroupUser groupUser);
    List<GroupUser> getGroupUser(int group_id);
}
