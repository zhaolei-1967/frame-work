package me.zhaolei.framework.user.repositories;

import java.util.List;

import me.zhaolei.framework.user.domain.User;

public interface UserRepository {

	public List<User> findAll();
}