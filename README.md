# Selma Mapping Framework test

Simple use case to map [RichParameter](https://github.com/pomverte/selma-test/blob/master/src/main/java/fr/pomverte/RichParameter.java) => [LightParameter](https://github.com/pomverte/selma-test/blob/master/src/main/java/fr/pomverte/LightParameter.java) using [LightParameterMapper](https://github.com/pomverte/selma-test/blob/master/src/main/java/fr/pomverte/LightParameterMapper.java)

See : [MapperTest](https://github.com/pomverte/selma-test/blob/master/src/test/java/fr/pomverte/MapperTest.java)

## WARNING
Selma and Lombok are not friends :'(

Since the annotation processor will process Selma's annotations first then Lombok the `SelmaGeneratedClass` will return an empty Object. A workaround would be to use seperate module :
- one with the classes to be mapped with Lombok's annotations
- the second depending on the first with de Selma's mapper

A better solution (possible ?) would be to reconfigure the maven processor annotation plugin

## References
- http://blog.xebia.fr/2014/04/24/selma-le-mapping-java-a-la-compilation/
- http://www.selma-java.org/
