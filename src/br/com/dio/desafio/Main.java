package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("curso java", "curso sobre java e suas funções", 12);

		Curso curso2 = new Curso("curso javascript", "curso sobre javascript seus frameworks", 20);

		Mentoria mentoria = new Mentoria("mentoria de java", "mentoria para decidir qual caminho seguir",
				LocalDate.now());

		imprimirXpConteudo(curso1);

		imprimirXpConteudo(curso2);

		imprimirXpConteudo(mentoria);

		Bootcamp bootcamp = new Bootcamp("bootcamp dio java e javascript", "bootcamp com os cursos java e javascript");
		bootcamp.getConteudos().addAll(List.of(curso1, curso2, mentoria));

		Dev dev = new Dev("Mikael Boff");
		imprimirConteudosDev(dev);

		Dev dev2 = new Dev("Maria Silva");
		imprimirConteudosDev(dev2);

		dev.progredir();
		imprimirXpDev(dev);

		dev.inscreverBootcamp(bootcamp);
		dev2.inscreverBootcamp(bootcamp);

		imprimirConteudosDev(dev);
		imprimirConteudosDev(dev2);

		dev.progredir();
		imprimirXpDev(dev);
		imprimirConteudosDev(dev);

		dev.progredir();
		imprimirXpDev(dev);
		imprimirConteudosDev(dev);

		dev.progredir();
		imprimirXpDev(dev);
		imprimirConteudosDev(dev);

		dev.progredir();
		imprimirXpDev(dev);
		imprimirConteudosDev(dev);

	}

	private static void imprimirXpConteudo(Conteudo conteudo) {
		System.out.println(conteudo);
		System.out.printf("XP conteúdo: %s\n", conteudo.calcularXp());
		System.out.println("---------------------------");
	}

	private static void imprimirConteudosDev(Dev dev) {
		System.out.printf("Conteúdos inscritos %s: %s\n", dev.getNome(), dev.getConteudosInscritos());
		System.out.printf("Conteúdos concluídos %s: %s\n", dev.getNome(), dev.getConteudosConcluidos());
		System.out.println("---------------------------");
	}

	private static void imprimirXpDev(Dev dev) {
		System.out.printf("XP DEV: %s\n", dev.calcularTotalXp());
		System.out.println("---------------------------");
	}

}
