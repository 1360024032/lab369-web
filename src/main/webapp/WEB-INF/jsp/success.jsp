<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC上传文件示例</title>
</head>
<body>
    <b> 文件- 上传成功！ </b> 
    <form:form method="GET" action="/Lab369/redirect">
        <table>
            <tr>
                <td><input type="submit" value="return original page" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>