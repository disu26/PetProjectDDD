package co.com.petproject.ventas.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Telefono implements ValueObject<String> {
    private final String value;

    public Telefono(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El Teléfono no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
