package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();

        if (cargoAtual == Cargo.GERENTE) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (!metaBatida) {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }

        Cargo proximoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(proximoCargo);
    }
}
