package cn.edu.nuc.acmicpc.service;

import cn.edu.nuc.acmicpc.common.BasicTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IDEA
 * User: chuninsane
 * Date: 16/4/6
 * Email service test.
 */
public class EmailServiceTest extends BasicTest{

    @Autowired
    private EmailService emailService;

    @Test
    public void sendEmail() {
        emailService.send("chuninsane@163.com", "测试邮件", "hello!");
    }
}
