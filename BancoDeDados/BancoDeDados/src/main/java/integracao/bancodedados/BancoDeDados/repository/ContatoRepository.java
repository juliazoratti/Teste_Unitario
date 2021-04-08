package integracao.bancodedados.BancoDeDados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import integracao.bancodedados.BancoDeDados.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{
	
	public ContatoModel findFirstByNome (String nome);
	public List<ContatoModel> findAllByNomeIgnoreCaseContaining (String nome);

}
