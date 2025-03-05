### 1, Convert Json to Generic Types

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

