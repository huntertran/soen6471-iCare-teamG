package ca.concordia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("ca.concordia.mapper")
public class HospitalInformatic {
    public static void main(String[] args) {
        SpringApplication.run(HospitalInformatic.class, args);
    }
}
