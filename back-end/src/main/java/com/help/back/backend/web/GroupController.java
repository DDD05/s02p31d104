package com.help.back.backend.web;

import com.help.back.backend.domain.Group;
import com.help.back.backend.domain.Schedule;
import com.help.back.backend.service.GroupService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"1. Group"})
@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping("v1/group")
    public ResponseEntity<Group> postPersonalSchedule(@RequestBody Group group) throws Exception{
        try {
            System.out.println("그룹 추가");
            System.out.println(group.toString());
            int ans = groupService.postGroup(group);
            if(ans == 1){
                System.out.println("추가 : " + group.toString());
                return new ResponseEntity<Group>(group, HttpStatus.OK);
            }else{
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
        }catch(Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
}
