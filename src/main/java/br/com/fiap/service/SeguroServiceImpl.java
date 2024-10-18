package br.com.fiap.service;

import br.com.fiap.dao.SeguroDAO;
import br.com.fiap.dao.SeguroDaoImplements;
import br.com.fiap.model.Seguro;

import java.util.List;

public class SeguroServiceImpl implements SeguroService {

        private SeguroDAO seguroDAO = SeguroDaoImplements.getInstance(); 

        private static SeguroServiceImpl instanciaSingleton; 
        private SeguroServiceImpl() {}

        public static SeguroServiceImpl getInstance() {
            if (instanciaSingleton == null) {
                instanciaSingleton = new SeguroServiceImpl();
            }
            return instanciaSingleton;
        }

        @Override
        public void salvarSeguro(Seguro seguro) {
            seguroDAO.salvar(seguro);
            System.out.println("Seguro salvo com sucesso! ID: " + seguro.getId());
        }



        @Override
            public Seguro buscarSeguroPorId(int id) {
                Seguro seguro = seguroDAO.buscarPorId(id);
                if (seguro == null) {
                    System.out.println("Seguro não encontrado com o ID: " + id);
                }
                return seguro;
            }

        @Override
        public List<Seguro> listarSeguros() {
            return seguroDAO.listarTodos();
        }

        @Override
        public void atualizarSeguro(Seguro seguro) {
            seguroDAO.atualizar(seguro);
            System.out.println("Seguro atualizado com sucesso! ID: " + seguro.getId());
        }

        @Override
        public void deletarSeguro(int id) {
            seguroDAO.remover(id);
            System.out.println("Seguro removido com sucesso! ID: " + id);
        }

        @Override
        public double calcularValorSeguro(Seguro seguro) {
            double valorTotal = seguro.calcularValorTotal();
            System.out.println("Valor total do seguro (com desconto aplicado): " + valorTotal);
            return valorTotal;
        }

        @Override
        public boolean verificarSeguroAtivo(Seguro seguro) {
            boolean ativo = seguro.isSeguroAtivo();
            if (ativo) {
                System.out.println("O seguro está ativo.");
            } else {
                System.out.println("O seguro está inativo.");
            }
            return ativo;
        }

}
