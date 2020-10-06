package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    BeerDtoV2 beerToBeerDtoV2 (Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
    Beer beerDtoV2ToBeer(BeerDtoV2 beerDtoV2);
}
