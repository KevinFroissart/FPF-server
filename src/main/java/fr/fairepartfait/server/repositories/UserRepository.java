package fr.fairepartfait.server.repositories;

import fr.fairepartfait.server.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Integer> {



}
