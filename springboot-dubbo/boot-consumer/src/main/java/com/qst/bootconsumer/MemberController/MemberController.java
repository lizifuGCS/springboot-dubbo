package com.qst.bootconsumer.MemberController;


import com.alibaba.dubbo.config.annotation.Reference;
import com.qst.interfaces.MemberService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MemberController {

    @Reference
    private MemberService memberService;

    @RequestMapping(value = "/dubbo/say/{name}")
    public String sayHello(@PathVariable("name") String name) {

        String result = memberService.getMember(name);
        return result;


    }
}
