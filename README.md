# Amritavaidya
Patient-Doctor Interaction platform with ease of use and handling data.

Amritavaidya is a digital healthcare platform designed to modernise patient-doctor interactions by enabling real-time consultations, secure medical record management and efficient appointment scheduling.
The system empowers patients with the ability to consult doctors remotely via real-time video communication, reducing geographical and logistical barriers. It provides a centralised repository for medical histories, prescriptions while ensuring seamless access to critical health information. Doctors benefit from efficient appointment scheduling, robust medical record management, and the capacity to issue digital prescriptions.
Administrators ensure platform integrity through user verification, data security enforcement and technical maintenance. The platform's multi-role architecture for patients, doctors and administrators ensures an intuitive, secure and scalable solution for all stakeholders.
Amritavaidya offers a smart, user-friendly solution that enhances healthcare  and supports a more connected, smarter, accessible healthcare system.


✨ Features

•	**Patient-Doctor Interaction** via VIDEOCALL
•	**Online Consultations** (Request and Management)
•	**Medical Records** Viewing and Updating
•	**Digital Prescriptions**
•	**Appointment Tracking**
•	**Role-based Access**: Guest, Registered Users (Patients & Doctors), and Admin
•	**Secure Login, Signup, Forgot Password**
•	**Admin Panel** to Manage System Users and Records


🧱 Tech Stack

| Layer        | Technology Used                          |
|--------------|------------------------------------------|
| **Frontend** | HTML, CSS, JavaScript, JSP               |
| **Backend**  | Java Servlets & JSP (NetBeans 8.0.2 IDE) |
| **Database** | Apache Derby (JavaDB)                    |
| **Server**   | Apache Tomcat 8                          |
| **Protocol** | HTTP, TCP/IP                             |

🧑‍💻 Developer Machine
•	OS: Windows 10/11
•	IDE: NetBeans 8.0.2
•	Java: JDK 8 or above
•	Browser: Google Chrome (latest version)
•	Server: Apache Tomcat 8.0.27
•	RAM: Minimum 4 GB

🧑‍⚕️ Client Machine
•	OS: Windows/Linux/Mac
•	Browser: Java-enabled browser
•	RAM: Minimum 2 GB
•	Internet: Required for chat and communication features


🛠️ Installation & Setup
✅ NetBeans IDE
    -Download NetBeans IDE (preferably version 8.0.2) from the official website: https://netbeans.apache.org/

    -Install NetBeans with Java SE and Java EE support.

    -Launch NetBeans and configure your Java Development Kit (JDK) if not already set.

✅ Apache Derby Database
  -Derby is bundled with NetBeans 8.0.2, no separate installation needed.

  -To start Derby:

  -Go to Services tab in NetBeans.

  -Expand Databases > Right-click Java DB > Click Start Server.

  -To create a new database:

  -Right-click on Java DB > Create Database > Enter DB name, username, password.

✅ Apache Tomcat Server
    -Download Apache Tomcat (preferably version 8.5 or 9) from: https://tomcat.apache.org/
    -Extract the zip file to a preferred location.
    
  In NetBeans:

  -Go to Tools > Servers > Add Server.

  -Select Apache Tomcat > Click Next.

  -Browse and select the folder where Tomcat is extracted.

  -Set the username and password for the admin (optional).

  -Start the server from Services tab or while running a web project.

1. Clone the Repository
git clone https://github.com/your-username/amritavaidya.git
cd amritavaidya

2. Open in NetBeans 8.0.2
•	Go to **File → Open Project**
•	Choose the downloaded project folder

3. Configure Derby Database
•	Start the **Java DB (Derby)** server in NetBeans
•	Create necessary tables as per the schema (from SDS → Database Design)
•	Import initial SQL dump if available

4. Run the Project
•	Right-click on the project → **Run**
•	Ensure Apache Tomcat is set as the server
•	The app launches in your browser at `http://localhost:8080/amritavaidya/`


🗂️ Key Modules

•	**Guest**
  - View Home, About, FAQs
  - Signup/Login
•	**Patient**
  - Request Consultations
  - View Prescriptions & Medical History
  - Chat with Doctor
•	**Doctor**
  - Manage Requests
  - Provide Diagnosis & Prescription
  - View Patient History
•	**Admin**
  - Manage Users & Records
  - Send Emergency Notifications


🛡️ Security & Privacy

•	**Role-Based Access Control** (Guest, Registered User, Admin)
•	**Password Recovery** with Security Questions
•	**Emergency Guardian Notification System**
•	**Encrypted Session Management** (to be added in deployment)


🔍 Testing Summary

•	✅ Unit Testing (Java Classes & Functions)
•	✅ Integration Testing (JSP-Servlet-DB interactions)
•	✅ System Testing (End-to-End Workflow)
•	✅ Stress Testing (Heavy simultaneous requests)
•	✅ Acceptance Testing (User-level feedback)
•	✅ Staging Tests (Pre-deployment simulation)


📊 Database Tables Overview

| Table             | Description                    |
|------------------|---------------------------------|
| PATIENT          | Stores patient information      |
| DOCTOR           | Stores doctor details           |
| MEDICAL_RECORD   | Medical history & prescriptions |
| CONSULTS         | Consultation sessions           |
| FEEDBACK         | User ratings & messages         |
| BILLING          | Billing info for consultations  |
| LOGIN_DETAILS    | Username, password, role        |

