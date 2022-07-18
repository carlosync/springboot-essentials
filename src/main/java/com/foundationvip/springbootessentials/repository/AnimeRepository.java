package com.foundationvip.springbootessentials.repository;

import com.foundationvip.springbootessentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository  extends JpaRepository<Anime, Long> {
}
