package EC2AngelCuchilloBodega.service;

import java.util.List;

import EC2AngelCuchilloBodega.model.Producto;

public interface ProductoService {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);

}
