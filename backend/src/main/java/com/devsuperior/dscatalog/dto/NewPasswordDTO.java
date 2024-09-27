package com.devsuperior.dscatalog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class NewPasswordDTO {

    @NotBlank(message = "Campo obrigatório")
    private String token;

    @NotBlank(message = "Campo obrigatório")
    @Size(min = 8, message = "Deve ter no mínimo 08 caracteres")
    private String password;

    public NewPasswordDTO() {
    }

    public NewPasswordDTO(String token, String password) {
        this.token = token;
        this.password = password;
    }

    public @NotBlank(message = "Campo obrigatório") String getToken() {
        return token;
    }

    public void setToken(@NotBlank(message = "Campo obrigatório") String token) {
        this.token = token;
    }

    public @NotBlank(message = "Campo obrigatório") @Size(min = 8, message = "Deve ter no mínimo 08 caracteres") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Campo obrigatório") @Size(min = 8, message = "Deve ter no mínimo 08 caracteres") String password) {
        this.password = password;
    }
}
