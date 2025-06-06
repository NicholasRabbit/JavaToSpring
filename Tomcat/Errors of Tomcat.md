### Some errors exceptions when running Tomcat

1. "The JRE_HOME environment variable is not defined correctly"

   Tomcat's version is 7.0.108.

   The above error appears when executing `startup.bat` in DOS in Windows. 

   How to tackle this question?

   First of all, check whether the setting of JRE in the system environment of Windows is correct or not.

   If it is set, then check the `catalina.bat` if the JRE is set properly. If not, add the path of JRE like `set JRE_HOME=C:\Program Files\Java\jdk1.8.0_101\jre`.