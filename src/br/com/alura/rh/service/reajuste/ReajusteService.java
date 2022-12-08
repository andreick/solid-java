package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        validacoes.forEach(it -> it.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.reajustarSalario(salarioReajustado);
    }
}