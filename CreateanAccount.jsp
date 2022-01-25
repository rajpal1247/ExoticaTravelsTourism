<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <a href="LogoutServlet">Logout Servlet</a>
        <table>
            <form action="HotelBookingServlet" method="post">
                <tr>
                    <td><h3>Tour Package Booking</h3></td>
                    <td>Select a destination</td>
                            <td><select name="destination">
                                    <option value="Select">Select</option> 
                                    <option value="Colombo">Colombo</option> 
                                    <option value="Ella">Ella</option> 
                                    <option value="Sigiriya">Sigiriya</option> 
                                    <option value="Galle">Galle</option> 
                                    <option value="Kandy">Kandy</option> 
                        </select></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Next"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </form>
        </table>
    </center>
    </body>
</html>
