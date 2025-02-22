### 1, Naming conventions

#### Naming a Package

With programmers worldwide writing classes and interfaces using the  Java programming language, it is likely that many programmers will use  the same name for different types. In fact, the previous example does  just that: It defines a `Rectangle` class when there is already a `Rectangle` class in the `java.awt` package. Still, the compiler allows both classes to have the same name  if they are in different packages. The fully qualified name of each `Rectangle` class includes the package name. That is, the fully qualified name of the `Rectangle` class in the `graphics` package is `graphics.Rectangle`, and the fully qualified name of the `Rectangle` class in the `java.awt` package is `java.awt.Rectangle`.

This works well unless two independent programmers use the same name for their packages. What prevents this problem? Convention.

#### Naming Conventions

Package names are written in all lower case to avoid conflict with the names of classes or interfaces.

Companies use their reversed Internet domain name to begin their package names—for example, `com.example.mypackage` for a package named `mypackage` created by a programmer at `example.com`.

Name collisions that occur within a single company need to be handled by convention within that company, perhaps by including the region or  the project name after the company name (for example, `com.example.region.mypackage`).

Packages in the Java language itself begin with `java.` or `javax.`

In some cases, the internet domain name may not be a valid package  name. This can occur if the domain name contains a hyphen or other  special character, if the package name begins with a digit or other  character that is illegal to use as the beginning of a Java name, or if  the package name contains a reserved Java keyword, such as "int". In  this event, the suggested convention is to add an underscore. For  example:

| Domain Name                   | Package Name Prefix           |
| ----------------------------- | ----------------------------- |
| `hyphenated-name.example.org` | `org.example.hyphenated_name` |
| `example.int`                 | `int_.example`                |
| `123name.example.com`         | `com.example._123name`        |

[Naming Conventions](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html)

### 2, Anonymous Classes of Concrete Class

We can override not only methods in interfaces or abstract classes  but also concrete class.

`LoginServlet` is a class, not interface or abstract class.  Example : `TestLoginServletRefactor` in TDD and Unit Test.

```java
LoginServlet servlet = new LoginServlet() {
            // Use fake instead of real thing. Namely return a fake "authenticator".
            @Override
            protected AuthenticationService getAuthenticationService() {
                return authenticator;
            }
        };
```

### 3, String

##### 3.1) Why the concatenation of `null + "Foo"` is `"nullFoo"`?

```java
char str2[] = {'J', 'a', 'v', 'a'};
String str3 = null;

for (char c : str2) {
    str3 = str3 + c;
}
// str3 is "nullJava".
System.out.println(str3);
```

The `+` operator in Java is overloaded to perform concatenation. If any operand were not a String, it would be converted to a String by calling `String.valueOf(...)`. Therefore if `null` is declared as a String which is an Object the method `valueOf(Obejct)` will be called and overrode. 

```java
// java.lang.String#valueOf(java.lang.Object)
public static String valueOf(Object obj) {
    return (obj == null) ? "null" : obj.toString();
}
```


