package com.aula2.model;

import java.io.Serializable;
import java.time.LocalTime;

public class Caminhada implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private LocalTime tempoMaximo;
    private LocalTime tempoMinimo;

    public LocalTime getTempoMaximo() {
        return tempoMaximo;
    }


	public void setTempoMaximo(final LocalTime tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    public LocalTime getTempoMinimo() {
        return tempoMinimo;
    }

    public void setTempoMinimo(final LocalTime tempoMinimo) {
        this.tempoMinimo = tempoMinimo;
    }
}