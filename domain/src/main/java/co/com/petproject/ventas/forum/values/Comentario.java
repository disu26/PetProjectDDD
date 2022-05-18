package co.com.petproject.ventas.forum.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Comentario implements ValueObject<String> {
    private final String value;

    public Comentario(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El comentario no puede estar vacío");
        }

        if(this.value.length() < 50){
            throw new IllegalArgumentException("El comentario no permite menos de 50 caracteres");
        }

    }

    @Override
    public String value() {
        return value;
    }
}
