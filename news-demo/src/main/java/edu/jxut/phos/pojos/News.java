package edu.jxut.phos.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


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
    private String comments;
    private String imag;
    @TableField(exist = false)
    private String timePass;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatTime;
    private String author;
}
