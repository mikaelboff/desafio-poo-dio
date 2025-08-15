package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("curso java", "curso sobre java e suas funções", 12);

		Curso curso2 = new Curso("curso javascript", "curso sobre javascript seus frameworks", 20);

		Mentoria mentoria = new Mentoria("mentoria de java", "mentoria para decidir qual caminho seguir",
				LocalDate.now());

		System.out.println(curso1);
		System.out.printf("XP curso: %s\n", curso1.calcularXp());
		System.out.println("---------------------------");

		System.out.println(curso2);
		System.out.printf("XP curso: %s\n", curso2.calcularXp());
		System.out.println("---------------------------");

		System.out.println(mentoria);
		System.out.printf("XP mentoria: %s\n", mentoria.calcularXp());
		System.out.println("---------------------------");

		Bootcamp bootcamp = new Bootcamp("bootcamp dio java e javascript", "bootcamp com os cursos java e javascript");
		bootcamp.getConteudos().addAll(List.of(curso1, curso2, mentoria));

		Dev dev = new Dev("Mikael Boff");

		dev.progredir();
		System.out.printf("XP DEV: %s\n", dev.calcularTotalXp());
		System.out.println("---------------------------");

		dev.inscreverBootcamp(bootcamp);

		dev.progredir();
		System.out.printf("XP DEV: %s\n", dev.calcularTotalXp());
		System.out.println("---------------------------");

		dev.progredir();
		System.out.printf("XP DEV: %s\n", dev.calcularTotalXp());
		System.out.println("---------------------------");

		dev.progredir();
		System.out.printf("XP DEV: %s\n", dev.calcularTotalXp());
		System.out.println("---------------------------");

		dev.progredir();
		System.out.printf("XP DEV: %s\n", dev.calcularTotalXp());
		System.out.println("---------------------------");

	}

}
