package br.com.fiap.service;

import br.com.fiap.model.Seguro;

import java.util.List;

public interface SeguroService {

        void salvarSeguro(Seguro seguro); // Salvar um novo seguro

        Seguro buscarSeguroPorId(int id); // Buscar seguro pelo ID

        List<Seguro> listarSeguros(); // Listar todos os seguros

        void atualizarSeguro(Seguro seguro); // Atualizar dados de um seguro

        void deletarSeguro(int id); // Deletar seguro pelo ID

        double calcularValorSeguro(Seguro seguro); // Calcular o valor total do seguro (aplicando desconto)

        boolean verificarSeguroAtivo(Seguro seguro); // Verificar se o seguro está ativo


}
