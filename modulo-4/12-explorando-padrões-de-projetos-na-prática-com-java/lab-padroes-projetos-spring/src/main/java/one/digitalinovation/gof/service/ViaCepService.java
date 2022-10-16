package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * cliente HTTP, criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCep</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Sping Cloud Open Feign</a>
 *
 * @author Mr.Kuro
 */
@FeignClient(name = "viacep", url = "http://viacep.com.br")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/(cep)/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
