<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Registration Form</h1>
        <form action="RegistrationServlet" method="post">
            <table border="1">
                <tr>
                    <td>Enter Username</td>
                    <td><input type="text" name="u"/></td>
                </tr>
                <tr>
                    <td>Enter Email id</td>
                    <td><input type="text" name="e"/></td>
                </tr>
                <tr>
                    <td>Enter Contact No</td>
                    <td><input type="text" name="c"/></td>
                </tr>
                <tr>
                    <td>Enter password</td>
                    <td><input type="password" name="p"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
