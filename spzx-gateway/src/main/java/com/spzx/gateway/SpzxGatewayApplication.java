package com.spzx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author spzx
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpzxGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpzxGatewayApplication.class, args);
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
                (#Ymca
               """);
    }
}
