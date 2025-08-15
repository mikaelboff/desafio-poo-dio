package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("curso java", "curso sobre java e suas funções", 12);

		Curso curso2 = new Curso("curso javascript", "curso sobre javascript seus frameworks", 20);

		Mentoria mentoria = new Mentoria("mentoria de java", "mentoria para decidir qual caminho seguir",
				LocalDate.now());

		System.out.println(curso1);

		System.out.println(curso2);

		System.out.println(mentoria);
	}

}
