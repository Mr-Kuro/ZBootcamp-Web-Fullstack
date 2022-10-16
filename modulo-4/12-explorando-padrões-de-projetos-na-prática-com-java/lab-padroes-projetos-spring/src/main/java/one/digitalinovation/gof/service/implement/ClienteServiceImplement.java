package one.digitalinovation.gof.service.implement;

import one.digitalinovation.gof.model.Cliente;
import one.digitalinovation.gof.model.ClienteRepsitory;
import one.digitalinovation.gof.model.Endereco;
import one.digitalinovation.gof.model.EnderecoRepository;
import one.digitalinovation.gof.service.ClienteService;
import one.digitalinovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação de <b>Strategy</b> (@link ClienteService),  a qual pode ser injetada pelo Spring (via (@liink Autowired)). com isso, como essa classe é um (@link Service),, ela será tratada como um <b>Singleton</b>.
 *
 * @author Mr.Kuro
 */
@Service
public class ClienteServiceImplement implements ClienteService {

//     Singleton: Injetar os componentesn do spring com @Autowaired.
    @Autowired
    private ClienteRepsitory clienteServiceRepository;
    @Autowired
    private EnderecoRepository enderecorviceRepository;
    @Autowired
    private ViaCepService viaCepService;

//     Strategy: Implementar os métodos definifos na interface.
//     Facadew: Abstraur Integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
//         Buscar todos os Clientes.
        return clienteServiceRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
//         Buscar  Cliente por ID.
        Optional<Cliente> cliente = clienteServiceRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
//         Buscar Cliente por ID, caso exista.
        salvarClienteComCep(cliente);

//        FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
        this.clienteServiceRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
//        Buscar cliente por ID, caso exista.
        Optional clienteBd = clienteServiceRepository.findById(id);
        if (clienteBd.isPresent()){
            this.salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteServiceRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        //         Verificar se o Endereco do Cliente já existe (pelo Cep).
        String cep = cliente.getEndereco().getCep();
        Object endereco = enderecorviceRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecorviceRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco((Endereco) endereco);
    }

}
