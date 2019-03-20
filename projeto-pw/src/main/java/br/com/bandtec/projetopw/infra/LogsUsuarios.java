package br.com.bandtec.projetopw.infra;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.stereotype.Component;

@Component
public class LogsUsuarios {

	String[][] matrizAcessos = new String[2][2];
	Calendar calendario;
	SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	int cont = 0;

	public void acresentarMatriz(String login) {
		calendario = Calendar.getInstance();
		String dataHora = s.format(calendario.getTime());
		matrizAcessos[cont][0] = login;
		matrizAcessos[cont][1] = dataHora;
		cont++;

		if (cont > 10) {
			cont = 0;
			// gerar log vem aqui
		}

	}
}
