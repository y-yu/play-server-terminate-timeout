Play server terminate-timeout
=======================================

- https://github.com/playframework/playframework/pull/11144

## How to use

1. Launch server: `sbt run`
2. Watch server process number: `ps | grep java`
    ```console
    $ ps | grep java
    23923 ttys002    1:52.50 java -Dfile.encoding=UTF-8 -Xms1024m -Xmx1024m -Xss4M -XX:ReservedCodeCacheSize=128m -Dscala.ext.dirs=/Users/yyu/.sbt/1.0/java9-rt-ext-amazon_com_inc__11_0_9_1 -jar /usr/local/Cellar/sbt/1.5.7/libexec/bin/sbt-launch.jar
    24877 ttys004    0:00.01 grep java
    ```
3. Warm up request: `curl http://localhost:9000/`
4. Request to server: `curl http://localhost:9000/?sleepSeconds=10`
5. Kill the server: `kill <<(2) process number>>`

See also [`application.conf`](https://github.com/y-yu/play-server-terminate-timeout/blob/master/conf/application.conf).
