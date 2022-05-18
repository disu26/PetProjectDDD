package co.com.petproject.ventas.forum.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Descripcion implements ValueObject<String> {
    private final String value;

    public Descripcion(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }

        if(this.value.length() < 200){
            throw new IllegalArgumentException("La descripción no permite menos de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
