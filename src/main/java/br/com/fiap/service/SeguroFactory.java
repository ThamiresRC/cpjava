package br.com.fiap.service;

import br.com.fiap.model.Seguro;

import java.time.LocalDate;

public class SeguroFactory {

        public static Seguro criarSeguro(int id, String tipo, double valor, LocalDate dataInicio, LocalDate dataFim) {
            if (id <= 0) {
                throw new IllegalArgumentException("ID deve ser maior que zero.");
            }

            if (tipo == null || tipo.trim().isEmpty()) {
                throw new IllegalArgumentException("Tipo de seguro nao pode ser vazio.");
            }

            if (valor <= 0) {
                throw new IllegalArgumentException("O valor do seguro deve ser maior que zero.");
            }

            if (dataFim.isBefore(dataInicio)) {
                throw new IllegalArgumentException("A data de fim nao pode ser anterior a data de inicio.");
            }

            return Seguro.createSeguro(id, tipo, valor, dataInicio, dataFim);

        }
}
