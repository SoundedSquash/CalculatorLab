<%--
    Document   : result
    Created on : Jan 30, 2017, 12:29:25 PM
    Author     : kanst_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="padding:2%; height:70%;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Result</title>
    </head>
    <body style="height:100%">
        <h1>Rectangle Calculator</h1>
        <p><a href="index.html">Find the area of another shape</a>.</p>
        <h2>${length} * ${width} = ${area}</h2>
        <h3>L * W = A</h3>
        <table style="height: calc(${width} * 1%);">
            <tr>
                <td style="text-align:center;">
                    ${length}
                </td>
                <td>
                    
                </td>
            </tr>
            <tr>
                <td style="border: 2px solid black; width: calc(${length} * 1em); height: calc(${width} * 1em);">
                    <center>${area}</center>
                </td>
                <td>
                    ${width}
                </td>
            </tr>
        </table>
    </body>
</html>
