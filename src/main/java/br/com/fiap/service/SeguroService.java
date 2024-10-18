package br.com.fiap.service;

import br.com.fiap.model.Seguro;

import java.util.List;

public interface SeguroService {

        void salvarSeguro(Seguro seguro); 

        Seguro buscarSeguroPorId(int id); 

        List<Seguro> listarSeguros(); 
        
        void atualizarSeguro(Seguro seguro); 

        void deletarSeguro(int id); 

        double calcularValorSeguro(Seguro seguro); 

        boolean verificarSeguroAtivo(Seguro seguro); 


}
