package br.com.bandtec.projetopw.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.bandtec.projetopw.controller.Credenciais;

@Repository
public class TodosUsuarios {

	String[][] baseDeUsuarios = new String[10][2];

	public boolean contemUsuarioComEssas(Credenciais credenciais) {
		baseDeUsuarios[0][0] = "login";
		baseDeUsuarios[0][1] = "senha";

		String login = credenciais.getLogin();
		String senha = credenciais.getSenha();
		boolean condiçãoDeAcesso = false;

		for (int linha = 0; linha < baseDeUsuarios.length; linha++) {
			
			if (login.equals(baseDeUsuarios[linha][0]) && senha.equals(baseDeUsuarios[linha][1])) {
				System.out.println("entrei");
				condiçãoDeAcesso = true;
				break;
			}
		}
		return condiçãoDeAcesso;
	}
}
