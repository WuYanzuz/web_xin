package edu.jxut.phos.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @Author MengYuan Zhang
 * @Date 2022/5/14 16:02
 * @CreatedBy IntelliJ IDEA
 */
@Data
@TableName("news")
public class News {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String comment;
}
