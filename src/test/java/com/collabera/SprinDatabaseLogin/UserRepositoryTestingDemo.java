package com.collabera.SprinDatabaseLogin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTestingDemo {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private UserRepository repository;

	@Test
	public void testingAddUser() {
		User user = new User();
		user.setEmail("darshan@gmail.com");
		user.setFirstName("darshan");
		user.setLastName("poojary");
		user.setPassword("asdf");
		User u = repository.save(user);
		User existingUser = entityManager.find(User.class, u.getId());
		assertThat(user.getEmail()).isEqualTo(existingUser.getEmail());
	}
}
