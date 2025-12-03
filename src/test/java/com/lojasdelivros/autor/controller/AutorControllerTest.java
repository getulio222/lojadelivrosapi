package com.lojasdelivros.autor.controller;

import com.lojasdelivros.autor.builder.AutorDTOBuilder;
import com.lojasdelivros.autor.service.AutorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ExtendWith(MockitoExtension.class)
public class AutorControllerTest {

    @Mock
    private AutorService autorService;

    @InjectMocks
    private AutorController autorController;

    private MockMvc mockMvc;

    private AutorDTOBuilder autorDTOBuilder;

    @BeforeEach
    void setUp() { // Setup de inicializaçao padrão para teste do controller

       autorDTOBuilder = AutorDTOBuilder.builder().build();
       mockMvc = MockMvcBuilders.standaloneSetup(autorController)
               .setCustomArgumentResolvers( new PageableHandlerMethodArgumentResolver())
               .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
               .build();
        }
}
