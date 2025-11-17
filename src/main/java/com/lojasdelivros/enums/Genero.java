package com.lojasdelivros.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genero {

    MALE("Masculino"),
    FEMALE("Feminino");

    Genero(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getDescricao() {
		return descricao;
	}

	private String descricao;
}

