package edu.jxut.phos.controller;

import edu.jxut.phos.mapper.NewsMapper;
import edu.jxut.phos.pojos.News;
import edu.jxut.phos.pojos.UserComment;
import edu.jxut.phos.server.NewsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

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

    @Autowired
    private NewsMapper mapper;

    @GetMapping("/newsList")
    public List newsList(){

        List<News> news = mapper.selectList(null);
        long nowTime = new Date().getTime();
        news.forEach(s-> {
            long l = nowTime - s.getCreatTime().getTime();
            s.setTimePass(
                    l/100000+""
            );
        });
        return news;
    }

    @PostMapping("/add")
    public boolean addComment(@RequestBody News news){
        if (news==null||news.getImag()==null||news.getTitle()==null){
            return false;
        }
        news.setCreatTime(new Date());
        news.setComments(new Random().nextInt(9) + 1+"k评论");
        mapper.insert(news);
        return true;
    }
}
