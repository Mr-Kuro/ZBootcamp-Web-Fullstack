package one.digitalinovation.gof.service;


import one.digitalinovation.gof.model.Cliente;
import org.springframework.stereotype.Component;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. com isso,  se necessário, poderemos ter multiplas implementações dessa mesma interface.
 *
 * @author Mr.Kuro
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}


