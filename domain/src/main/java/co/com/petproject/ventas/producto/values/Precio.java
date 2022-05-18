package co.com.petproject.ventas.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Precio implements ValueObject<Double> {
    private final Double value;

    public Precio(Double value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isNaN()){
            throw new IllegalArgumentException("Ingrese un valor válido");
        }

        if(this.value < 0){
            throw new IllegalArgumentException("El Precio no puede ser negativo");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
