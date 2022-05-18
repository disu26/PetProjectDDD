package co.com.petproject.ventas.producto.values;

import co.com.sofka.domain.generic.ValueObject;

public final class Dimensiones implements ValueObject<Dimensiones.Props> {
    private final Double alto;
    private final Double ancho;
    private final Double largo;
    private final Double peso;

    public Dimensiones(Double alto, Double ancho, Double largo, Double peso) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Double alto() {
                return alto;
            }

            @Override
            public Double ancho() {
                return ancho;
            }

            @Override
            public Double largo() {
                return largo;
            }

            @Override
            public Double peso() {
                return peso;
            }
        };
    }

    public interface Props{
        Double alto();
        Double ancho();
        Double largo();
        Double peso();
    }
}
