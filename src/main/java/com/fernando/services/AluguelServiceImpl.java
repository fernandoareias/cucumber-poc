package com.fernando.services;

import com.fernando.entities.Filme;
import com.fernando.entities.NotaAluguel;
import io.cucumber.java.ca.Cal;

import java.util.Calendar;

public class AluguelServiceImpl implements AluguelService{
    @Override
    public NotaAluguel alugar(Filme filme) {



        var nota = new NotaAluguel();
        nota.setPreco(filme.getAluguel());

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        nota.setDataEntrega(cal.getTime());

        filme.setEstoque(filme.getEstoque() - 1 >= 0 ? filme.getEstoque() - 1 : 0);

        return nota;
    }
}
