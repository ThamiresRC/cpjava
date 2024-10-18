package br.com.fiap.model;
import java.time.LocalDate;

public class Seguro { //classe nao anemica

        private int id;
        private String tipo;
        private double valorBase;
        private LocalDate dataInicio;
        private LocalDate dataFim;
        private double desconto;

        private Seguro(int id, String tipo, double valorBase, LocalDate dataInicio, LocalDate dataFim) {
            this.id = id;
            this.tipo = tipo;
            this.valorBase = valorBase;
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
            this.desconto = desconto;
        }

        public double calcularValorTotal() {
            return valorBase - (valorBase * desconto / 100);
        }
        public boolean isSeguroAtivo() {
            return LocalDate.now().isBefore(dataFim);
        }
        public int getId() {
            return id;
        }
        public String getTipo() {
            return tipo;
        }

     public static Seguro createSeguro(int id, String tipo, double valor, LocalDate dataInicio, LocalDate dataFim) { //a clsse seguroFactory tera acesso a esse metodo para criar instancias
        return new Seguro(id, tipo, valor, dataInicio, dataFim);
    }
}
