package thawanny.oliveira.proj2.controle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thawanny.oliveira.proj2.modelo.Movie;

import java.util.ArrayList;

@RestController

public class MovieControle {

    @GetMapping ("/")
    public char mensagem () {
        return ("Olá, seja bem vindo a nossa sala de filmes!")

    @GetMapping "filme"
        public Movie getMovie () {
    Movie movie = new Movie();
    movie.setName("O menino do pijama listrado");
    movie.setGenero("Drama/guerra");
    movie.setDate("Setembro/2008");

            "Listamovie"
    public ArrayList <movie> getListaMovies(){

     Movie movie1 = new Movie();
     movie1.setName ("O menino do pijama listrado");
     movie1.setGenero("Drama/guerra");
     movie1.setDate("Setembro/2008");

     Movie movie2 = new Movie();
     movie2.setName("O Resgate");
     movie2.setGenero("Suspense/ação");
     movie2.setDate("Abril/2020");

      Movie movie3 = new Movie();
      movie3.setName("Corra");
      movie3.setGenero("Terror");
      movie3.setDate("Maio/2017");

      ArrayList<Movie> Lista = new ArrayList<>();
                getListaMovies.add(movie3)
                getListaMovies.add(movie2)
                getListaMovies.add(movie1)

       return Lista;
            }


        }
    }


}
