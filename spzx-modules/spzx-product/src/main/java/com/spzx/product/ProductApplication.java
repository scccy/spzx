package com.spzx.product;


import com.spzx.common.security.annotation.EnableCustomConfig;
import com.spzx.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCustomConfig
@EnableRyFeignClients
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
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
