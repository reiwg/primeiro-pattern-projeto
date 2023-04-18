package one.digitalinnovation.service;
import one.digitalinnovation.entity.Cliente;

/**
 * Interface que define o padrão Strategy(aqui no caso é a do crudrepository) no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 */

//  Aqui é definida a interface que vai ser usada para puxar os métodos no controller, há uma classe que vai implementar essa interface (ClienteServiceimpl
// Aqui não são definidas as regras de negócios, sim no impl
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}