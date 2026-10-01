package pe.edu.utec.dbp.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class UserDTO {
    // @DecimalMin / @DecimalMax: Valida el valor mínimo y máximo para tipos UserDTO(incluido BigDecimal).
    @NotNull(message = "La contraseña debe tener 8 caracteres")
    // @Min / @Max: Valida el valor mínimo y máximo para tipos primitivos (int long, etc.) y sus wrappers.
    // 3. Validación de formato de datos (email y expresiones regulares)
    // @Email: Valida que el String tenga un formato de email válido.
    @Email(message = "El formato del email es incorrecto")
    @NotBlank(message = "El email del proveedor es obligatorio")
    private String email;
    // 4. Validación de fechas
    // @Past / @Future: Valida que un campo de fecha sea en el pasado o en el futuro.
    @Past(message = "La fecha de fabricación debe ser una fecha pasada")
    private java.time.LocalDate fechaFabricacion;
    // (Getters y Setters)
}