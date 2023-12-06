package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import model.Armas;
import model.Classe;
import model.Infos;
import model.Inventario;
import model.Raca;

public class Personagem {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		System.out.println("(Ola player! eu sou Cloveis, um ajudante não assalariado que ira te ajudar na sua aventura no mundo"
		+ "do Role Play Game  𓂂 ﾟ⟡ RPG!) \n （ﾉ´∀`） ノ ");
		
		System.out.println("você deseja montar uma ficha inicial, rolar um dado ou um salva guarda?"
		+ "\n ficha (1), dado (2) ou salva guarda (3) ヾ(・ω・*)");
		int escolha = in.nextInt();
		
		if (escolha == 2) {
			System.out.println("qual dado você deseja?\n 4, 6 ,8 ,10 ,12 ,20 ,100:");
			int Ndado= in.nextInt();
			System.out.println("quantas vezes você deseja rolar esse dado?");
			int Qdados = in.nextInt();
			System.out.println("você deseja somar os dados? sim (0) ou não (1)");
			int soma = in.nextInt();
			
			ArrayList <Integer> dados = new ArrayList <Integer> ();
			
			for (int i = 0; i < Qdados; i++) {
				dados.add(new Random().nextInt(Ndado) + 1);
				System.out.println(dados.get(i));
					soma += dados.get(i);
					if ( i == Qdados - 1) {
					System.out.println(soma); }
			}
		}
		
		if (escolha == 3) {
			ArrayList <Integer> sg = new ArrayList <Integer> ();
			int resul = 0;
			System.out.println("Escreva o numero necessario para passar no teste!");
			int teste = in.nextInt();
			System.out.println("Você está entre a vida e a morte, você vê a luz e a escuridão, você alcança a luz?");
			for (int i = 0; i < 3; i++) {
				sg.add(new Random().nextInt(20));
				System.out.println(sg.get(i));
				resul += sg.get(i);
				if (i == 2 && resul >= (teste*3)) {
					System.out.println(resul + "você alcançou a luz! você sobreviveu!");
				} if (i == 2 && resul < (teste*3)) {
					System.out.println(resul + " você morreu!");
				}
			}
		    }
		if (escolha != 1 && escolha != 2 && escolha != 3) {
			System.out.println("Essa opção não existe!");
		}
		
		if (escolha == 1 ) {
			Infos info = new Infos ();
			Raca rc = new Raca ();
			Classe cs = new Classe ();
			
			System.out.println("Insira seu nome aqui:");
			String nomeJogador = in.next();
			System.out.println("Insira o nome do seu personagem aqui:");
			String nomePersonagem = in.next();
			System.out.println();
			System.out.println("Qual a tendencia do seu personagem?");
			for (int i = 0; i < 7; i++) {
				System.out.println(info.tendencia[i] + "(" + i + ")");
			}
			String tend = info.tendencia [in.nextInt()];
			System.out.println("Agora você ira selecionar a sua raça, digitando o numero ao lado da raça desejada:");
			for (int i = 0; i < 9; i++) {
				System.out.println(info.nomeR[i] + "(" + i + ")"); }
			int numR = in.nextInt();
			if (numR == 0) {
				rc.anao();
			} else if (numR == 1) {
				rc.elfo();
			} else if (numR == 2) {
				rc.humano();
			} else if (numR == 3) {
				rc.pequenino();
			} else if (numR == 4) {
				rc.draconato();
			} else if (numR == 5) {
				rc.gnomo();
			} else if (numR == 6) {
				rc.elfo();
			} else if (numR == 7) {
				rc.meioOrc();
			} else if (numR == 8) {
				rc.tiefling();
			} if (numR > 8 || numR < 0 ) {
				System.out.println("esse numero de raça não existe! reinicie o progama (╥ω╥)");
				System.exit(0); }
			System.out.println("Escolha sua classe igualmente você escolheu sua raça:");
			for (int i = 0; i < 12; i++) {
				System.out.println(info.nomesC [i] + "(" + i + ")"); }
			int numC = in.nextInt();
			ArrayList <String> pericias = new ArrayList <String> ();
			int pLimit = 2;
			int hp = 0;
			if (numC == 0 ) {
				for (int i = 0; i < cs.barbaro.size() - 1; i++) {
			pericias.add(cs.barbaro.get(i)); }
			hp = Integer.valueOf(cs.barbaro.get(cs.barbaro.size()-1));
			cs.classe.add(cs.barbaro);
			}
			if (numC == 1 ) {
				for (int i = 0; i < info.pericias.length; i++) {
			pericias.add(info.pericias[i]); }
			hp = 8;	
			pLimit = 3;
			cs.classe.add(pericias);
			}
			if (numC == 2 ) {
				for (int i = 0; i < cs.bruxo.size()-1; i++) {
			pericias.add(cs.bruxo.get(i)); }
			hp = Integer.valueOf(cs.bruxo.get(cs.bruxo.size()-1));
			cs.classe.add(cs.bruxo);
			}
			if (numC == 3 ) {
				for (int i = 0; i < cs.clerigo.size()-1; i++) {
			pericias.add(cs.clerigo.get(i)); }
			hp = Integer.valueOf(cs.clerigo.get(cs.clerigo.size()-1));
			cs.classe.add(cs.clerigo);
			}
			if (numC == 4 ) {
				for (int i = 0; i < cs.druida.size()-1; i++) {
			pericias.add(cs.druida.get(i)); }
			hp = Integer.valueOf(cs.druida.get(cs.druida.size()-1));
			cs.classe.add(cs.druida);
			}
			if (numC == 5 ) {
				for (int i = 0; i < cs.feiticeiro.size()-1; i++) {
			pericias.add(cs.feiticeiro.get(i)); }
			hp = Integer.valueOf(cs.feiticeiro.get(cs.feiticeiro.size()-1));
			cs.classe.add(cs.feiticeiro);
			}
			if (numC == 6 ) {
				for (int i = 0; i < cs.guerreiro.size()-1; i++) {
			pericias.add(cs.guerreiro.get(i)); }
			hp = Integer.valueOf(cs.guerreiro.get(cs.guerreiro.size()-1));	
			cs.classe.add(cs.guerreiro);
			}
			if (numC == 7 ) {
				for (int i = 0; i < cs.ladino.size()-1; i++) {
			pericias.add(cs.ladino.get(i)); }
			hp = Integer.valueOf(cs.ladino.get(cs.ladino.size()-1));
			pLimit = 4;
			cs.classe.add(cs.ladino);
			}
			if (numC == 8 ) {
				for (int i = 0; i < cs.mago.size()-1; i++) {
			pericias.add(cs.mago.get(i)); }
			hp = Integer.valueOf(cs.mago.get(cs.mago.size()-1));
			cs.classe.add(cs.mago);
			}
			if (numC == 9 ) {
				for (int i = 0; i < cs.monge.size()-1; i++) {
			pericias.add(cs.monge.get(i)); }
			hp = Integer.valueOf(cs.monge.get(cs.monge.size()-1));	
			cs.classe.add(cs.monge);
			}
			if (numC == 10 ) {
				for (int i = 0; i < cs.paladino.size()-1; i++) {
			pericias.add(cs.paladino.get(i)); }
			hp = Integer.valueOf(cs.paladino.get(cs.paladino.size()-1));
			cs.classe.add(cs.paladino);
			}
			if (numC == 11 ) {
				for (int i = 0; i < cs.patrulheiro.size()-1; i++) {
			pericias.add(cs.patrulheiro.get(i)); }
			hp = Integer.valueOf(cs.patrulheiro.get(cs.patrulheiro.size()-1));
			pLimit = 3;
			cs.classe.add(cs.patrulheiro);
			}
			
			if (numC < 0 || numC > 11) {
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
			
			if (numR == 6) {
				System.out.println("Sua raça permite que você escolha bonus para duas de suas habilidades!\n Apenas selecione o numero ao lado da habilidade!");
				for (int i = 0; i < 6; i++) {
					System.out.println(info.nomeMod[i] + "(" + i + ")");
				}
				rc.getRaca()[in.nextInt()] += 1;
				rc.getRaca()[in.nextInt()] += 1;
			}
			
			ArrayList <Integer> mod = new ArrayList <Integer> ();
			int limite = 27;
			for (int i = 0; i < 6; i++) {
				System.out.println("Quantos você deseja por em " + info.nomeMod [i] +  "?");
				mod.add(in.nextInt());
				if (mod.get(i) == 6 || mod.get(i) == 8) {
					mod.set(i, mod.get(i)-1);
				}
				limite -= mod.get(i);
				if (limite < 0) {
					System.out.println("você gastou todos os seus pontos! (；￣Д￣)");
					break;
				}
				System.out.println("você ainda tem: " + limite + " pontos.");
			}
			
			double forc = rc.getRaca()[0] + mod.get(0);
			double des = rc.getRaca()[1] + mod.get(1);
			double cons = rc.getRaca()[2] + mod.get(2);
			double intg = rc.getRaca()[3] + mod.get(3);
			double sab = rc.getRaca()[4] + mod.get(4);
			double carc = rc.getRaca()[5] + mod.get(5);
			
			
			
			int mF = Integer.valueOf((int) (forc/2-5));
			int mD = Integer.valueOf((int) (des/2 - 5));
			int mC = Integer.valueOf((int) (cons/2 - 5));
			int mI = Integer.valueOf((int) (intg/2 - 5));
			int mS = Integer.valueOf((int) (sab/2 - 5));
			int mCr = Integer.valueOf((int) (carc/2 - 5));
			
			System.out.println("Agora selecione as suas pericias que são disbolibilizadas pela sua classe, apenas digitando o numero ao seu lado!\n");
			for (int i = 0; i < pericias.size() - 1; i++) {
				System.out.println(pericias.get(i) + "(" + i + ")"); }
				int [] cP = new int [pLimit];
				int tamanho = pericias.size();
				for (int i = 0; i < pLimit; i++) {
					cP [i] = in.nextInt(); }
				Collections.swap(pericias, 0, cP [0]);
				Collections.swap(pericias, 1, cP [1]);
				if (pLimit == 3) {
					Collections.swap(pericias, 2, cP [2]);
				} if (pLimit == 4) {
					Collections.swap(pericias, 3, cP [3]);
				}
				if (pericias.size() > pLimit) {
					pericias.subList(pLimit, pericias.size()).clear();
				}
				
				System.out.println("você deseja adicionar algo em seu inventario? sim (0) ou não (1)");
				int op = in.nextInt();
				ArrayList <Inventario> inventario = new ArrayList <Inventario> ();
				while (inventario.size() < 8 && op == 0) {
					System.out.println("seu objeto é uma arma ou outro tipo? arma (1), outro (2) ou sair(3)");
					int aOro = in.nextInt();
					switch (aOro) {
					case 1 : {
						System.out.println("Informe o nome de sua Arma:");
						String nomeArma = in.next();
						System.out.println("Informe a descrição da Arma:");
						String descArma = in.next();
						System.out.println("Informe o dano da Arma:");
						int danoArma = in.nextInt();
						System.out.println("Informe o peso de sua arma:");
						double pesoArma = in.nextDouble();
						Armas arma = new Armas (nomeArma,descArma,danoArma,pesoArma);
						inventario.add(arma);
						break;
					}
					case 2 : {
						System.out.println("Informe o nome do seu Objeto:");
						String nomeObjeto = in.next();
						System.out.println("Informe a descrição do seu objeto:");
						String descObjeto = in.next();
						Inventario objeto = new Inventario (nomeObjeto,descObjeto);
						inventario.add(objeto);
						break;
					}
					case 3: {
						for (int i = 0; i < 8; i++) {
							inventario.add(null);
						}
						break;
					} 
					}}
				
				System.out.println("nome jogador:" + nomeJogador);
				System.out.println("nome personagem:" + nomePersonagem);
				System.out.println("tendencia:" + tend);
				System.out.println("raça" + info.nomeR[numR]);
				System.out.println("classe" + info.nomesC[numC]);
				System.out.println("hp" + (hp + mC));
				System.out.println("deslocamento:" + rc.raca[6]);
				System.out.println("força: " + forc + "(" + mF + ")");
				System.out.println("destreza: " + des + "(" + mD + ")");
				System.out.println("constituição: " + cons + "(" + mC + ")");
				System.out.println("inteligencia: " + intg + "(" + mI + ")");
				System.out.println("sabedoria" + sab + "(" + mS + ")");
				System.out.println("carisma:" + carc + "(" + mCr + ")");
				System.out.println("suas pericias:");
				for (int i = 0; i < pericias.size(); i++) {
					System.out.println(pericias.get(i));
				}
				System.out.println("seu inventario:");
				for (Inventario itens : inventario) {
					if (itens instanceof Armas) {
						((Armas)itens).exibirArmas();
					} else if (itens instanceof Inventario) {
						((Inventario) itens).exibir();
					}
					System.out.println(". . .");
				}
				
				 System.out.println("\n você deseja alterar alguma coisa na sua ficha? raça (0), classe (1), atributos (2), pericias (3), inventario (4), nada (5)");
				 int modifica = in.nextInt();
				 
				 if (modifica == 0) {
					 System.out.println("selecione sua raça novamente");
					 numR = in.nextInt();
						if (numR == 0) {
							rc.anao();
						} else if (numR == 1) {
							rc.elfo();
						} else if (numR == 2) {
							rc.humano();
						} else if (numR == 3) {
							rc.pequenino();
						} else if (numR == 4) {
							rc.draconato();
						} else if (numR == 5) {
							rc.gnomo();
						} else if (numR == 6) {
							rc.elfo();
						} else if (numR == 7) {
							rc.meioOrc();
						} else if (numR == 8) {
							rc.tiefling();
						} if (numR > 8 || numR < 0 ) {
							System.out.println("esse numero de raça não existe! reinicie o progama (╥ω╥)");
							System.exit(0); }
						
						forc = rc.getRaca()[0] + mod.get(0);
						des = rc.getRaca()[1] + mod.get(1);
						cons = rc.getRaca()[2] + mod.get(2);
						intg = rc.getRaca()[3] + mod.get(3);
						sab = rc.getRaca()[4] + mod.get(4);
						carc = rc.getRaca()[5] + mod.get(5);
						
						
						
						mF = Integer.valueOf((int) (forc/2-5));
						mD = Integer.valueOf((int) (des/2 - 5));
						mC = Integer.valueOf((int) (cons/2 - 5));
						mI = Integer.valueOf((int) (intg/2 - 5));
						mS = Integer.valueOf((int) (sab/2 - 5));
						mCr = Integer.valueOf((int) (carc/2 - 5));
						
						System.out.println("nome jogador:" + nomeJogador);
						System.out.println("nome personagem:" + nomePersonagem);
						System.out.println("tendencia:" + tend);
						System.out.println("raça: " + info.nomeR[numR]);
						System.out.println("classe: " + info.nomesC[numC]);
						System.out.println("hp: " + (hp + mC));
						System.out.println("deslocamento:" + rc.raca[6]);
						System.out.println("força: " + forc + "(" + mF + ")");
						System.out.println("destreza: " + des + "(" + mD + ")");
						System.out.println("constituição: " + cons + "(" + mC + ")");
						System.out.println("inteligencia: " + intg + "(" + mI + ")");
						System.out.println("sabedoria" + sab + "(" + mS + ")");
						System.out.println("carisma:" + carc + "(" + mCr + ")");
						System.out.println("suas pericias:");
						for (int i = 0; i < pericias.size(); i++) {
							System.out.println(pericias.get(i));
						}
						System.out.println("seu inventario:");
						for (Inventario itens : inventario) {
							if (itens instanceof Armas) {
								((Armas)itens).exibirArmas();
							} else if (itens instanceof Inventario) {
								((Inventario) itens).exibir();
							}
							System.out.println(". . .");
						}
				 } if (modifica == 1) {
					 System.out.println("selecione sua classe novamente:");
					    numC = in.nextInt();
					 	pericias.clear();
					    pLimit = 2;
						hp = 0;
						if (numC == 0 ) {
							for (int i = 0; i < cs.barbaro.size() - 1; i++) {
						pericias.add(cs.barbaro.get(i)); }
						hp = Integer.valueOf(cs.barbaro.get(cs.barbaro.size()-1));	
						}
						if (numC == 1 ) {
							for (int i = 0; i < info.pericias.length; i++) {
						pericias.add(info.pericias[i]); }
						hp = 8;	
						pLimit = 3;
						}
						if (numC == 2 ) {
							for (int i = 0; i < cs.bruxo.size()-1; i++) {
						pericias.add(cs.bruxo.get(i)); }
						hp = Integer.valueOf(cs.bruxo.get(cs.bruxo.size()-1));	
						}
						if (numC == 3 ) {
							for (int i = 0; i < cs.clerigo.size()-1; i++) {
						pericias.add(cs.clerigo.get(i)); }
						hp = Integer.valueOf(cs.clerigo.get(cs.clerigo.size()-1));	
						}
						if (numC == 4 ) {
							for (int i = 0; i < cs.druida.size()-1; i++) {
						pericias.add(cs.druida.get(i)); }
						hp = Integer.valueOf(cs.druida.get(cs.druida.size()-1));	
						}
						if (numC == 5 ) {
							for (int i = 0; i < cs.feiticeiro.size()-1; i++) {
						pericias.add(cs.feiticeiro.get(i)); }
						hp = Integer.valueOf(cs.feiticeiro.get(cs.feiticeiro.size()-1));	
						}
						if (numC == 6 ) {
							for (int i = 0; i < cs.guerreiro.size()-1; i++) {
						pericias.add(cs.guerreiro.get(i)); }
						hp = Integer.valueOf(cs.guerreiro.get(cs.guerreiro.size()-1));	
						}
						if (numC == 7 ) {
							for (int i = 0; i < cs.ladino.size()-1; i++) {
						pericias.add(cs.ladino.get(i)); }
						hp = Integer.valueOf(cs.ladino.get(cs.ladino.size()-1));
						pLimit = 4;
						}
						if (numC == 8 ) {
							for (int i = 0; i < cs.mago.size()-1; i++) {
						pericias.add(cs.mago.get(i)); }
						hp = Integer.valueOf(cs.mago.get(cs.mago.size()-1));	
						}
						if (numC == 9 ) {
							for (int i = 0; i < cs.monge.size()-1; i++) {
						pericias.add(cs.monge.get(i)); }
						hp = Integer.valueOf(cs.monge.get(cs.monge.size()-1));	
						}
						if (numC == 10 ) {
							for (int i = 0; i < cs.paladino.size()-1; i++) {
						pericias.add(cs.paladino.get(i)); }
						hp = Integer.valueOf(cs.paladino.get(cs.paladino.size()-1));	
						}
						if (numC == 11 ) {
							for (int i = 0; i < cs.patrulheiro.size()-1; i++) {
						pericias.add(cs.patrulheiro.get(i)); }
						hp = Integer.valueOf(cs.patrulheiro.get(cs.patrulheiro.size()-1));
						pLimit = 3;
						}
						
						if (numC < 0 || numC > 11) {
							System.out.println("esse numero de classe não existe! reinicie o progama (╥ω╥)");
							System.exit(0); }
							
							for (int i = 0; i < pericias.size(); i++) {
								System.out.println(pericias.get(i) + "(" + i + ")"); }
								for (int i = 0; i < pLimit; i++) {
									cP [i] = in.nextInt(); }
								Collections.swap(pericias, 0, cP [0]);
								Collections.swap(pericias, 1, cP [1]);
								if (pLimit == 3) {
									Collections.swap(pericias, 2, cP [2]);
								} if (pLimit == 4) {
									Collections.swap(pericias, 3, cP [3]);
								}
								if (pericias.size() > pLimit) {
									pericias.subList(pLimit, pericias.size()).clear();
								}
								
								System.out.println("nome jogador:" + nomeJogador);
								System.out.println("nome personagem:" + nomePersonagem);
								System.out.println("tendencia:" + tend);
								System.out.println("raça: " + info.nomeR[numR]);
								System.out.println("classe: " + info.nomesC[numC]);
								System.out.println("hp: " + (hp + mC));
								System.out.println("deslocamento:" + rc.raca[6]);
								System.out.println("força: " + forc + "(" + mF + ")");
								System.out.println("destreza: " + des + "(" + mD + ")");
								System.out.println("constituição: " + cons + "(" + mC + ")");
								System.out.println("inteligencia: " + intg + "(" + mI + ")");
								System.out.println("sabedoria" + sab + "(" + mS + ")");
								System.out.println("carisma:" + carc + "(" + mCr + ")");
								System.out.println("suas pericias:");
								for (int i = 0; i < pericias.size(); i++) {
									System.out.println(pericias.get(i));
								}
								System.out.println("seu inventario:");
								for (Inventario itens : inventario) {
									if (itens instanceof Armas) {
										((Armas)itens).exibirArmas();
									} else if (itens instanceof Inventario) {
										((Inventario) itens).exibir();
									}
									System.out.println(". . .");
						}
				 } if (modifica == 3) {
					 pericias.clear();
					 pericias.addAll(cs.classe.get(0));
					 
					 for (int i = 0; i < pericias.size() - 2; i++) {
							System.out.println(pericias.get(i) + "(" + i + ")"); }
							cP = new int [pLimit];
							for (int i = 0; i < pLimit; i++) {
								cP [i] = in.nextInt(); }
							Collections.swap(pericias, 0, cP [0]);
							Collections.swap(pericias, 1, cP [1]);
							if (pLimit == 3) {
								Collections.swap(pericias, 2, cP [2]);
							} if (pLimit == 4) {
								Collections.swap(pericias, 3, cP [3]);
							}
							if (pericias.size() > pLimit) {
								pericias.subList(pLimit, pericias.size()).clear();
							}
							
							System.out.println("nome jogador:" + nomeJogador);
							System.out.println("nome personagem:" + nomePersonagem);
							System.out.println("tendencia:" + tend);
							System.out.println("raça: " + info.nomeR[numR]);
							System.out.println("classe: " + info.nomesC[numC]);
							System.out.println("hp: " + (hp + mC));
							System.out.println("deslocamento:" + rc.raca[6]);
							System.out.println("força: " + forc + "(" + mF + ")");
							System.out.println("destreza: " + des + "(" + mD + ")");
							System.out.println("constituição: " + cons + "(" + mC + ")");
							System.out.println("inteligencia: " + intg + "(" + mI + ")");
							System.out.println("sabedoria" + sab + "(" + mS + ")");
							System.out.println("carisma:" + carc + "(" + mCr + ")");
							System.out.println("suas pericias:");
							for (int i = 0; i < pericias.size(); i++) {
								System.out.println(pericias.get(i));
							}
							System.out.println("seu inventario:");
							for (Inventario itens : inventario) {
								if (itens instanceof Armas) {
									((Armas)itens).exibirArmas();
								} else if (itens instanceof Inventario) {
									((Inventario) itens).exibir();
								}
								System.out.println(". . .");
				 } } if (modifica == 2) {
					 limite = 27;
					 mod.clear();
						for (int i = 0; i < 6; i++) {
							System.out.println("Quantos você deseja por em " + info.nomeMod [i] +  "?");
							mod.add(in.nextInt());
							if (mod.get(i) == 6 || mod.get(i) == 8) {
								mod.set(i, mod.get(i)-1);
							}
							limite -= mod.get(i);
							if (limite < 0) {
								System.out.println("você gastou todos os seus pontos! (；￣Д￣)");
								break;
							}
							System.out.println("você ainda tem: " + limite + " pontos.");
						}
						
						forc = rc.getRaca()[0] + mod.get(0);
						des = rc.getRaca()[1] + mod.get(1);
						cons = rc.getRaca()[2] + mod.get(2);
						intg = rc.getRaca()[3] + mod.get(3);
						sab = rc.getRaca()[4] + mod.get(4);
						carc = rc.getRaca()[5] + mod.get(5);
						
						
						
						mF = Integer.valueOf((int) (forc/2-5));
						mD = Integer.valueOf((int) (des/2 - 5));
						mC = Integer.valueOf((int) (cons/2 - 5));
						mI = Integer.valueOf((int) (intg/2 - 5));
						mS = Integer.valueOf((int) (sab/2 - 5));
						mCr = Integer.valueOf((int) (carc/2 - 5));
						
						System.out.println("nome jogador:" + nomeJogador);
						System.out.println("nome personagem:" + nomePersonagem);
						System.out.println("tendencia:" + tend);
						System.out.println("raça: " + info.nomeR[numR]);
						System.out.println("classe: " + info.nomesC[numC]);
						System.out.println("hp: " + (hp + mC));
						System.out.println("deslocamento:" + rc.raca[6]);
						System.out.println("força: " + forc + "(" + mF + ")");
						System.out.println("destreza: " + des + "(" + mD + ")");
						System.out.println("constituição: " + cons + "(" + mC + ")");
						System.out.println("inteligencia: " + intg + "(" + mI + ")");
						System.out.println("sabedoria" + sab + "(" + mS + ")");
						System.out.println("carisma:" + carc + "(" + mCr + ")");
						System.out.println("suas pericias:");
						for (int i = 0; i < pericias.size(); i++) {
							System.out.println(pericias.get(i));
						}
						System.out.println("seu inventario:");
						for (Inventario itens : inventario) {
							if (itens instanceof Armas) {
								((Armas)itens).exibirArmas();
							} else if (itens instanceof Inventario) {
								((Inventario) itens).exibir();
							}
							System.out.println(". . .");
				 } } if (modifica == 4) {
					 System.out.println("você deseja excluir (0), alterar (1), adicionar (2), sair (3)");
					 int escol = in.nextInt();
					 switch (escol) {
					 case 2: {
						 while (inventario.size() < 8 && op == 0) {
								System.out.println("seu objeto é uma arma ou outro tipo? arma (1), outro (2) ou sair(3)");
								int aOro = in.nextInt();
								switch (aOro) {
								case 1 : {
									System.out.println("Informe o nome de sua Arma:");
									String nomeArma = in.next();
									System.out.println("Informe a descrição da Arma:");
									String descArma = in.next();
									System.out.println("Informe o dano da Arma:");
									int danoArma = in.nextInt();
									System.out.println("Informe o peso de sua arma:");
									double pesoArma = in.nextDouble();
									Armas arma = new Armas (nomeArma,descArma,danoArma,pesoArma);
									inventario.add(arma);
									break;
								}
								case 2 : {
									System.out.println("Informe o nome do seu Objeto:");
									String nomeObjeto = in.next();
									System.out.println("Informe a descrição do seu objeto:");
									String descObjeto = in.next();
									Inventario objeto = new Inventario (nomeObjeto,descObjeto);
									inventario.add(objeto);
									break;
								}
								case 3: {
									for (int i = 0; i < 8; i++) {
										inventario.add(null);
									}
									break;
								} 
								}}
						 
					 } case 1: {
						 System.out.println("qual objeto você deseja modificar?");
						 int local = in.nextInt();
						 Inventario objeto = inventario.get(local);
						 if (objeto instanceof Armas) {
							 objeto.setObjeto(in.nextLine());
							 objeto.setDescObjeto(in.nextLine());
							 ((Armas) objeto).setDano(in.nextInt());
							 ((Armas) objeto).setPeso(in.nextInt());
						 } if (objeto instanceof Inventario) {
							 objeto.setObjeto(in.nextLine());
							 objeto.setDescObjeto(in.nextLine());
						 }
					 } case 0: {
						 System.out.println("qual objeto você deseja excluir?");
						 int local2 = in.nextInt();
						 inventario.remove(local2);
					 } case 3: {
						 break;
					 }
					 
				 }
					 System.out.println("nome jogador:" + nomeJogador);
						System.out.println("nome personagem:" + nomePersonagem);
						System.out.println("tendencia:" + tend);
						System.out.println("raça: " + info.nomeR[numR]);
						System.out.println("classe: " + info.nomesC[numC]);
						System.out.println("hp: " + (hp + mC));
						System.out.println("deslocamento:" + rc.raca[6]);
						System.out.println("força: " + forc + "(" + mF + ")");
						System.out.println("destreza: " + des + "(" + mD + ")");
						System.out.println("constituição: " + cons + "(" + mC + ")");
						System.out.println("inteligencia: " + intg + "(" + mI + ")");
						System.out.println("sabedoria" + sab + "(" + mS + ")");
						System.out.println("carisma:" + carc + "(" + mCr + ")");
						System.out.println("suas pericias:");
						for (int i = 0; i < pericias.size(); i++) {
							System.out.println(pericias.get(i));
						}
						System.out.println("seu inventario:");
						for (Inventario itens : inventario) {
							if (itens instanceof Armas) {
								((Armas)itens).exibirArmas();
							} else if (itens instanceof Inventario) {
								((Inventario) itens).exibir();
							}
							System.out.println(". . ."); 
				 }
	}
	}
		} }

