package me.zhaolei.framework.user.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class User {
	@Id
	@SequenceGenerator(name = "note_generator", sequenceName = "note_sequence", initialValue = 5)
	@GeneratedValue(generator = "note_generator")
	private long id;
	
	@ManyToMany
	private List<Role> roles;
}
