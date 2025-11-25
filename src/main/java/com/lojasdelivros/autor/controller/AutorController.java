package com.lojasdelivros.autor.controller;

import com.lojasdelivros.autor.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/autores")
public class AutorController implements  AutorControllerDocs{

    private AutorService autorService;

    @Autowired
    public AutorController(AutorService autorService){
        this.autorService = autorService;


    }
}
