package EC2AngelCuchilloBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2AngelCuchilloBodega.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
