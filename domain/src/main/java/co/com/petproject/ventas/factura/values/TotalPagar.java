package co.com.petproject.ventas.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class TotalPagar implements ValueObject<Double> {
    private final Double value;

    public TotalPagar(Double value) {
        this.value = Objects.requireNonNull(value);

        if(value.isNaN()){
            throw new IllegalArgumentException("Ingrese un valor numerico");
        }

        if(value < 0){
            throw new IllegalArgumentException("El Precio no puede ser negativo");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
