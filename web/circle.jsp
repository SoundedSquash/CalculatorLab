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
        <title>Circle Result</title>
    </head>
    <body>
        <h1>Circle Calculator</h1>
        <p><a href="index.html">Find the area of another shape</a>.</p>
        <h2>π * ${size}<sup>2</sup> = ${area}</h2>
        <h3>π * R<sup>2</sup> = A</h3>
        <table>
            <tr>
                <td style="border: 2px solid black; width: calc(${area} * 5px); height: calc(${area} * 5px); border-radius: calc((${area} / 2) * 5px);">

                </td>
            </tr>
        </table>
    </body>
</html>
