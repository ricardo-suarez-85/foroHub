package com.good_proyects.foro_hub.models.dtos.autenticacion;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RespuestaAutenticacion {

    private String token;

    @JsonProperty("usuario")
    private PerfilUsuarioDTO perfilUsuarioDTO;

}
