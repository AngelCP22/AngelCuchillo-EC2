package EC2AngelCuchilloBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2AngelCuchilloBodega.model.Bodega;
@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{

}
