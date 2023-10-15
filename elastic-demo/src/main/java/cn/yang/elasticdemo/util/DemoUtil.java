package cn.yang.elasticdemo.util;

import cn.yang.elasticdemo.service.DemoService;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yang
 * @since 2023/10/15 23:22
 */
@Component
public class DemoUtil {

    private static DemoService demoService;

    @Autowired
    public void setDemoService(DemoService demoService) {
        DemoUtil.demoService = demoService;
    }

    public static void print(){
        demoService.demo();
    }
}
