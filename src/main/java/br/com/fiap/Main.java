package br.com.fiap;

import br.com.fiap.dao.ClienteDaoImplements;
import br.com.fiap.model.Cliente;

import java.sql.*;
import java.util.Scanner;

public class Main {

        public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        public static final String USER = "RM558128";
        public static final String PASS = "210501";

        public static void main(String[] args) {

            ClienteDaoImplements clienteDao = ClienteDaoImplements.getInstance();


            Cliente cliente1 = new Cliente(1, "João Silva","457-874-987-36");
            Cliente cliente2 = new Cliente(2, "Maria Oliveira","789-214-659-21");
            Cliente cliente3 = new Cliente(3, "Flaviana Moura","110-278-698-74");
            clienteDao.salvar(cliente1);
            clienteDao.salvar(cliente2);
            clienteDao.salvar(cliente3);


            Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Buscar Cliente por ID");
                System.out.println("2 - Deletar Cliente por ID");
                System.out.println("0 - Sair");
                int opcao = scanner.nextInt();

                if (opcao == 0) {
                    break;
                   }
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o ID do cliente que deseja buscar: ");
                        int idParaBuscar = scanner.nextInt();
                        Cliente clienteBuscado = clienteDao.buscarPorId(idParaBuscar);
                        if (clienteBuscado != null) {
                            System.out.println("Cliente encontrado: " + clienteBuscado.getNome());
                        } else {
                            System.out.println("Cliente com ID " + idParaBuscar + " não encontrado.");
                                }
                        break;

                        case 2:
                            System.out.print("Digite o ID do cliente que deseja deletar: ");
                            int idParaDeletar = scanner.nextInt();
                            clienteDao.deletar(idParaDeletar); 
                            break;

                            default: System.out.println("Opção inválida. Tente novamente.");
                        }
                    }


                    scanner.close();
                }
            }

