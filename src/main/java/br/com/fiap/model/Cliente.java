package br.com.fiap.model;

public class Cliente { //classe não anemica

        private int id;
        private String nome;
        private String cpf;

        public Cliente(int id, String nome, String cpf) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
        }

        public void setNome(String nome) {
            if (nome == null || nome.isEmpty()) {
                throw new IllegalArgumentException("NOME VALIDO!");
            }
            this.nome = nome;
        }

        private void setCpf(String cpf) {
            if (!cpf.matches("\\d{11}")) {
                throw new IllegalArgumentException("CPF INVALIDO!");
            }
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }
        public String getCpf() {
            return cpf;
        }
        public int getId() {
            return id;
        }
        public static Cliente createCliente(int id, String nome, String cpf) { //a clsse clienteFactory tera acesso a esse metodo para criar instancias
        return new Cliente(id, nome, cpf);
    }
}

