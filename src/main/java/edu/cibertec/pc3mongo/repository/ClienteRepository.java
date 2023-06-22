package edu.cibertec.pc3mongo.repository;

import edu.cibertec.pc3mongo.document.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface ClienteRepository extends MongoRepository<Cliente, Integer> {
}
