<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            a
            {
                background-color: violet;
                color:white;
                padding:16px 12px;
            }
            a:hover
            {
                background-color: violet;
                color:cyan;
            }

            .f1
            {
              float:left;
              border:0px;
              overflow:scroll;  
              background: -webkit-linear-gradient(top, #FF6347 0%,#FF6347 50%, #FF6347 100%)              
            }
            .f2
            {
              float:right;
              border:0px;
              background-color: darkorange;
              overflow:scroll; 
            }
            .f3
            {
              float:middle;
              border:0px;
              overflow:scroll;  
              background: -webkit-linear-gradient(top, #FF6347 0%,#FF6347 50%, #FF6347 100%)
                
            }
            .f4
            {
              float:left;
              border:0px;
              overflow:scroll;                  
            }

        </style>
    </head>
    <body>
        <iframe class="f3" name="top" align="top" src="HeadingFramePage.jsp" width="100%" height="130"></iframe>
        <iframe class="f1" name="left" align="left" src="LinksPage.jsp" width="20%" height="500"></iframe>
        <iframe class="f4" name="middle" align="right" src="MainPage.jsp" width="80%" height="500"></iframe>
    </body>
</html>
