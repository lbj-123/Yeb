package com.edu.server.config;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;


@Configuration
public class CaptchaConfig {
    @Bean
    public DefaultKaptcha defaultKaptcha(){
        //验证码生成器
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        //配置
        Properties properties = new Properties();
        //是否有边框
        properties.setProperty("kaptcha.border","yes");
        //设置边框颜色
        properties.setProperty("kaptcha.border.color","105,179,90");
        //边框细度，默认为1
        properties.setProperty("kaptcha.border.thickness","1");
        //验证码
        properties.setProperty("kaptcha.session.key","code");
        //验证码文字字符颜色  默认为黑色
        properties.setProperty("kaptcha.textproducer.font.names","宋体,楷体,微软雅黑");
        //字体大小
        properties.setProperty("kaptcha.textproducer.font.size","30");
        //验证码文本字符内容范围  默认为abced2345678gfynmnpwx
        properties.setProperty("kaptcha.textproducer.char.length","4");
        //字符间距  默认为2
        properties.setProperty("kaptcha.textproducer.char.space","4");
        //设置验证码图片宽度  默认200
        properties.setProperty("kaptcha.image.width","100");
        //设置验证码图片高度 默认40
        properties.setProperty("kaptcha.image.height","40");

        // 干扰实现类
        properties.setProperty(Constants.KAPTCHA_NOISE_IMPL, "com.google.code.kaptcha.impl.NoNoise");
        // 图片样式
        properties.setProperty(Constants.KAPTCHA_OBSCURIFICATOR_IMPL, "com.google.code.kaptcha.impl.ShadowGimpy");

        Config config =new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
