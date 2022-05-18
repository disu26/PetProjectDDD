package co.com.petproject.ventas.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Stock implements ValueObject<Integer> {
    private final Integer value;

    public Stock(Integer value) {
        this.value = Objects.requireNonNull(value);

        if(this.value < 0){
            throw new IllegalArgumentException("El Stock no puede ser negativo");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
