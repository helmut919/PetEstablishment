package es.upm.dit.isst.mascotmercio21.repository;


import es.upm.dit.isst.mascotmercio21.model.Propietario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PropietarioRepository extends CrudRepository<Propietario, Integer> {
    List<Propietario> findAll();
    Propietario findById(Propietario id);
}
