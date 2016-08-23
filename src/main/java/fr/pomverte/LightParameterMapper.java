package fr.pomverte;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.DESTINATION)
public interface LightParameterMapper {
    LightParameter fromRichParameter(RichParameter source);
}
