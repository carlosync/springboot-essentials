package com.foundationvip.springbootessentials.services;

import com.foundationvip.springbootessentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServices {
    public List<Anime> listAll(){
        return List.of(new Anime(1L, "Naruto"), new Anime(2L, "Pokemon"));
    }
}
