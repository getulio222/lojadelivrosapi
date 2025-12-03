package com.lojasdelivros.autor.service;

import com.lojasdelivros.autor.builder.AutorDTOBuilder;
import com.lojasdelivros.autor.mapper.AutorMapper;
import com.lojasdelivros.autor.repository.AutorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AutorServiceTest {
    private final AutorMapper autorMapper = AutorMapper.INSTANCIE;

    @Mock
    private AutorRepository autorRepository;

    @InjectMocks
    private AutorService autorService;

    private AutorDTOBuilder autorDTOBuilder;

    @BeforeEach
    void setUp() {
        autorDTOBuilder = AutorDTOBuilder.builder().build(); // Metodo para construir o Build de AutorDTO
      //  AutorDTO autorDTO = autorDTOBuilder.builderAutorDTO();
    }
}
