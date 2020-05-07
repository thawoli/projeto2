package thawanny.oliveira.proj2.modelo;


import lombok.*;

/*
*@Author Thawanny Oliveira
* @ince 04/05/2020 4:50
* version filmes 1.0

 */
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Movie {

    @Getter
    @Setter
    private char name;

    @Getter
    @Setter
    private char genero;

    @Getter
    @Setter
    private int date;

}
