package com.foundationvip.springbootessentials.controller;

import com.foundationvip.springbootessentials.domain.Anime;
import com.foundationvip.springbootessentials.services.AnimeServices;
import com.foundationvip.springbootessentials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeServices animeServices;

    @GetMapping("/list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeServices.listAll();
    }
}
