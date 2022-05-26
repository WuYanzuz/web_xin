package edu.jxut.phos;

import com.baomidou.mybatisplus.annotation.TableId;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @Author MengYuan Zhang
 * @Date 2022/5/25 19:33
 * @CreatedBy IntelliJ IDEA
 * @Details
 */
public class Random6 {

    @Test
    public void out6Code(){

        int v = (int) ((Math.random() * 9 + 1) * 100000);
        System.out.println(v);
        int i = 1;
        String str = "";
        switch(i){
            case 0: str = str + "zero";
            case 1: str = str + "one";
            case 2: str = str.toUpperCase() + "two";
            default: str = str + "default";
        }
        System.out.print(str);

    }
    @Test
    public void lesson2(){
        int x = 0;
        x = 'a' > 'b' ? 1 : 2;
    }
}
