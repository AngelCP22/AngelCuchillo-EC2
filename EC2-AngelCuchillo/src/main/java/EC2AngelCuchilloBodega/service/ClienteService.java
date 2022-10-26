package EC2AngelCuchilloBodega.service;

import java.util.List;

import EC2AngelCuchilloBodega.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
	
}
