package cn.yang.elasticdemo;

import cn.yang.elasticdemo.util.DemoUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElasticDemoApplicationTests {

    @Test
    void contextLoads() {
        DemoUtil.print();
    }

}
