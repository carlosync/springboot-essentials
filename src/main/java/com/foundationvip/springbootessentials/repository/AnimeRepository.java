package com.foundationvip.springbootessentials.repository;

import com.foundationvip.springbootessentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository  extends JpaRepository<Anime, Long> {

    List<Anime> findByName(String name);
}
