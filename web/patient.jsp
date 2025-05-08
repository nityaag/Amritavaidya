

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Patient Entry Page</title>
    </head>
    <body>
        <form name ='f2'>
            <table>
                <tr>
                    <td colspan='12' align='right' > 
                        PATIENT ENTRY FORM PAGE

                    </td>
                </tr>

                <tr>
                    <td>
                        ENTER THE NAME OF PATIENT
                    </td>
                    <td>
                        <input type="text" name="txtname" value="" size="20" />
                    </td>
                </tr>
                <tr>
                    <td>
                        BLOOD GROUP
                    </td>
                    <td>
                        <select name="bloodgrp">
                            <option>A+</option>
                            <option>A-</option>
                            <option>B+</option>
                            <option>B-</option>
                            <option>AB+</option>
                            <option>AB-</option>
                            <option>O+</option>
                            <option>O-</option>


                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        CONTACT NUMBER
                    </td>
                    <td>
                        <input type="text" name="txtnumber" value="" size="20" />
                    </td>
                </tr>

                <tr>
                    <td>
                        GENDER
                    </td>
                    <td>
                        <input type="radio" name="rdogroup" value="male" checked="checked" />MALE
                        <input type="radio" name="rdogroup" value="female" checked="checked" />FEMALE
                        <input type="radio" name="rdogroup" value="others" checked="checked" />OTHERS

                    </td>
                </tr>
                <tr>
                    <td>
                        DATE OF BIRTH
                    </td>
                    <td>
                        <input type="date" id="dob" name="dob" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        EMAIL
                    </td>
                    <td><input type="text" name="txtemail" value="" size="30" />


                    </td>
                </tr>

                <tr>
                    <td>
                        ENTER THE USERNAME 
                    </td>
                    <td>
                        <input type="text" name="txtuid" value="" size="20" />
                    </td>
                </tr>
                <tr>
                    <td>
                        ENTER THE PASSWORD
                    </td>
                    <td>
                        <input type="text" name="txtpwd" value="" size="20" />
                    <td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="LOGIN" name="btnin" />
                        <input type="reset" value="RESET" name="btnreset"/>
                        <input type="submit" value="CANCEL" name="btnc" />

                    </td>
                </tr>
            </table>

        </form>
    </body>
</html>
<%
    if (request.getParameter("btnin") != null) {
        try {
            String ename = request.getParameter("txtname");
            String bgrp = request.getParameter("txtbloodgrp");
            String contactnum = request.getParameter("txtnum");
            String email = request.getParameter("txtemail");
            String birthdate = request.getParameter("dob");
            String gender = request.getParameter("rdogroup");
            String usern = request.getParameter("txtuid");
            String pwd = request.getParameter("txtpwd");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
            Statement stmt = conn.createStatement();
            int x = stmt.executeUpdate("insert into AV.PATIENT values ('" + ename + "','" + bgrp + "','" + gender + "','" + birthdate + "','" + email + "','" + usern + "','" + pwd + "','" + contactnum + "')");
            if (x > 0) {
                response.sendRedirect("login.jsp");
                out.print("<script>alert('INSERTION SUCCESSFULL');</script>");

            } else {
                response.sendRedirect("error.jsp");
                out.print("<script>alert('Invalid user id and password');</script>");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    if (request.getParameter("btnc") != null) {
        response.sendRedirect("home.jsp");

    }


%>
