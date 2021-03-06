package com.pinux.controller.exam;


import com.pinux.entity.user.User;
import com.pinux.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pinux
 * @since 2019-09-24
 */
@RestController
@RequestMapping("/exam")
public class ExamController {
    @Value("${com.pinux.value}")
    private int i;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    String index(){
        System.out.println(i);
        return "hello 阿斯顿撒阿打算的撒的 阿斯蒂芬boot阿斯顿发送到发送到发放";
    }

    @RequestMapping("/error")
    public String error() throws Exception{
        throw new Exception();
    }

}/**/
