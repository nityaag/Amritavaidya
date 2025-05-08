/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.json.JSONObject;
import java.io.StringReader;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfContentByte;

@WebServlet("/generate_pdf")
public class GeneratePDF extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=Consultation_Form.pdf");

        try {
            // Read JSON data from request
            StringBuilder jsonBuffer = new StringBuilder();
            String line;
            while ((line = request.getReader().readLine()) != null) {
                jsonBuffer.append(line);
            }
            JSONObject formData = new JSONObject(jsonBuffer.toString());

            // Create PDF
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            
            document.add(new Paragraph("Consultation Form"));
            document.add(new Paragraph("Full Name: " + formData.getString("prefix_name") + " " +
                                       formData.getString("first_name") + " " +
                                       formData.optString("middle_name", "") + " " +
                                       formData.getString("last_name")));
            document.add(new Paragraph("Birth Date: " + formData.getString("birthdate")));
            document.add(new Paragraph("Gender: " + formData.getString("gender")));
            document.add(new Paragraph("Address: " + formData.getString("address1") + ", " +
                                       formData.optString("address2", "") + ", " +
                                       formData.getString("city") + ", " +
                                       formData.getString("state_province") + " - " +
                                       formData.getString("zip")));
            document.add(new Paragraph("Phone: " + formData.optString("phone", "Not provided")));
            document.add(new Paragraph("Email: " + formData.getString("email")));
            document.add(new Paragraph("Occupation: " + formData.getString("occupation")));
            
            // Add medical history section
            document.add(new Paragraph("Main Complaints: " + formData.getString("complaints")));
            document.add(new Paragraph("Factors Affecting Symptoms: " + formData.getString("factors")));
            document.add(new Paragraph("Previous Illness History: " + formData.getString("illness_history")));
            document.add(new Paragraph("Surgical History: " + formData.getString("surgery")));
            document.add(new Paragraph("Family Medical History: " + formData.getString("family_history")));

            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
