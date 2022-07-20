package com.foundationvip.springbootessentials.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {

    @NotBlank(message = "Name cannot be empty or null")
    private String name;
}
