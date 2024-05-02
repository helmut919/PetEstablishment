package es.upm.dit.isst.mascotmercio21.repository;

import es.upm.dit.isst.mascotmercio21.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    List<Cliente> findAll();
    Cliente findById(Cliente id);
}


