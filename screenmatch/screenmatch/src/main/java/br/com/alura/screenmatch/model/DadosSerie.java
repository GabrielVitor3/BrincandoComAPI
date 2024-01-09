package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//JsonAlias utiliza o nome da variavel que vc utilizou, já o JsonProperty utiliza o nome que vem do json
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo, @JsonAlias("totalSeasons")Integer totaltemporadas, @JsonAlias("imdbRating")String avaliacao) {


}
