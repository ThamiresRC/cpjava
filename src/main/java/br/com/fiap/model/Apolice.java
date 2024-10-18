package br.com.fiap.model;
import java.time.LocalDate;

public class Apolice {

        private int numero;
        private LocalDate dataInicio;
        private LocalDate dataFim;

        public Apolice(int numero, LocalDate dataInicio, LocalDate dataFim) {
            this.numero = numero;
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
        }

        public boolean isApoliceAtiva() {
            return LocalDate.now().isBefore(dataFim);
        }
        public int getNumero() {
            return numero;
        }

}
