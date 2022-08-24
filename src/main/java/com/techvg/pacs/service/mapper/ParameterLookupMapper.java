package com.techvg.pacs.service.mapper;

import com.techvg.pacs.domain.ParameterLookup;
import com.techvg.pacs.domain.Society;
import com.techvg.pacs.service.dto.ParameterLookupDTO;
import com.techvg.pacs.service.dto.SocietyDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ParameterLookup} and its DTO {@link ParameterLookupDTO}.
 */
@Mapper(componentModel = "spring")
public interface ParameterLookupMapper extends EntityMapper<ParameterLookupDTO, ParameterLookup> {
    @Mapping(target = "society", source = "society", qualifiedByName = "societyId")
    ParameterLookupDTO toDto(ParameterLookup s);

    @Named("societyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    SocietyDTO toDtoSocietyId(Society society);
}
