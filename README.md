# Selma Mapping Framework test

Error while launching 
```
Exception in thread "main" java.lang.IllegalArgumentException: Unable to load generated mapper class fr.pomverte.LightParameterMapperSelmaGeneratedClass failed : fr.pomverte.LightParameterMapperSelmaGeneratedClass
    at fr.xebia.extras.selma.Selma.createMapperInstance(Selma.java:255)
    at fr.xebia.extras.selma.Selma.getMapper(Selma.java:158)
    at fr.xebia.extras.selma.Selma.access$100(Selma.java:56)
    at fr.xebia.extras.selma.Selma$MapperBuilder.build(Selma.java:349)
    at fr.pomverte.MapperTest.main(MapperTest.java:8)
Caused by: java.lang.ClassNotFoundException: fr.pomverte.LightParameterMapperSelmaGeneratedClass
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at fr.xebia.extras.selma.Selma.createMapperInstance(Selma.java:183)
    ... 4 more
```

## references
- http://blog.xebia.fr/2014/04/24/selma-le-mapping-java-a-la-compilation/
- http://www.selma-java.org/
