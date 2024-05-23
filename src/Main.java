import java.util.*;
import java.lang.*;
import java.io.*;

        class Codechef {
            public static void main(String[] args) throws java.lang.Exception {
                int numeroAcertos = 0;
                System.out.println("Centro Universitário Alfredo Nasser");
                System.out.println("Aluno(a): Nathalya Martins Lourenço");
                System.out.println("Profº: Brenno Pimenta");
                System.out.println("Turma: ESN2");
                System.out.println("Tema: Conhecimentos Gerais");
                // chama os métodos dos grupos
                numeroAcertos = numeroAcertos + grupo2();
                // grupo3
                // grupo4
                // grupoN
                System.out.println("Fim do Quiz! Parabéns... De 15 perguntas você acertou: " + numeroAcertos);
            }

            public static int grupo2() {
                int cont = 0; // contador de respostas corretas
                String respostaUsuario = "";
                System.out.println("=====================================================");
                Questao questao1 = new Questao();
                questao1.pergunta = "1-Qual é a capital do Brasil?";
                questao1.opcaoA = "A - Rio de Janeiro";
                questao1.opcaoB = "B - Brasília";
                questao1.opcaoC = "C - São Paulo";
                questao1.opcaoD = "D - Belo Horizonte";
                questao1.correta = "B";
                questao1.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao1.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao2 = new Questao();
                questao2.pergunta = "2-Quem descobriu o Brasil?";
                questao2.opcaoA = "A - Miguel de Cervantes";
                questao2.opcaoB = "B - Machado de Assis";
                questao2.opcaoC = "C - Pedro Álvares de Cabral";
                questao2.opcaoD = "D - Nicollas Cage";
                questao2.correta = "C";
                questao2.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao2.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao3 = new Questao();
                questao3.pergunta = "3-Qual é o maior planeta do Sistema Solar?";
                questao3.opcaoA = "A - Terra";
                questao3.opcaoB = "B - Júpiter";
                questao3.opcaoC = "C - Saturno";
                questao3.opcaoD = "D - Marte";
                questao3.correta = "B";
                questao3.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao3.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao4 = new Questao();
                questao4.pergunta = "4-Qual é o satélite natural da Terra?";
                questao4.opcaoA = "A - Sol";
                questao4.opcaoB = "B - Lua";
                questao4.opcaoC = "C - Marte";
                questao4.opcaoD = "D - Júpter";
                questao4.correta = "B";
                questao4.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao4.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao5 = new Questao();
                questao5.pergunta = "5-Do que é formado a litosfera?";
                questao5.opcaoA = "A - Rios e Mares";
                questao5.opcaoB = "B - Solos, Rochas e Minerais";
                questao5.opcaoC = "C - Fauna e Flora";
                questao5.opcaoD = "D - Ar oxigênio";
                questao5.correta = "B";
                questao5.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao5.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao6 = new Questao();
                questao6.pergunta = "6-Em qual continente se localiza o Egito?";
                questao6.opcaoA = "A - África";
                questao6.opcaoB = "B - Oceania";
                questao6.opcaoC = "C - Europa";
                questao6.opcaoD = "D - América do Sul";
                questao6.correta = "A";
                questao6.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao6.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao7 = new Questao();
                questao7.pergunta = "7-Qual oceano banha o Brasil?";
                questao7.opcaoA = "A - Índico";
                questao7.opcaoB = "B - Atlântico";
                questao7.opcaoC = "C - Pacífico";
                questao7.opcaoD = "D - Ártico";
                questao7.correta = "B";
                questao7.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao7.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao8 = new Questao();
                questao8.pergunta = "8-Quem nasce em Pindamonhangaba é o que?";
                questao8.opcaoA = "A - Pindamonhangabeiro";
                questao8.opcaoB = "B - Pindamonhangabo";
                questao8.opcaoC = "C - Pindamonhangabense";
                questao8.opcaoD = "D - Pindamonhanbista";
                questao8.correta = "C";
                questao8.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao8.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao9 = new Questao();
                questao9.pergunta = "9-Qual o bioma predominante no Estado de Goiás?";
                questao9.opcaoA = "A - Pantanal";
                questao9.opcaoB = "B - Cerrado";
                questao9.opcaoC = "C - Caatinga";
                questao9.opcaoD = "D - Amazonia";
                questao9.correta = "B";
                questao9.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao9.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao10 = new Questao();
                questao10.pergunta = "10-Qual o nome do atual Presidente dos EUA?";
                questao10.opcaoA = "A - Barack Obama";
                questao10.opcaoB = "B - Joe Biden";
                questao10.opcaoC = "C - Hillary Clinton";
                questao10.opcaoD = "D - Donald Trump";
                questao10.correta = "B";
                questao10.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao10.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao11 = new Questao();
                questao11.pergunta = "11-Qual o maior estado brasileiro?";
                questao11.opcaoA = "A - Goiás";
                questao11.opcaoB = "B - Pará";
                questao11.opcaoC = "C - Amazonas";
                questao11.opcaoD = "D - Acre";
                questao11.correta = "C";
                questao11.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao11.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao12 = new Questao();
                questao12.pergunta = "12-Qual o menor estado brasileiro?";
                questao12.opcaoA = "A - Sergipe";
                questao12.opcaoB = "B - Acre";
                questao12.opcaoC = "C - Goiás";
                questao12.opcaoD = "D - Distrito Federal";
                questao12.correta = "A";
                questao12.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao12.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao13 = new Questao();
                questao13.pergunta = "13-Quantos países compõem a America Latina?";
                questao13.opcaoA = "A - 32";
                questao13.opcaoB = "B - 15";
                questao13.opcaoC = "C - 41";
                questao13.opcaoD = "D - 20";
                questao13.correta = "D";
                questao13.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao13.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao14 = new Questao();
                questao14.pergunta = "14-Qual o maior rio do mundo?";
                questao14.opcaoA = "A - Rio Congo";
                questao14.opcaoB = "B - Rio Paraná";
                questao14.opcaoC = "C - Rio Nilo";
                questao14.opcaoD = "D - Rio Mekong";
                questao14.correta = "C"; //
                questao14.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao14.isCorreta(respostaUsuario)) {
                    cont++;
                }
                System.out.println("=====================================================");

                Questao questao15 = new Questao();
                questao15.pergunta = "15-Qual o pico mais alto do Brasil?";
                questao15.opcaoA = "A - Monte Roraima";
                questao15.opcaoB = "B - Pedra da Mina";
                questao15.opcaoC = "C - Pico da Neblina";
                questao15.opcaoD = "D - Pico da Bandeira";
                questao15.correta = "C";
                questao15.escrevaQuestao();
                respostaUsuario = leiaResposta();
                if (questao15.isCorreta(respostaUsuario)) {
                    cont++;
                }

                return cont;
            }

            public static String leiaResposta() {
                Scanner ler = new Scanner(System.in);
                String resp;
                do {
                    System.out.println("Digite sua resposta: ");
                    resp = ler.next();
                } while (!respostaValida(resp));
                return resp;
            }

            public static boolean respostaValida(String resp) {
                if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C")
                        || resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
                    return true;
                }
                System.out.println("Resposta inválida ... ");
                return false;
            }

            public static class Questao {
                String pergunta = "";
                String opcaoA = "";
                String opcaoB = "";
                String opcaoC = "";
                String opcaoD = "";
                String opcaoE = "";
                String correta = "";

                public boolean isCorreta(String resposta) {
                    if (resposta.equalsIgnoreCase(this.correta)) {
                        System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                        return true;
                    } else {
                        System.out.println("Resposta Errada!");
                        System.out.println("A opção correta é a letra: " + this.correta);
                        return false;
                    }
                }

                public void escrevaQuestao() {
                    System.out.println(this.pergunta);
                    System.out.println();
                    System.out.println(this.opcaoA);
                    System.out.println(this.opcaoB);
                    System.out.println(this.opcaoC);
                    System.out.println(this.opcaoD);
                    System.out.println(this.opcaoE);
                    System.out.println();
                }
            }
        }
