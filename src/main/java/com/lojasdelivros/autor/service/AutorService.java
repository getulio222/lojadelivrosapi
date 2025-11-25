package com.lojasdelivros.autor.service;

import com.lojasdelivros.autor.mapper.AutorMapper;
import com.lojasdelivros.autor.repository.AutorRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final static AutorMapper autorMapper = AutorMapper.INSTANCIE;

    private AutorRepository autorRepository;
   @Autowired
    public AutorService(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }



}
