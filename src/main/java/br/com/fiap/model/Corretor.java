package br.com.fiap.model;

public class Corretor {

        private int id;
        private String nome;
        private String registro;

        public Corretor(int id, String nome, String registro) {
            this.id = id;
            this.nome = nome;
            this.registro = registro;
        }

        public String getNome() {
            return nome;
        }
        public String getRegistro() {
            return registro;
        }
}
