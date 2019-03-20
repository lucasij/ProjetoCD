package br.com.bandtec.projetopw.infra;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bandtec.projetopw.controller.Credenciais;
import br.com.bandtec.projetopw.repository.TodosUsuarios;

@Component
public class SegurancaDaAplicacao {

	private final TodosUsuarios todosUsuarios;

	@Autowired
	public SegurancaDaAplicacao(TodosUsuarios todosUsuarios) {
		this.todosUsuarios = todosUsuarios;
	}

	public boolean permitirAcesso(Credenciais credenciais) {
		boolean usuarioPresenteNaBase = todosUsuarios.contemUsuarioComEssas(credenciais);
		return usuarioPresenteNaBase;
	}

}
