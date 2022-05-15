package edu.jxut.phos;

import com.baomidou.mybatisplus.annotation.TableId;
import edu.jxut.phos.mapper.NewsMapper;
import edu.jxut.phos.mapper.UserCommentMapper;
import edu.jxut.phos.pojos.News;
import edu.jxut.phos.pojos.UserComment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class PhosApplicationTests {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private UserCommentMapper userCommentMapper;
    @Test
    void contextLoads() {
        for (int i = 0; i < 5; i++) {
            News news = new News();
            news.setTitle(i+"s");
            news.setAuthor(i+"a");
            news.setComment(i+"c");
            newsMapper.insert(news);
        }

    }

    @Test
    public void testInsert(){
        UserComment userComment = new UserComment();
        userComment.setComment("拍的真是太漂亮了，下次还来！");
        userComment.setDateTime(new Date());
        userComment.setName("花容");
        userCommentMapper.insert(userComment);
    }

    @Test
    public void selectComment(){
        List<UserComment> userComments = userCommentMapper.selectList(null);
        userComments.forEach(s-> System.out.println(s));
    }
}
