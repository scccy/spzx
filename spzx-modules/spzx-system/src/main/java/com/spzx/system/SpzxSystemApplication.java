package com.spzx.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spzx.common.security.annotation.EnableCustomConfig;
import com.spzx.common.security.annotation.EnableRyFeignClients;

/**
 * 系统模块
 *
 * @author spzx
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class SpzxSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpzxSystemApplication.class, args);
        System.out.println("""
                ✋
                 ＼＼
                 ＼  👴
                 > ⌒ヽ
                 /   へ＼
                 /  / ＼＼
                 ﾚ ノ   ヽ_👉
                 / /
                 / /|
                 ( (ヽ
                 | |、＼
                 | 丿 ＼ ⌒)
                 | |  ) /
                 ノ )  Lﾉ
                 (_ #Ymca """);
    }
}
