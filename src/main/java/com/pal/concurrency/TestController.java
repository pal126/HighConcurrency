package com.pal.concurrency;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试
 * @author pal
 * @date 2018/05/18
 */
@Controller
@RequestMapping("/test/")
public class TestController {

    @RequestMapping("test1")
    @ResponseBody
    public String test() {
        return "test";
    }
}
