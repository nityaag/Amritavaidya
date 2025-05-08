

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Doctor Entry Page</title>
    </head>
    <body>
        <form name ='f2'>
            <table>
                <tr>
                    <td colspan='12' align='right' > 
                        DOCTOR ENTRY FORM PAGE

                    </td>
                </tr>

                <tr>
                    <td>
                        ENTER THE NAME OF DOCTOR
                    </td>
                    <td>
                        <input type="text" name="txtname" value="" size="20" />
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
                        EMAIL
                    </td>
                    <td><input type="text" name="txtemail" value="" size="30" />


                    </td>
                </tr>
                <tr>
                    <td>
                        QUALIFICATION
                    </td>
                    <td>
                        <select name="qualification">
                            <option>MBBS(Bachelor Of Medicine,Bachelor Of Surgery)</option>
                            <option>BAMS(Bachelor Of Ayurvedic Medicine and Surgery)</option>
                            <option>BHMS(Bachelor of Homeopathic Medicine and Surgery)</option>
                            <option>BUMS(Bachelor of Unani Medicine  and Surgery)</option>
                            <option>BNYS(Bachelor of Naturopathy and yogic Science)</option>
                            <option>MD(Doctor of Medicine)</option>
                            <option>MS(Master of Surgery)</option>
                            <option>DNB(Diploma of National Board)</option>
                            <option></option>
                        </select>

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
                        Specialty
                    </td>
                    <td>
                        <select name="specialty">
                            <option> MD(General Medicine)</option>
                            <option>MS(General Surgery)</option>
                            <option>MD(Pediatrics)</option>
                            <option>MD(Gynecology and Obstetrics)</option>
                            <option>MD(Dermatology)</option>
                            <option>MD(Psychiatry)</option>
                            <option>MD(Radiology)</option>
                            <option>MS(Orthopedics)</option>
                            <option>MS(ENT)</option>
                            <option>MS(Ophthalmology)</option>
                        </select>
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
                        <input type="submit" value="LOGIN" name="btnin" />
                        <input type="submit" value="CANCEL" name="btnc" />
                        <input type="reset" value="RESET" name="btnr" />





                    </td>
                </tr>
            </table>

        </form>
    </body>
</html>
<%
    if (request.getParameter("btnin") != null) {
        try {
            String name = request.getParameter("txtname");
            String gender = request.getParameter("rdogroup");
            String email = request.getParameter("txtemail");
            String qualification = request.getParameter("qualification");
            String specialty = request.getParameter("specialty");
            String bloodgroup = request.getParameter("bloodgrp");
            String dob = request.getParameter("dob");
            String contact = request.getParameter("txtnumber");
            String username = request.getParameter("txtuid");
            String password = request.getParameter("txtpwd");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
            Statement stmt = conn.createStatement();
            int x = stmt.executeUpdate("insert into AV.DOCTOR values ('" + name + "','" + gender + "','" + email + "','" + qualification + "','" + dob + "','" + specialty + "','" + username + "','" + password + "','" + bloodgroup + "','" + contact + "')");
            if (x > 0) {
                response.sendRedirect("website.jsp");
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



