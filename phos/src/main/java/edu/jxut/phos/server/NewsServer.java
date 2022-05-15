package edu.jxut.phos.server;

import edu.jxut.phos.mapper.UserCommentMapper;
import edu.jxut.phos.pojos.UserComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author MengYuan Zhang
 * @Date 2022/5/14 16:07
 * @CreatedBy IntelliJ IDEA
 */
@Service
public class NewsServer {
    @Autowired
    private UserCommentMapper userCommentMapper;

    /**
    * @Description: 查询评论列表
    * @Param:
    * @return:
    * @Author: MengYuan
    * @Date: 2022/5/15
    */
    public List selectList(){
        List<UserComment> userComments = userCommentMapper.selectList(null);
        return userComments;
    }

    public String addComment(UserComment userComment){
        UserComment userComment1 = new UserComment();
        userComment1.setComment(userComment.getComment());
        userComment1.setDateTime(new Date());
        userComment1.setName(userComment.getName());
        int insert = userCommentMapper.insert(userComment1);
        if (insert>0){
            return "success";
        }else {
            return "error";
        }
    }
}
