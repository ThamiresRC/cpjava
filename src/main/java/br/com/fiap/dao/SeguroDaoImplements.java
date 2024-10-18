package br.com.fiap.dao;

import br.com.fiap.model.Seguro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeguroDaoImplements implements SeguroDAO {

        private Map<Integer, Seguro> seguros = new HashMap<>(); 

        private static SeguroDaoImplements instanciaSingleton; 

        
        private SeguroDaoImplements() {}

       
        public static SeguroDaoImplements getInstance() {
            if (instanciaSingleton == null) {
                instanciaSingleton = new SeguroDaoImplements();
            }
            return instanciaSingleton;
        }

        @Override
        public void salvar(Seguro seguro) {
            seguros.put(seguro.getId(), seguro);
            System.out.println("Seguro salvo: " + seguro.getTipo() + " (ID: " + seguro.getId() + ")");
        }


         @Override
        public Seguro buscarPorId(int id) {
            Seguro seguro = seguros.get(id);
            if (seguro == null) {
                System.out.println("Seguro com ID " + id + " não encontrado.");
            }
            return seguro;
        }

        @Override
        public List<Seguro> listarTodos() {
            return new ArrayList<>(seguros.values());
        }

        @Override
        public void atualizar(Seguro seguro) {
            if (seguros.containsKey(seguro.getId())) {
                seguros.put(seguro.getId(), seguro);
                System.out.println("Seguro atualizado: " + seguro.getTipo() + " (ID: " + seguro.getId() + ")");
            } else {
                System.out.println("Seguro com ID " + seguro.getId() + " não encontrado para atualizar.");
            }
        }

        @Override
        public void remover(int id) {
            Seguro seguroRemovido = seguros.remove(id);
            if (seguroRemovido != null) {
                System.out.println("Seguro removido: " + seguroRemovido.getTipo() + " (ID: " + id + ")");
            } else {
                System.out.println("Seguro com ID " + id + " não encontrado para remoção.");
            }
        }

}
