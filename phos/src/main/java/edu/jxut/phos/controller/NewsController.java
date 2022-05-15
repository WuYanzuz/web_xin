package edu.jxut.phos.controller;

import edu.jxut.phos.pojos.UserComment;
import edu.jxut.phos.server.NewsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author MengYuan Zhang
 * @Date 2022/5/14 16:06
 * @CreatedBy IntelliJ IDEA
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsServer newsServer;

    @GetMapping("/list")
    public List testList(){
        List<UserComment> userComments = newsServer.selectList();
        return userComments;
    }
    @PostMapping("/add")
    public boolean addComment(@RequestBody UserComment userComment){
        if (newsServer.addComment(userComment).equals("success")){
            return true;
        }else {
            return false;
        }
    }
}
