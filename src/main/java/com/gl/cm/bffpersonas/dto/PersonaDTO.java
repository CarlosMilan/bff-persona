package com.gl.cm.bffpersonas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {
    private UUID id;
    @NotNull
    private String dni;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    @Email(regexp = ".+@.+\\..+")
    private String email;

    private String fechaNacimiento;
    private List<DireccionDTO> direcciones;
}
