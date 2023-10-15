package cn.yang.elasticdemo;

import cn.yang.elasticdemo.util.DemoUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticDemoApplication.class, args);
        DemoUtil.print();
    }

}
