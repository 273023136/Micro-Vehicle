package com.in9090.common.config;
//import com.github.pagehelper.PageHelper;
//import com.in9090.util.IdWorker;
//import java.util.Properties;
//import javax.servlet.MultipartConfigElement;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
public class MyMapperScannerConfigurer {

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.in9090.*.*.*.mapper");

        return mapperScannerConfigurer;
    }

//    @Bean
//    public PageHelper pageHelper() {
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("offsetAsPageNum", "true");
//        properties.setProperty("rowBoundsWithCount", "true");
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("dialect", "mysql");
//        pageHelper.setProperties(properties);
//        return pageHelper;
//    }

//    @Bean
//    public IdWorker idWorker() {
//        return new IdWorker(1L);
//    }
//
//    @Bean
//    public MultipartConfigElement multipartConfigElement(@Value("${multipart.maxFileSize}") String maxFileSize, @Value("${multipart.maxRequestSize}") String maxRequestSize) {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize(maxFileSize);
//        factory.setMaxRequestSize(maxRequestSize);
//        return factory.createMultipartConfig();
//    }
}