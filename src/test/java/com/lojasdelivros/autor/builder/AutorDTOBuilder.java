package com.lojasdelivros.autor.builder;
import com.lojasdelivros.autor.entity.AutorDTO;
import lombok.Builder;
@Builder
public class AutorDTOBuilder {

    @Builder.Default
    private final Long id = 1L;
    @Builder.Default
    private final String nome = "Getulio Azevedo";
    @Builder.Default
    private final int idade = 32;

    public AutorDTO builderAutorDTO(){
        return  new AutorDTO(id, nome, idade);
    }

}
