//package ca.concordia.config;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.alibaba.druid.pool.DruidDataSource;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfig {
//
//
//
//    @Bean
//    public DataSource dataSource(JdbcProperties prop){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(prop.getDriverClassName());
//        dataSource.setUrl(prop.getUrl());
//        dataSource.setUsername(prop.getUsername());
//        dataSource.setPassword(prop.getPassword());
//        return dataSource;
//    }
//
//
//
//}
