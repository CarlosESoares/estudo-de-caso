package ficha;

import java.util.Random;
import java.util.Scanner;

public class main {
		public static void main (String[] args) {
			Scanner in = new Scanner (System.in);
			int modificar = 0;
			AtribRaca hab = new AtribRaca ();
			Infos info = new Infos ();
			
			System.out.println("(Ola player! eu sou Cloveis, um ajudante não assalariado que ira te ajudar na sua aventura no mundo "
			+ "do Role Play Game  𓂂 ﾟ⟡ RPG!) \n （ﾉ´∀`） ノ ");
			
			System.out.println("você deseja montar uma ficha inicial ou rolar um dado?"
			+ "\n ficha (1) ou dado (2) ヾ(・ω・*)");
			int escolhas = in.nextInt();
			if (escolhas > 2) {
				System.out.println("essa opção não existe!");
				System.setOut(null);
			} else if (escolhas == 2) {
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
			} else if (escolhas == 1) {
			
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
				System.out.println("esse numero de raça não existe! reinicie o progama (╥ω╥)");
				System.exit(0); }
			
			System.out.println("Escolha sua classe igualmente você escolheu sua raça:");
			for (int i = 0; i < 12; i++) {
				System.out.println(info.nomesClasses [i] + "(" + i + ")"); }
			int numClasse = in.nextInt();
			if (numClasse < 0 || numClasse > 11) {
				System.out.println("esse numero de classe não existe! reinicie o progama (╥ω╥)");
				System.exit(0);
			}
			 System.out.println("Aqui você tera 27 pontos para gastar comprando as habilidade de seus personagens!(★ω★)"
			 		+"\n as suas habilidades são:\n");
			for (int i = 0; i < 6; i++) {
				System.out.println(info.nomeMod[i]);
			}
			System.out.println("\n Abaixo terá uma tabela com a quantidade de pontos da habilidade, o custo e quanto"
					+ "ele modifica o dado. (* ^ ω ^) \n" + "Observações! para o calculo de pontos 5 e 6 tem os mesmo valores igualmente 7 e 8\n");
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
				System.out.println("você gastou todos os seus pontos! (；￣Д￣)");
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
				System.out.println("você gastou todos os seus pontos! (￣ ￣|||)");
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
				System.out.println("você gastou todos os seus pontos! (」＞＜)」");
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
				System.out.println("você gastou todos os seus pontos!(￣︿￣)");
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
				System.out.println("você gastou todos os seus pontos! (＞﹏＜)");
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
				System.out.println("você gastou todos os seus pontos! (￣ヘ￣)");
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

			System.out.println("\n 	☆⌒(≧▽​° ) ノ ( sua ficha player!)\n");
			for (int i = 0; i < 13; i++) {
			System.out.println(imprima(nomeJogador, nomePersonagem, info.nomeRacas, numRacas,
			info.nomesClasses, numClasse,hp, modD, forca, modF, destreza, constituicao,
			modC, inteligencia, modificar, sabedoria, modS, carisma, modCr)[i]);
			}

				System.out.println("\n voce deseja modificar a ficha? 	Σ(O_O)");
				System.out.println("voce tem a opção '1' e '2'");
				
				int escolha = in.nextInt();
				
				if (escolha == 1) {
					
					System.out.println("o que você deseja modificar? ( つ＞＜)つ");
					System.out.println("(1) os atributos, (2) classe, (3) raça");
					
					int selecao = in.nextInt();
					
						if (selecao == 1) {
							
							int limite2 = 27;
							
							System.out.println("Quantos você deseja por em " + info.nomeMod [0] +  "?");
							int pontosF2 = in.nextInt();
							if (pontosF == 6 || pontosF == 8) {
								pontosF = pontosF - 1;
							}
							limite -= pontosF;
							if (limite < 1) {
								System.out.println("você gastou todos os seus pontos! (；￣Д￣)");
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
								System.out.println("você gastou todos os seus pontos! (￣ ￣|||)");
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
								System.out.println("você gastou todos os seus pontos! (」＞＜)」");
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
								System.out.println("você gastou todos os seus pontos! (￣︿￣)");
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
								System.out.println("você gastou todos os seus pontos! (＞﹏＜)");
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
								System.out.println("você gastou todos os seus pontos!(￣ヘ￣)");
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
							

							System.out.println("\n 	☆⌒(≧▽​° ) ノ ( sua ficha player!)\n");
							for (int i = 0; i < 13; i++) {
							System.out.println(imprima(nomeJogador, nomePersonagem, info.nomeRacas, numRacas,
							info.nomesClasses, numClasse,hp, modD, forca, modF, destreza, constituicao,
							modC, inteligencia, modificar, sabedoria, modS, carisma, modCr)[i]);
							}
					
				}
			
						else if(selecao == 2) {
							System.out.println("Escolha sua classe igualmente você escolheu sua raça:");
							for (int i = 0; i < 12; i++) {
								System.out.println(info.nomesClasses [i] + "(" + i + ")"); }
							int numClasse2 = in.nextInt();
							if (numClasse2 < 0 || numClasse2 > 11) {
								System.out.println("esse numero de classe não existe! reinicie o progama (╥ω╥)");
							}
								
							System.out.println("\n 	☆⌒(≧▽​° ) ノ ( sua ficha player!)\n");
							for (int i = 0; i < 13; i++) {
							System.out.println(imprima(nomeJogador, nomePersonagem, info.nomeRacas, numRacas,
							info.nomesClasses, numClasse,hp, modD, forca, modF, destreza, constituicao,
							modC, inteligencia, modificar, sabedoria, modS, carisma, modCr)[i]);
							}
							
						
				} else if (selecao == 3) {
					for (int j = 0; j < 6; j++) {
						if (hab.getAtrib()[j] != 8) {
							hab.getAtrib()[j] = 8; }
						}
						System.out.println("selecione sua raça novamente!");
						numRacas = in.nextInt();
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
							System.out.println("esse numero de raça não existe! reinicie o progama (╥ω╥)");
							System.exit(0); }
						
						forca = hab.getAtrib()[0] + pontosF;
						destreza = hab.getAtrib()[1] + pontosD;
						constituicao = hab.getAtrib()[2] + pontosC;
						inteligencia = hab.getAtrib()[3] + pontosI;
						sabedoria = hab.getAtrib()[4] + pontosS;
						carisma = hab.getAtrib()[5] + pontosCr;
						
						System.out.println("\n 	☆⌒(≧▽​° ) ノ ( sua ficha player!)\n");
						for (int i = 0; i < 13; i++) {
						System.out.println(imprima(nomeJogador, nomePersonagem, info.nomeRacas, numRacas,
						info.nomesClasses, numClasse,hp, modD, forca, modF, destreza, constituicao,
						modC, inteligencia, modificar, sabedoria, modS, carisma, modCr)[i]);
						}
					} 	
				}
			}
		}
		public static String [] imprima (String nomeJogador, String nomePersonagem, String [] nomeRacas,
				int numRacas, String [] nomesClasses, int numClasse, int hp, int modD, int forca, int modF,
				int destreza, int constituicao, int modC, int inteligencia, int modI, int sabedoria,
				int modS, int carisma, int modCr) {
			String [] imprima = {"nome do jogador:" + nomeJogador, "nome do personagem:" + nomePersonagem,
					"raça:" + nomeRacas[numRacas], "classe: " + nomesClasses[numClasse], "pontos de vida:" + hp,
					"iniciativa:" + modD, "força:" + forca + "(" + modF + ")",
					"destreza:" + destreza + "(" + modD + ")", "contituição:" + constituicao + "(" + modC + ")",
					"inteligencia:" + inteligencia + "(" + modI + ")", "sabedoria:" + sabedoria + "(" + modS + ")",
					"carisma:" + carisma + "(" + modCr + ")","┬┴┬┴┤･ω･)ﾉ ~ bye bye"};
			return imprima;
		}	
}
