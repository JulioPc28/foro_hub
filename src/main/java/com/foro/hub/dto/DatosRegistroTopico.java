package com.foro.hub.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String curso,
        @NotBlank String autor
) {
}

record DatosActualizarTopico(
        @NotBlank Long id,
        String titulo,
        String mensaje,
        String curso
) {
}