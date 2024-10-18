package br.com.fiap.model;

import java.time.LocalDate;

public class Pagamento { //classe nao anemica

        private int id;
        private double valor;
        private String metodoPagamento;
        private LocalDate dataPagamento;
        private boolean status;

        public Pagamento(int id, double valor, String metodoPagamento, LocalDate dataPagamento, boolean status) {
            this.id = id;
            this.valor = valor;
            this.metodoPagamento = metodoPagamento;
            this.dataPagamento = dataPagamento;
            this.status = status;
        }

        public void confirmarPagamento() {
            if (!status) {
                this.status = true;
                this.dataPagamento = LocalDate.now();
                System.out.println("PAGAMENTO CONFIRMADO!.");
            } else {
                System.out.println("PAGAMENTO JA REALIZADO!");
            }
        }

        public double calcularMultaPorAtraso(LocalDate dataVencimento) {
            if (LocalDate.now().isAfter(dataVencimento) && !status) {
                long diasDeAtraso = LocalDate.now().toEpochDay() - dataVencimento.toEpochDay();
                double multa = diasDeAtraso * 0.02 * valor;
                return multa;
            }
            return 0;
        }

        public int getId() {
            return id;
        }

        public double getValor() {
            return valor;
        }

        public String getMetodoPagamento() {
            return metodoPagamento;
        }

        public LocalDate getDataPagamento() {
            return dataPagamento;
        }

        public boolean isPago() {
            return status;
        }
}
