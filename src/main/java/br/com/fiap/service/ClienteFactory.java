package br.com.fiap.service;


import br.com.fiap.model.Cliente;

public class ClienteFactory {

        public static Cliente criarCliente(int id, String nome, String cpf) {
            if (id <= 0) {
                throw new IllegalArgumentException("ID deve ser maior que zero.");
            }

            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio.");
            }

            if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                throw new IllegalArgumentException("CPF INVALIDO! O formato esperado é 'XXX.XXX.XXX-XX'.");
            }

                return Cliente.createCliente(id, nome, cpf);
        }



}


