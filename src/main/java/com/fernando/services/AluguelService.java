package com.fernando.services;

import com.fernando.entities.Filme;
import com.fernando.entities.NotaAluguel;

public interface AluguelService {
    NotaAluguel alugar(Filme filme);
}
