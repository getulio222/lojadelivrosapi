package com.lojasdelivros.autor.mapper;

import com.lojasdelivros.autor.entity.Autor;
import com.lojasdelivros.autor.entity.AutorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutorMapper {

    /*Precisa serguir essa padronização para que o MapperStruct consiga criar os DTO's automaticamente*/

    /*Alternativa para instanciar manualmente sem Spring */
    AutorMapper INSTANCIE = Mappers.getMapper(AutorMapper.class);

    /*Forma de Direcionar o mapeameto*/

    /*Entidade Autor para AutorDTO*/
    Autor toModel(AutorDTO autordto);

    /*AutorDTO para Entidade Autor*/
    AutorDTO toDto(Autor autor);


}
