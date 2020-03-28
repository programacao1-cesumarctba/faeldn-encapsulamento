package com.github.faeldn.main;

import com.github.faeldn.classes.Curso;

public class Aplicacao {
	public static void main (String[] args) {
			try {
				Curso curso = new Curso ();
				curso.setNome("Física");
				curso.setProfessor("Rafael Souza");
				curso.setTema("Cálculo");
				curso.setValor(350.0);
				
				System.out.println(String.format ( "Nome do curso: %s \n" +
						   "Professor: %s \n" +
						   "Tema do curso: %s \n" +
						   "Valor do curso: %s \n", curso.getNome(), curso.getProfessor(), curso.getTema(), curso.getValor()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

