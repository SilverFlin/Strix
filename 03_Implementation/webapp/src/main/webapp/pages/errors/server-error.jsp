<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="/webapp/assets/css/errors/errorStyles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <jsp:include page="fragments/header.jspf" />
        <div class="contenedor">
            <div  class="hijo">
                <span id="error-code">Error 500</span>
                <p id="message">Ups! parece que algo sali� mal.</p>
                <img src="/webapp/assets/images/ErrorImg.png" alt="iconoError">
            </div>
        </div>
        <jsp:include page="fragments/footer.jspf" />
    </body>
</html>
