package one.digitalinnovation.repository;

import org.springframework.data.repository.CrudRepository;

import one.digitalinnovation.entity.Endereco;

// Conexão do DATA JPA pela interface que vai mexer no banco de dados, no caso aqui é a do tipo CrudRepository. Recebe a entity (Endereco) e o tipo (String)

public interface EnderecoRepository extends CrudRepository <Endereco,String> {
    
}
