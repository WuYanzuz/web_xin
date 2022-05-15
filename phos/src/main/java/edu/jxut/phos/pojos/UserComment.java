package edu.jxut.phos.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author MengYuan Zhang
 * @Date 2022/5/15 10:38
 * @CreatedBy IntelliJ IDEA
 */
@Data
@TableName("user_comment")
public class UserComment {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    @JsonFormat(pattern = "MM-dd", locale = "zh", timezone = "GMT+8")
    private Date dateTime;
    private String comment;
}
