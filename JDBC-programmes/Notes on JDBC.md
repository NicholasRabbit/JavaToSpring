### 1,  Drivers of MySQL 5.0 and 8.0

```properties
#mysql database setting
jdbc.type=mysql
# MySQL 5.7
#jdbc.driver=com.mysql.jdbc.Driver
# MySQL 8
jdbc.driver=com.mysql.cj.jdbc.Driver
```

time zone and others settings for MySQL 8.0

```yml
    url: 
      jdbc:mysql://locshost:3306/dept?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true
```

