# springboot-starter-zero

**java.lang.reflect.InaccessibleObjectException when starting application?**

Edit your run configuration and add the following VM argument:

--add-opens java.base/java.lang=ALL-UNNAMED
