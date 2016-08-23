package fr.pomverte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.xebia.extras.selma.Selma;

public class MapperTest {
    @Test
    public void fromRichParameterTest() {
        // Get LightParameterMapper
        LightParameterMapper mapper = Selma.builder(LightParameterMapper.class).build();

        RichParameter source = new RichParameter("Mass", "Effect", "N7", "EARTH");

        // Map my InBean
        LightParameter res = mapper.fromRichParameter(source);

        assertEquals("Mass", res.getUser());
        assertEquals("Effect", res.getPassword());
    }
}
