#### 1,  Viewing the Contents of a JAR File

1,Viewing the Contents of a JAR File

```shell
jar tf project02.jar 
or 
jar tvf project02.jar (t:table , f:file, v:display additional information)
```

2,The Jar tool provides a u option which you can use to update the contents of an existing JAR file by modifying its manifest or by adding files.

Caution: 

```shell
jar uf project02.jar conf/log4j.xml    (add or update if exists the same file)
```

3, You can use the -C option to "change directories" during execution of the command. For example:

```shell
jar -uf project02.jar -C conf application.yaml
```

refers to : https://docs.oracle.com/javase/tutorial/deployment/jar/update.html

#### 9,  Extracting the contents of a jar file:

从jar包里解压出一个文件:

1, Viewing where is the file which you want to extract

```bash
jar tvf project.jar:  
!! | grep log4j.xml  : find the directory  #Linux OS
```

2, Extracting the file

```bash
jar xvf project02.jar   conf/log4j.xml  :  extracting  conf/log4j.xml from project02.jar
```

```txt
Note:
conf/log4j.xml  is an optional argument consisting of a space-separated list of the files to be extracted from the archive. If this argument is not present, the Jar tool will extract all the files in the archive.
```

refers to : https://docs.oracle.com/javase/tutorial/deployment/jar/unpack.html

3, replace the file in jar

```bash
jar -uvf0  project02.jar   conf/log4j.xml 
```

