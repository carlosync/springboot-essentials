package com.foundationvip.springbootessentials.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Anime {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
