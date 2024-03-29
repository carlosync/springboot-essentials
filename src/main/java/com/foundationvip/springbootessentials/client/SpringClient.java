package com.foundationvip.springbootessentials.client;

import com.foundationvip.springbootessentials.domain.Anime;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Log4j2
public class SpringClient {
    public static void main(String[] args) {
        ResponseEntity<Anime> entity = new RestTemplate().getForEntity("http://localhost:8080/animes/{id}", Anime.class, 2);
        log.info(entity);

        Anime object = new RestTemplate().getForObject("http://localhost:8080/animes/{id}", Anime.class, 3);
        log.info(object);

        ResponseEntity<List<Anime>> exchange = new RestTemplate().exchange("http://localhost:8080/animes/all", HttpMethod.GET, null,
                new ParameterizedTypeReference<>() {});
        log.info(exchange.getBody());

        Anime kingdon = Anime.builder().name("Kingdon").build();
        Anime animeSaved = new RestTemplate().postForObject("http://localhost:8080/animes/", kingdon, Anime.class);
        log.info("Anime saved {}", animeSaved);

    }
}
