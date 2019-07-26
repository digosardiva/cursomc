package tk.rsardiva.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import tk.rsardiva.cursomc.domain.Categoria;
import tk.rsardiva.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElse(null);		
	}
	
}
