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

### 4, Generic Types

#### 4.1 Convert Json to Generic Types

Note that the embedded class in a class is not necessarily converted. 

```java
public class Foo<T> {
    private boolean ok;
    private T result;
    private String msg;
}
public class Bar {
    private String ossUrl;
    private String supervisionFileName;
    private String originalFilename;
    private String filePath;
}

// ========
JSONObject jsonObject = new JSONObject(response);
Foo<Bar> bean = jsonObject.toBean(TianshunResponseDTO.class);
// An errors will occur in the following segment of code. 
// It is "jsonObject" can not be cast to Bar.class. Because jsobObject didn't convert the 
// "result" in "response" to a Bar object.
bean.getResult();

// Solution
Bar bar = JSONUtil.toBean((JSONObject) bean.getResult(), Bar.class);
```

[Official Documents](https://docs.oracle.com/javase/tutorial/java/generics/index.html)

[Lesson: Generic Types](https://docs.oracle.com/javase/tutorial/extra/generics/index.html)



### 5, Operators Precedence

[Precedence of Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

| Operators            | Precedence                               |
| -------------------- | ---------------------------------------- |
| postfix              | `*expr*++ *expr*--`                      |
| unary                | `++*expr* --*expr* +*expr* -*expr* ~ !`  |
| multiplicative       | `* / %`                                  |
| additive             | `+ -`                                    |
| shift                | `<< >> >>>`                              |
| relational           | `< > <= >= instanceof`                   |
| equality             | `== !=`                                  |
| bitwise AND          | `&`                                      |
| bitwise exclusive OR | `^`                                      |
| bitwise inclusive OR | `|`                                      |
| logical AND          | `&&`                                     |
| logical OR           | `||`                                     |
| ternary              | `? :`                                    |
| assignment           | `= += -= *= /= %= &= ^= |= <<= >>= >>>=` |

Operators in a row have higher precedence than its lower rows in the above table. 



### 7,  `1_11.00` : Underscores are legal in numbers

In order to improve readability, correct usage of underscores in numeric literals is allowed in Java:

- **Integers:** `int x = 1_000_000;`  (Valid)
- **Floating-point:** `float f = 111.00f;` or `float f = 1_11.0f;` (Valid)
- **Hexadecimal:** `int hex = 0xFF_EC_DE_5E;` (Valid)
- **Binary:** `int bin = 0b1010_0101;` (Valid)

See `UnderscoreTest.java` in J-Programmes

### 8, Modifiers

[access control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

#### 1) default and package-private

**N.B.** in `int i;` the implicit modifier is "*package-private*" which is distinct from the modifier `default`.

```java
class Foo {
    /*
    Issue: This code is invalid in Java.
    */
    default void test () {

    }
}
class Bar {
    void test() {   // package-private
    }
}

```

- **Issue:** This code is **invalid** in Java.
  - The `default` keyword is used in **interfaces** to provide a default implementation for a method. It cannot be used in a **class**.
  - If you try to compile this code, you will get a compilation error because `default` is not allowed in a class definition.

In addition, `default` can not be an access modifier of a variable.

```java
// A syntactic error.
default int i;
// Correct
int i;
```

Generally speaking, `default` can only be used as an access modifier of a default implementation of a method in an interface.

#### 2), `protected` and Polymorphism

See `ProtectedTest.java` in J-Programme.  [protected](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html#:~:text=The%20protected%20modifier%20specifies%20that%20the%20member%20can%20only%20be%20accessed%20within%20its%20own%20package%20(as%20with%20package%2Dprivate)%20and%2C%20in%20addition%2C%20by%20a%20subclass%20of%20its%20class%20in%20another%20package.)

> Since `Acc` is in the package of "p1" and Test is in "p2", members like "int r" with the implicit modifier of package-private could be accessed if and only if the subclass is declared without polymorphism as in Example 1. 
>
> When compiled, `obj` is an instance of ACC. Conventionally, members with `protected` can only be accessed within its package (like *package-private*) and, in addition, by a subclass of its class in another package such as in "Example 1" below. 

N.B. The "int r" can not be accessed if the instance variable is the super class outside its package.

```java
package p2;
import p1.Acc;
public class Test extends Acc {
	public static void main(String[] args){
		// Example 1
		Test test = new Test();
		// protected. test.r is accessed because 'r' is inherited by Test
        int t3 = test.r;  
		
		// Example 2
        // When this code is compiled, obj is an instance of Acc and is declared outside its package. Thus, 'r' is not accessed.
		Acc obj = new Test();	
		int r = obj.r;  //protected
	}
}
```

```java
package p1;
public class Acc {
	int p;
	private int q;
	protected int r;
	public int s;
}
```

### 9, Java Is Pass By Value

[Java is pass by value.](https://tmorris.net/posts/java-is-pass-by-value/)

```java
public static void main(String[] args) {
	User u = new User();
	u.id = 10;
	System.out.println("u.id:" + u.id);
	doSome(u);

	System.out.println("After calling method, u.id:" + u.id);
	
}
/*
 * Java is pass by value.
 * In Java, the arguments of a called method are temporary variables to which
 * the caller copy value. Assigning new value to the arguments doesn't change the
 * value of the orginal variables in the caller.
 * The property of Java differenciates it from C; a function in C with pointers as 
 * its parameters have access to the value in its caller by assigning new value to 
 * the pointer.
 * */
public static void doSome(User u) {
	u = new User();	
	u.id = 25;
}
```
