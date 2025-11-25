package com.lojasdelivros.autor.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {

    private Long id;

    @NotNull
    @NotEmpty
    @Size(max =255)
    private String nome;

    @NotNull
    @Max(120)
    private int idade;
    /*Necessário mudar para Integer pois aceita null e notNull, já o tipo int NÂO aceita null e o valor padrão é Zero*/
}
