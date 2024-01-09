package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumo = new ConsumoApi();
		var json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=95a0a17c");
		//System.out.println(json);
		//json = consumo.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);

		ConverteDados converte = new ConverteDados();
		DadosSerie dados = converte.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
