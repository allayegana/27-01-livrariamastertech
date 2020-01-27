package br.com.mastertech.livraria.repository;

import br.com.mastertech.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel,String> {
}
