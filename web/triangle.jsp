<%--
    Document   : result
    Created on : Jan 30, 2017, 12:29:25 PM
    Author     : kanst_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="padding:2%;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Triangle Result</title>
    </head>
    <body>
        <h1>Triangle Calculator</h1>
        <p><a href="index.html">Find the area of another shape</a>.</p>
        <h2>√<span style="border-top:1px solid black;">${height}<sup>2</sup> * ${base}<sup>2</sup></span> = ${area}</h2>
        <h3>√<span style="border-top:1px solid black;">H<sup>2</sup> * L<sup>2</sup></span> = A</h3>
        <table>
            <tr>
                <td>
                    <p style="width: 0; height: 0;border-bottom: ${base}0px solid black;border-left: ${height}0px solid transparent;"></p>
                </td>
                <td>
                    ${height}
                </td>
            </tr>
            <tr>
                <td>
                    ${base}
                </td>
                <td></td>
            </tr>
        </table>
    </body>
</html>
