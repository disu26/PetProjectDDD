package co.com.petproject.ventas.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class MedioPago implements ValueObject<String> {
    private String value;

    public MedioPago(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El medio de pago no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
