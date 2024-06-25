package com.spzx.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.spzx.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 *
 * @author spzx
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpzxAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpzxAuthApplication.class, args);
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
                (_ #Ymca
                """);
    }
}
