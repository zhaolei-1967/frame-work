package me.zhaolei.framework.user.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import me.zhaolei.framework.user.domain.User;
import me.zhaolei.framework.user.repositories.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<User> findAll() {
		return this.entityManager.createQuery("SELECT n FROM User n", User.class).getResultList();
	}
}
