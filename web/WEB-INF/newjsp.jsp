<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // Check if the user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        // If not logged in, redirect to login page with a message
        response.sendRedirect("login1.jsp?message=Please login to access this feature.");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consult with a Doctor</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }

       .header {
           
             background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);
             padding: 15px;
             display: flex;
             justify-content: space-between;
             align-items: center;
              border-radius: 15px;
             box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
             }

           .profile-container {
            display: flex;
            align-items: center;
            margin-left: 10px;
            cursor: pointer;
            position: relative;
        }
        .profile-pic {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            object-fit: cover;
            border: 2px solid #0077b6;
        }
        .dropdown-profile-container {
            display: none;
            position: absolute;
            top: 110px;
            left: -100%;
            transform: translateX(-50%);
            background: white;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
            padding: 10px;
            z-index: 1000;
            width: 280px;
            max-height: 300px;
            overflow-y: auto;
        }
        .dropdown-profile-container .images-grid {
            display: grid;
            grid-template-columns: repeat(8, 1fr);
            gap: 8px;
            padding: 5px;
        }
        .dropdown-profile-container img {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            cursor: pointer;
            transition: transform 0.2s;
        }
        .dropdown-profile-container img:hover {
            transform: scale(1.1);
        }
        .header img {
            height: 100px;
            width: 100px;
        }
        .menu {
            display: flex;
            gap: 35px;
            position: relative;
            background-color: white;
            padding: 20px 30px;
            border-radius: 20px;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
           
            font-weight: bold;
        }
        .menu a {
            text-decoration:none;
            color: black;
            font-weight: bold;
            position: relative;
             font-size: 20px;
        }
        .menu-item {
            position: relative;
           font-size: 20px;
        }
        .dropdown {
            position: absolute;
            top: 100%;
            left: 0;
            display: none;
              background: #4db6ac;
            border: 1px solid #ddd;
            box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
            border-radius: 5px;
            z-index: 1000;
            min-width: 250px;
            overflow: hidden;
            transform: translateY(10px);
            transition: opacity 0.3s ease, transform 0.3s ease;
   
   
        }
        .dropdown a {
            display: block;
    padding: 12px 20px;
    text-decoration: none;
    color: #333;
    font-weight: bold;
    background: white;
    border-radius: 8px;
    margin: 5px 10px;
    transition: background 0.3s ease, transform 0.2s ease;
        }
       
        .dropdown a:hover {
            background-color: #b2dfdb;
    transform: scale(1.05);
        }
       
        .dropdown.show {
          display: block;
          opacity: 1;
          transform: translateY(0);
}
        .menu-item:hover .dropdown {
            display: block;
            opacity: 1;
            transform: translateY(0);
        }
        .menu-item:last-child .dropdown {
            left: auto;
            right: 0;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .form-section {
            flex: 1;
            padding-right: 20px;
        }

        .form-section h2 {
            font-size: 24px;
            margin-bottom: 20px;
            color: #333;
        }

        .form-section label {
            display: block;
            margin-bottom: 8px;
            font-size: 14px;
            color: #555;
        }

        .form-section input {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 14px;
        }

        .form-section button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        .form-section button:disabled {
            background-color: #ddd;
            cursor: not-allowed;
        }

        .form-section .close-button {
            background-color: #ff4d4d;
            margin-left: 10px;
        }

        .image-section {
            flex: 0.4;
            text-align: center;
        }

        .image-section img {
            max-width: 100%;
            border-radius: 8px;
        }
    </style>
</head>
<body>
     <div class="header">
        <img src="images/LOGO.png" alt="AmritaVaidya Logo">
        <div class="menu">
            <div class="menu-item">
                <a href="#">Login</a>
                <div class="dropdown">
                    <a href="login1.jsp">Are you a Patient?</a>
                    <a href="login1.jsp">Are you a Doctor?</a>
                </div>
            </div>
            <a href="started.jsp">Home</a>
            <a href="#about">About Us</a>
            <a href="faq.jsp">FAQs</a>
            <a href="#help">Help</a>
            <a href="#contact">Contact Us</a>
           
            <div class="menu-item">
                <a href="#">Profile</a>
                <div class="dropdown">
                    <a href="profile.jsp">My Profile</a>
                    <a href="appointments.jsp">Appointments</a>
                    <a href="logout.jsp">Sign Out</a>
                    <a href="cancelappointment.jsp">Cancel Appointment</a>
                </div>
            </div>
            </div>
         <div class="profile-container">
        <img src="images/pp1.jpg" alt="Profile Picture" class="profile-pic" onclick="toggleDropdown()">
        <div class="dropdown-profile-container" id="dropdown">
            <img src="images/pp1.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp2.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp3.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp4.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp5.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp6.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp7.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp8.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp9.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp10.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp11.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp12.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp13.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp14.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp15.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp16.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp17.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp18.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp19.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp20.jpg" onclick="changeProfilePic(this.src)">
            <img src="images/pp21.jpg" onclick="changeProfilePic(this.src)">
           
        </div>
       
    </div>
       
    </div>
    <div class="container">
        <div class="form-section">
            <h2>Consult with a Doctor</h2>
            <form id="consultForm">
                <label for="symptom">Tell us your symptom or health problem</label>
                <input type="text" id="symptom" name="symptom" placeholder="e.g., fever, headache" minlength="4" required>

                <label for="email">Email</label>
                <input type="email" id="email" name="email" value="<%= session.getAttribute("email") %>" readonly>

                <button type="submit" id="submitButton">Continue</button>
                <button type="button" class="close-button" onclick="closeForm()">Close</button>
            </form>
        </div>
        <div class="image-section">
            <img src="images/doctor.jpg" alt="Verified Doctors">
        </div>
    </div>

    <script>
        document.getElementById('consultForm').addEventListener('submit', function(event) {
            event.preventDefault();
            const symptom = document.getElementById('symptom').value;
            const email = document.getElementById('email').value;

            if (symptom.length >= 4 && email.includes("@")) {
                window.open("https://meet.google.com/new", "_blank");
            } else {
                alert('Please fill out the form correctly.');
            }
        });

        function closeForm() {
            if (confirm('Are you sure you want to close the form?')) {
                window.location.href = 'web.jsp';
            }
        }
    </script>
   
</body>

</html>