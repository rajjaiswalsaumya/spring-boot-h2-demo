# spring-boot-h2-demo

A simple application to explain use of h2 database with spring boot.

#Note h2 console needs to be enabled in order to see the console in applciation.properties.

Defaut path to h2 is /h2-console hence hitting http://localhost:9090/h2-console will bring you to h2 login console. 
Enter username sa
Password pwd

and you are good to go with embedded database. Do your testing with this database and finally add jar of your production 
database and comment 
```
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
```

Note h2 console to be disabled in application.properties for production. 

A demo test of devtools was also added to this applciatoion which is commented here. Please check devtools repository 
to know more about dev tools.
