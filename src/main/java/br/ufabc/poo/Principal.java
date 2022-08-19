package main.java.br.ufabc.poo;
import main.java.br.ufabc.poo.instrumento.Instrumento;
import main.java.br.ufabc.poo.instrumento.corda.Guitarra;
import main.java.br.ufabc.poo.instrumento.corda.Violao;
import main.java.br.ufabc.poo.instrumento.piano.Armario;
import main.java.br.ufabc.poo.instrumento.piano.EfeitoSonoro;
import main.java.br.ufabc.poo.instrumento.piano.Piano;
import main.java.br.ufabc.poo.musico.Musico;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Principal {
    public static void menu2(Musico musico, ArrayList instrumentosMusico){
        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        while (opcao !=0) {
            System.out.println("\n");
            System.out.println("Digite uma opção para o musico:");
            System.out.println("1- Criar um novo violao");
            System.out.println("2- Criar um novo guitarra");
            System.out.println("3- Criar um novo piano");
            System.out.println("4- Tocar todos instrumentos");
            System.out.println("5- Informacoes do musico");
            System.out.println("0- Sair");
            System.out.println("----------------");

            opcao = parseInt(entrada.nextLine());

            switch (opcao) {
                case 0: {
                    System.out.println("Saindo");
                    System.exit(opcao);
                    break;
                }
                case 1: {
                    System.out.println("\n");
                    System.out.println("Digite marca do violao:");
                    String marca = entrada.nextLine();

                    System.out.println("Digite o lote de fabricacao do violao:");
                    long lote = Long.parseLong(entrada.nextLine());

                    System.out.println("Digite numero de cordas do violao:");
                    int cordas = Integer.parseInt(entrada.nextLine());

                    Violao violao = new Violao(marca, lote, cordas);
                    instrumentosMusico.add(violao);

                    System.out.println(violao.toString() + " criado");
                    break;
                }
                case 2: {
                    System.out.println("\n");
                    System.out.println("Digite marca da guitarra:");
                    String marca = entrada.nextLine();

                    System.out.println("Digite o lote de fabricacao da guitarra:");
                    long lote = Long.parseLong(entrada.nextLine());

                    System.out.println("Digite numero de cordas da guitarra:");
                    int cordas = Integer.parseInt(entrada.nextLine());

                    Guitarra guitarra = new Guitarra(marca, lote, cordas);
                    instrumentosMusico.add(guitarra);

                    System.out.println(guitarra.toString() + " criada");

                    break;
                }
                case 3: {
                    System.out.println("\n");
                    System.out.println("Digite marca do piano:");
                    String marca = entrada.nextLine();

                    System.out.println("Digite o lote de fabricacao do piano:");
                    long lote = Long.parseLong(entrada.nextLine());

                    System.out.println("Digite a madeira do armario do piano:");
                    Armario armario = new Armario(entrada.nextLine());

                    System.out.println("Digite numero de pedais:");
                    int pedais = Integer.parseInt(entrada.nextLine());

                    System.out.println("Digite numero de cordas da teclas:");
                    int teclas = Integer.parseInt(entrada.nextLine());

                    ArrayList efeitos = new ArrayList<>();

                    Piano piano = new Piano(marca, lote, efeitos, armario, false, pedais,teclas);
                    instrumentosMusico.add(piano);

                    System.out.println(piano.toString() + " criada");

                    break;
                }
                case 4: {
                    System.out.print(musico.tocarInstrumento());
                    break;
                }
                case 5:{
                    System.out.print(musico.toString());
                    break;
                }
                default: {
                    System.out.println("Opção " + opcao + " inválida.");
                    break;
                }
            }
        }
    }

    public static void main (String args[]){
                Scanner entrada = new Scanner(System.in);
                int opcao = -1;

                while (opcao != 0) {
                    System.out.println("\n");
                    System.out.println("Digite uma opção:");
                    System.out.println("1- Criar um novo musico");
                    System.out.println("0- Sair");
                    System.out.println("----------------");

                    opcao = parseInt(entrada.nextLine());

                    switch (opcao) {
                        case 1: {
                            System.out.println("\n");
                            System.out.println("Digite o nome do musico:");

                            ArrayList instrumentosMusico = new ArrayList<>();

                            Musico musicoInstancia = new Musico(entrada.nextLine(), instrumentosMusico);

                            menu2(musicoInstancia, instrumentosMusico);

                            break;
                        }
                        case 0: {
                            System.out.println("Obrigado.");
                            System.exit(opcao);
                        }
                        default: {
                            System.out.println("Opção " + opcao + " inválida.");
                            break;
                        }
                    }
                }
                entrada.close();
            }
        }

