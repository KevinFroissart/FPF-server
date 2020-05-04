package fr.fairepartfait.server.repositories;

import fr.fairepartfait.server.models.CardShape;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface CardShapeRepository extends CrudRepository<CardShape, Integer> { }
