package com.foundationvip.springbootessentials.services;

import com.foundationvip.springbootessentials.domain.Anime;
import com.foundationvip.springbootessentials.exception.BadRequestException;
import com.foundationvip.springbootessentials.mapper.AnimeMapper;
import com.foundationvip.springbootessentials.request.AnimePostRequestBody;
import com.foundationvip.springbootessentials.repository.AnimeRepository;
import com.foundationvip.springbootessentials.request.AnimePutRequestBody;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnimeServices {
    private final AnimeRepository animeRepository;
    public AnimeServices(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public Page<Anime> listAll(Pageable pageable){
        return animeRepository.findAll(pageable);
    }
    public List<Anime> listAllNonPageble() {
        return animeRepository.findAll();
    }

    public List<Anime> findByName(String anime){
        return animeRepository.findByName(anime);
    }

    public Anime findByIdOrThrowBadRequestException(Long id){
        return animeRepository.findById(id).
                orElseThrow(() -> new BadRequestException("Anime not found"));
    }
    @Transactional
    public Anime save(AnimePostRequestBody animePostRequestBody) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(Long id) {
       animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        animeRepository.save(anime);
    }


}
