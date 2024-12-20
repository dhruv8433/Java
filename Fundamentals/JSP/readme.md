# JSP Tags Guide

## Introduction to JSP Tags
JavaServer Pages (JSP) is a technology that helps developers create dynamically generated web pages based on HTML, XML, or other document types. JSP allows you to embed Java code directly into your HTML pages using tags. Below is a detailed guide on the types of JSP tags with examples.

---

## 1. **Directive Tags**
Directive tags provide global information about the JSP page and its properties. They are written as:

```jsp
<%@ directive attribute="value" %>
```

### Types of Directive Tags:

### 1.1 Page Directive
Defines attributes for the entire JSP page.

```jsp
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
```

**Attributes:**
- `language`: Specifies the scripting language (default is `java`).
- `contentType`: Specifies the MIME type.
- `pageEncoding`: Specifies the character encoding.

### 1.2 Include Directive
Includes a static file at compile time.

```jsp
<%@ include file="header.jsp" %>
```

### 1.3 Taglib Directive
Declares a tag library that can be used in the JSP page.

```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
```

---

## 2. **Scriptlet Tags**
Used to embed Java code directly into the JSP page.

```jsp
<%
  // Java code here
  int sum = 5 + 10;
  out.println("Sum: " + sum);
%>
```

---

## 3. **Declaration Tags**
Allows you to declare variables and methods that get added to the servlet class.

```jsp
<%!
  private int calculateSum(int a, int b) {
      return a + b;
  }
%>
```

You can then use the declared method or variable anywhere in the JSP page.

---

## 4. **Expression Tags**
Used to output values to the client. The result of the expression is evaluated and converted into a string.

```jsp
<%= "Current Time: " + new java.util.Date() %>
```

---

## 5. **Action Tags**
Action tags are used to perform specific tasks, such as including other resources or interacting with JavaBeans.

### 5.1 `jsp:include`
Includes another resource at request time.

```jsp
<jsp:include page="footer.jsp" />
```

### 5.2 `jsp:forward`
Forwards the request to another resource.

```jsp
<jsp:forward page="nextPage.jsp" />
```

### 5.3 `jsp:useBean`
Creates or locates a JavaBean instance.

```jsp
<jsp:useBean id="user" class="com.example.User" />
```

---

## 6. **Custom Tags**
You can define your own tags using tag libraries.

### Example:
Define a custom tag library in `tld` file:

```xml
<tag>
    <name>greet</name>
    <tag-class>com.example.GreetTag</tag-class>
    <body-content>empty</body-content>
</tag>
```

Use it in JSP:

```jsp
<%@ taglib uri="/WEB-INF/tlds/custom.tld" prefix="custom" %>
<custom:greet name="John" />
```

---

## Example JSP Page Using All Tags

```jsp
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Tags Example</title>
</head>
<body>
    <%-- Scriptlet Tag --%>
    <h1>Welcome to JSP Tags Tutorial</h1>
    <% int num1 = 10, num2 = 20; %>

    <%-- Expression Tag --%>
    <p>Sum: <%= num1 + num2 %></p>

    <%-- Declaration Tag --%>
    <%!
      private int multiply(int a, int b) {
          return a * b;
      }
    %>
    <p>Multiplication: <%= multiply(num1, num2) %></p>

    <%-- Action Tag --%>
    <jsp:include page="footer.jsp" />
</body>
</html>
```

---

## Conclusion
This guide covers the essential tags used in JSP development. These tags allow you to mix Java code with HTML and build dynamic web applications efficiently.

