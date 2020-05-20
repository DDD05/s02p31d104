package com.help.back.backend.web;

import com.help.back.backend.domain.User;
import com.help.back.backend.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Api(tags = {"1. User"})
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "유저 조회", notes = "검색 조건에 맞는 유저를 조회합니다.")
    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser(@RequestParam("content") String content, @RequestParam("option") String option) throws Exception{
        List<User> list = null;
        try {
            System.out.println("유저 검색");
            System.out.println("조건 : " + option + " 내용 : " + content);
            if(option.equals("name")){
                list = userService.getUsersByName(content);
            }else if(option.equals("email")){
                list = userService.getUsersByEmail(content);
            }else if(option.equals("id")){
                list = userService.getUsersById(Integer.parseInt(content));
            }else{
                list = userService.getUsers();
            }

            System.out.println(list);
            return new ResponseEntity<List<User>>(list,HttpStatus.OK);
        }catch(Exception e) {
            return new ResponseEntity<List<User>>(list,HttpStatus.NO_CONTENT);
        }
    }

    @ApiOperation(value = "유저 추가", notes = "유저 정보를 추가합니다.")
    @PostMapping("/user")
    public ResponseEntity postUser(@RequestBody User user) throws Exception{
        try {
            System.out.println("유저 추가");
            System.out.println(user.toString());
            int ans = userService.postUser(user);
            System.out.println("추가 성공  : " + ans);
            return new ResponseEntity(HttpStatus.OK);
        }catch(Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @ApiOperation(value = "유저 수정", notes = "유저를 수정합니다.")
    @PutMapping("/user")
    public ResponseEntity updateUser(@RequestBody User user) throws Exception{
        try {
            System.out.println("유저 수정");
            System.out.println(user.toString());
            int ans = userService.updateUser(user);
            System.out.println("수정 성공  : " + ans);
            return new ResponseEntity(HttpStatus.OK);
        }catch(Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @ApiOperation(value = "유저 삭제", notes = "유저를 삭제합니다.")
    @DeleteMapping("/user")
    public ResponseEntity deleteUser(@RequestParam("user_id") int user_id) throws Exception{
        try {
            System.out.println("유저 삭제");
            System.out.println(user_id);
            int ans = userService.deleteUser(user_id);
            System.out.println("삭제 성공  : " + ans);
            return new ResponseEntity(HttpStatus.OK);
        }catch(Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
}
