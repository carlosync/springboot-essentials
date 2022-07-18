package com.foundationvip.springbootessentials.mapper;

import com.foundationvip.springbootessentials.domain.Anime;
import com.foundationvip.springbootessentials.request.AnimePostRequestBody;
import com.foundationvip.springbootessentials.request.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);
    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
