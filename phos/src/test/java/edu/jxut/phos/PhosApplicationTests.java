package edu.jxut.phos;

import edu.jxut.phos.mapper.NewsMapper;
import edu.jxut.phos.pojos.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhosApplicationTests {

    @Autowired
    private NewsMapper newsMapper;

    @Test
    void contextLoads() {
        News news = new News();
        news.setAuthor("z");
        news.setComment("w");
        news.setTitle("y");
        newsMapper.insert(news);
    }

}
