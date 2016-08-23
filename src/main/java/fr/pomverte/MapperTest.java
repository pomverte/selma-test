package fr.pomverte;

import fr.xebia.extras.selma.Selma;

public class MapperTest {
    public static void main(String[] args) {
        // Get LightParameterMapper
        LightParameterMapper mapper = Selma.builder(LightParameterMapper.class).build();

        RichParameter source = new RichParameter("Mass", "Effect", "N7", "EARTH");

        // Map my InBean
        LightParameter res = mapper.fromRichParameter(source);

        System.out.println(res);
    }
}
