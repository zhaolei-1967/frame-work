package me.zhaolei.framework.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户管理模块启动程序。
 * @author zhaolei
 * 2018.5.28
 */
@SpringBootApplication
public class UserManagerStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserManagerStarter.class, args);
	}
}
