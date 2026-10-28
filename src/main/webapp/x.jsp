<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Voting Eligibility</title>
</head>
<body>

    <c:set var="name" value="Sree" />
    <c:out value="${name}" />
    <br>
    
    <c:set var="age" value="${30}" />
    
    <c:if test="${age >= 30}">
        vote
    </c:if>
    
    <br>
    <c:set var="marks" value="60" />
    
  <c:choose>
    
    <c:when test="${marks>=90 }">
    Grade A
    </c:when>
    
    <c:when test="${marks>=50 }">
    Grade B
    </c:when>
    
    <c:otherwise>
    Grade C
    </c:otherwise>
  </c:choose>

<br>
<c:forEach var="i" begin="1" end="20">
${i } <br>
</c:forEach>
</body>
</html>