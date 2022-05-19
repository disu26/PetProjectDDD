package co.com.petproject.ventas.forum.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Respuesta implements ValueObject<String> {
    private final String value;

    public Respuesta(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("La respuesta no puede estar vacía");
        }

        if(this.value.length() < 50){
            throw new IllegalArgumentException("La respuesta no permite menos de 50 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
