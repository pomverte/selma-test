# Selma Mapping Framework test

WARNING : Selma and Lombok are not friends :'(

Since the annotation processor will process Selma's annotations first then Lombok the `SelmaGeneratedClass` will return an empty Object. A workaround would be to use seperate module :
- one with the classes to be mapped with Lombok's annotations
- the second depending on the first with de Selma's mapper

A better solution (possible ?) would be to reconfigure the maven processor annotation plugin

## references
- http://blog.xebia.fr/2014/04/24/selma-le-mapping-java-a-la-compilation/
- http://www.selma-java.org/
