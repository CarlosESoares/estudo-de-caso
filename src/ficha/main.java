package ficha;

import java.util.Random;
import java.util.Scanner;

public class main {
		public static void main (String[] args) {
			Scanner in = new Scanner (System.in);
			int modificar = 0;
			AtribRaca hab = new AtribRaca ();
			Infos info = new Infos ();
			
			System.out.println("você deseja montar uma ficha inicial? \n ficha (1) ou dado (2)");
			int escolha = in.nextInt();
			if (escolha == 2) {
				System.out.println("qual dado você deseja?/n 4, 6 ,8 ,10 ,12 ,20 ,100:");
				int dado= in.nextInt();
				System.out.println( new Random().nextInt(dado) + 1);
				for (int i = 0; i < 50; i++) {
					System.out.println("você deseja rodar outro dado? /n sim(1) ou não (2)");
					int repeat = in.nextInt();
					if (repeat == 2) {
						break;
					}
					System.out.println("qual dado você deseja?/n 4, 6 ,8 ,10 ,12 ,20 ,100:");
					int dado2= in.nextInt();
					System.out.println( new Random().nextInt(dado2) + 1);
				}	
			} else if (escolha == 1) {
			
			System.out.println("Insira seu nome aqui:");
			String nomeJogador = in.next();
			System.out.println("Insira o nome do seu personagem aqui:");
			String nomePersonagem = in.next();
			System.out.println("Agora você ira selecionar a sua raça, digitando o numero ao lado da classe desejada:");
			for (int i = 0; i < 9; i++) {
				System.out.println(info.nomeRacas[i] + "(" + i + ")"); }
			int numRacas = in.nextInt();
			
			if (numRacas == 0) {
				hab.anao();
			} else if (numRacas == 1) {
				hab.elfo();
			} else if (numRacas == 2) {
				hab.humano();
			} else if (numRacas == 3) {
				hab.pequenino();
			} else if (numRacas == 4) {
				hab.draconato();
			} else if (numRacas == 5) {
				hab.gnomo();
			} else if (numRacas == 6) {
				hab.meioElfo();
			} else if (numRacas == 7) {
				hab.meioOrc();
			} else if (numRacas == 8) {
				hab.tiferino();
			} if (numRacas > 8 || numRacas < 0 ) {
				System.out.println("esse numero de raça não existe! reinicie o progama");
				System.exit(0); }
			
			System.out.println("Escolha sua classe igualmente você escolheu sua raça:");
			for (int i = 0; i < 12; i++) {
				System.out.println(info.nomesClasses [i] + "(" + i + ")"); }
			int numClasse = in.nextInt();
			if (numClasse < 0 || numClasse > 11) {
				System.out.println("esse numero de classe não existe! reinicie o progama");
				System.exit(0);
			}
			 System.out.println("Aqui você tera 27 pontos para gastar comprando as habilidade de seus personagens! \n"
					+ "as suas habilidades são:\n");
			for (int i = 0; i < 6; i++) {
				System.out.println(info.nomeMod[i]);
			}
			System.out.println("\n Abaixo terá uma tabela com a quantidade de pontos da habilidade, o custo e quanto "
					+ "ele modifica o dado.\n" + "Observações! para o calculo de pontos 5 e 6 tem os mesmo valores igualmente 7 e 8\n");
			System.out.println(" Pontos Custo Modificador");
			for (int i = 0; i < 8; i++) {
				int valor = 8;
				String [] custo = { " 0", " 1", "2", "3", "4", "5", "7", "9"};
				String [] modificador = {"-1","-1"," 0"," 0"," 1"," 1"," 2"," 2"};
				System.out.println(" " + (valor + i) + " " + custo [i] + " " + modificador [i]);
			}
			
			int limite = 27;
			
			System.out.println("Quantos você deseja por em " + info.nomeMod [0] +  "?");
			int pontosF = in.nextInt();
			if (pontosF == 6 || pontosF == 8) {
				pontosF = pontosF - 1;
			}
			limite -= pontosF;
			if (limite < 1) {
				System.out.println("você gastou todos os seus pontos!");
				System.exit(0);
			}
			System.out.println("limite: " + limite);
			
			int forca = hab.getAtrib() [0] += pontosF;
			
			System.out.println("Quantos você deseja por em " + info.nomeMod [1] +  "?");
			int pontosD = in.nextInt();
			if (pontosD == 6 || pontosD == 8) {
				pontosD = pontosD - 1;
			}
			limite -= pontosD;
			if (limite < 1) {
				System.out.println("você gastou todos os seus pontos!");
				System.exit(0);
			}
			System.out.println("limite: " + limite);
			int destreza = hab.getAtrib() [1] += pontosD;
			
			System.out.println("Quantos você deseja por em " + info.nomeMod [2] +  "?");
			int pontosC = in.nextInt();
			if (pontosC == 6 || pontosC == 8) {
				pontosC = pontosC - 1;
			}
			limite -= pontosC;
			if (limite < 1) {
				System.out.println("você gastou todos os seus pontos!");
				System.exit(0);
			}
			System.out.println("limite: " + limite);
			int constituicao = hab.getAtrib() [2] += pontosC;
			
			System.out.println("Quantos você deseja por em " + info.nomeMod [3] +  "?");
			int pontosI = in.nextInt();
			if (pontosI == 6 || pontosI == 8) {
				pontosI = pontosI - 1;
			}
			limite -= pontosI;
			if (limite < 1) {
				System.out.println("você gastou todos os seus pontos!");
				System.exit(0);
			}
			System.out.println("limite: " + limite);
			int inteligencia = hab.getAtrib() [3] += pontosI;
			
			System.out.println("Quantos você deseja por em " + info.nomeMod [4] +  "?");
			int pontosS = in.nextInt();
			if (pontosS == 6 || pontosS == 8) {
				pontosS = pontosS - 1;
			}
			limite -= pontosS;
			if (limite < 1) {
				System.out.println("você gastou todos os seus pontos!");
				System.exit(0);
			}
			System.out.println("limite: " + limite);
			int sabedoria = hab.getAtrib() [4] += pontosS;
			
			System.out.println("Quantos você deseja por em " + info.nomeMod [5] +  "?");
			int pontosCr = in.nextInt();
			if (pontosCr == 6 || pontosCr == 8) {
				pontosCr = pontosCr - 1;
			}
			limite -= pontosCr;
			if (limite < 0) {
				System.out.println("você gastou todos os seus pontos!");
				System.exit(0);
			}
			System.out.println("limite: " + limite);
			int carisma = hab.getAtrib() [5] += pontosCr;
			
			int modF = forca/2 - 5;
			int modC = constituicao/2 - 5;
			int modD = destreza/2 - 5;
			int modI = inteligencia/2 - 5;
			int modS = sabedoria/2 - 5;
			int modCr = carisma/2 - 5;
			
			int hp;
			if (numClasse == 0) {
				hp = modC + 12;
			} else if (numClasse == 5 || numClasse == 9) {
				hp = modC + 6;
			} else if (numClasse == 6 || numClasse == 7 || numClasse == 11) {
				hp = modC + 10;
			} else {
				hp = modC + 8;
			}

				System.out.println("\nnome jogador:" + nomeJogador);
				System.out.println("nome peronagem:" + nomePersonagem);
				System.out.println("raça:" + info.nomeRacas[numRacas]);
				System.out.println("classe: " + info.nomesClasses[numClasse]);
				System.out.println("pontos de vida:" + hp);
				System.out.println("iniciativa:" + modD);
				System.out.println("força:" + forca + "(" + modF + ")");
				System.out.println("destreza:" + destreza + "(" + modD + ")");
				System.out.println("contituição:" + constituicao + "(" + modC + ")");
				System.out.println("inteligencia:" + inteligencia + "(" + modI + ")");
				System.out.println("sabedoria:" + sabedoria + "(" + modS + ")");
				System.out.println("carisma:" + carisma + "(" + modCr + ")"); 
				System.out.println("classe e armadura:" + (10 + modC));

				System.out.println("voce deseja modificar a ficha?");
				System.out.println("voce tem a opção '1' e '2'");
				
				int escolha = in.nextInt();
				
				if (escolha == 1) {
					
					System.out.println("voce deseja modificar ");
					System.out.println("(1) os atributos ,(2)classe,");
					
					int escolha2 = in.nextInt();
					
						if (escolha2 == 1) {
							
							int limite2 = 27;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [0] +  "?");
							int pontosF2 = in.nextInt();
							if (pontosF == 6 || pontosF == 8) {
								pontosF = pontosF - 1;
							}
							limite -= pontosF;
							if (limite < 1) {
								System.out.println("você gastou todos os seus pontos!");
								System.exit(0);
							}
							System.out.println("limite: " + limite);
							
							int forca2 = hab.getAtrib() [0] += pontosF;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [1] +  "?");
							int pontosD2 = in.nextInt();
							if (pontosD == 6 || pontosD == 8) {
								pontosD = pontosD - 1;
							}
							limite -= pontosD;
							if (limite < 1) {
								System.out.println("você gastou todos os seus pontos!");
								System.exit(0);
							}
							System.out.println("limite: " + limite);
							int destreza2 = hab.getAtrib() [1] += pontosD;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [2] +  "?");
							int pontosC2 = in.nextInt();
							if (pontosC == 6 || pontosC == 8) {
								pontosC = pontosC - 1;
							}
							limite -= pontosC;
							if (limite < 1) {
								System.out.println("você gastou todos os seus pontos!");
								System.exit(0);
							}
							System.out.println("limite: " + limite);
							int constituicao2 = hab.getAtrib() [2] += pontosC;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [3] +  "?");
							int pontosI2 = in.nextInt();
							if (pontosI == 6 || pontosI == 8) {
								pontosI = pontosI - 1;
							}
							limite -= pontosI;
							if (limite < 1) {
								System.out.println("você gastou todos os seus pontos!");
								System.exit(0);
							}
							System.out.println("limite: " + limite);
							int inteligencia2 = hab.getAtrib() [3] += pontosI;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [4] +  "?");
							int pontosS2 = in.nextInt();
							if (pontosS == 6 || pontosS == 8) {
								pontosS = pontosS - 1;
							}
							limite -= pontosS;
							if (limite < 1) {
								System.out.println("você gastou todos os seus pontos!");
								System.exit(0);
							}
							System.out.println("limite: " + limite);
							int sabedoria2 = hab.getAtrib() [4] += pontosS;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [5] +  "?");
							int pontosCr2 = in.nextInt();
							if (pontosCr == 6 || pontosCr == 8) {
								pontosCr = pontosCr - 1;
							}
							limite -= pontosCr;
							if (limite < 0) {
								System.out.println("você gastou todos os seus pontos!");
								System.exit(0);
							}
							System.out.println("limite: " + limite);
							int carisma2 = hab.getAtrib() [5] += pontosCr;
							
							int modF2 = forca2/2 - 5;
							int modC2 = constituicao2/2 - 5;
							int modD2 = destreza2/2 - 5;
							int modI2 = inteligencia2/2 - 5;
							int modS2 = sabedoria2/2 - 5;
							int modCr2 = carisma2/2 - 5;
							

							System.out.println("nome jogador:" + nomeJogador);
							System.out.println("nome peronagem: " + nomePersonagem);
							System.out.println("raça:" + info.nomeRacas[numRacas]);
							System.out.println("classe: " + info.nomesClasses[numClasse]);
							System.out.println("pontos de vida:" + hp);
							System.out.println("iniciativa:" + modD2);
							System.out.println("força:" + forca2 + "(" + modF2 + ")");
							System.out.println("destreza:" + destreza2 + "(" + modD2 + ")");
							System.out.println("contituição:" + constituicao2 + "(" + modC2 + ")");
							System.out.println("inteligencia:" + inteligencia2 + "(" + modI2 + ")");
							System.out.println("sabedoria:" + sabedoria2 + "(" + modS2 + ")");
							System.out.println("carisma:" + carisma2 + "(" + modCr2 + ")");
					
				}
			
						else if(escolha2 == 2) {
							System.out.println("Escolha sua classe igualmente você escolheu sua raça:");
							for (int i = 0; i < 12; i++) {
								System.out.println(info.nomesClasses [i] + "(" + i + ")"); }
							int numClasse2 = in.nextInt();
							if (numClasse2 < 0 || numClasse2 > 11) {
								System.out.println("esse numero de classe não existe! reinicie o progama");
							}
								
								System.out.println("sua ficha nova:");
								
								System.out.println("nome jogador:" + nomeJogador);
								System.out.println("nome peronagem: " + nomePersonagem);
								System.out.println("raça:" + info.nomeRacas[numRacas]);
								System.out.println("classe: " + info.nomesClasses[numClasse2]);
								System.out.println("pontos de vida:" + hp);
								System.out.println("iniciativa:" + modD);
								System.out.println("força:" + forca + "(" + modF + ")");
								System.out.println("destreza:" + destreza + "(" + modD + ")");
								System.out.println("contituição:" + constituicao + "(" + modC + ")");
								System.out.println("inteligencia:" + inteligencia + "(" + modI + ")");
								System.out.println("sabedoria:" + sabedoria + "(" + modS + ")");
								System.out.println("carisma:" + carisma + "(" + modCr + ")");
							
							
						}
				
				
				} 

					
				
				
				
				
	}

}
