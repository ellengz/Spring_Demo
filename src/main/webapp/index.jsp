<html>
<body>
<h2>Welcom to Ball Games Management System!</h2>

<h2>Login</h2>
<form:form method="POST" action="/login">
    <table>
        <tr>
            <td><form:label path="id">id</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td><form:label path="password">password</form:label></td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="login"/>
            </td>
            <td colspan="2">
                <input type="submit" value="register"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
