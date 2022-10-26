package EC2AngelCuchilloBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2AngelCuchilloBodega.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
