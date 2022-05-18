package co.com.petproject.ventas.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Introduccion implements ValueObject<String> {
    private final String value;

    public Introduccion(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("La Introducción no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
