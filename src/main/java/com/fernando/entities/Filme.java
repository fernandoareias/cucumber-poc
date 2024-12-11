package com.fernando.entities;

public class Filme {

    public Filme() {
    }

    public Filme(Integer estoque) {
        this.estoque = estoque;
    }

    private int aluguel;

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    private Integer estoque;

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
