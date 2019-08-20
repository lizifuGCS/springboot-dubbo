package com.qst.bootprovider.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.qst.interfaces.MemberService;
import org.springframework.stereotype.Component;


@Component
@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public String getMember(String s) {
        return "Hello "+s;
    }
}
