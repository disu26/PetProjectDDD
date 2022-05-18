package co.com.petproject.ventas.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El Nombre no puede estar en blanco");
        }
    }

    public Nombre actualizarNombre(String nombre){
        return new Nombre(nombre);
    }

    @Override
    public String value() {
        return value;
    }
}
