<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Login Form</h1>
        <form action="LoginServlet" method="post">
            <table border="1">
                <tr>
                    <td>Enter Username</td>
                    <td><input type="text" name="i"/></td>
                </tr>
                <tr>
                    <td>Enter password</td>
                    <td><input type="password" name="p"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </table>
        </form>
    </center>
    </body>

    </body>
</html>
