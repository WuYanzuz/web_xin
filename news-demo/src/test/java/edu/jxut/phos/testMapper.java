package edu.jxut.phos;

import edu.jxut.phos.mapper.NewsMapper;
import edu.jxut.phos.pojos.News;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Mengyuan Zhang
 * @Date 2022/6/9 16:47
 * @CreatedBy IntelliJ IDEA
 * @Details
 */
@SpringBootTest(classes = NewsApplication.class)
@Slf4j
public class testMapper {
    @Autowired
    private NewsMapper newsMapper;

    @Test
    public void testMapeer(){
        List<News> news = newsMapper.selectList(null);
        log.info("new:{}",news);
    }
}
