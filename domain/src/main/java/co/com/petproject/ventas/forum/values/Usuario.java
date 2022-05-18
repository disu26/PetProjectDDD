package co.com.petproject.ventas.forum.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Usuario implements ValueObject<String> {
    private final String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = Objects.requireNonNull(nombreUsuario);

        if (this.nombreUsuario.isBlank()){
            throw new IllegalArgumentException("El nombre de usuario no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return nombreUsuario;
    }
}
