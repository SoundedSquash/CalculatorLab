<%-- 
    Document   : result
    Created on : Jan 30, 2017, 12:29:25 PM
    Author     : kanst_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Result</title>
    </head>
    <body>
        <h1>${length} * ${width} = ${area}</h1>
        <h3>L * W = A</h3>
        <table>
            <tr>
                <td style="text-align:center;">
                    ${length}
                </td>
                <td>
                    
                </td>
            </tr>
            <tr border="1">
                <td style="border: 2px solid black; width: calc(${length} * 20px); height: calc(${width} * 20px);">
                    <center>${area}</center>
                </td>
                <td>
                    ${width}
                </td>
            </tr>
        </table>
        <br>
        <p><a href="index.html">Find the area of another rectangle</a>.</p>
    </body>
</html>
