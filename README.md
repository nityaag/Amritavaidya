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

USER INTERFACE
![Screenshot (159)](https://github.com/user-attachments/assets/7371daa5-5bd6-40f0-9f56-3379aa4f2eae)

![image](https://github.com/user-attachments/assets/cbe407df-a3df-4685-99a4-c40441fbf9fe)
![image](https://github.com/user-attachments/assets/90ece63c-e352-4fe0-818d-002e3b4a7492)
![image](https://github.com/user-attachments/assets/1b6ab7fb-57cf-4fff-99c8-e0589b76d41e)
This is the main page of the website showing the major functions available to both doctor and patient, but with different working functions. In a session, while a doctor can see his appointments, a patient can book an appointment with his doctor. Medical archives show medical records of patients to both the doctor and the patient, with extra functionality of editing for the doctor. FaceTime provides video call functionality between the doctor and the patient. 

REGISTRATION AND LOGIN:

![image](https://github.com/user-attachments/assets/88e2740f-0214-4cc3-9723-1d639cfda8ec)
![image](https://github.com/user-attachments/assets/e073106e-7571-4159-b631-5ed1c03508d4)

![image](https://github.com/user-attachments/assets/9d7ad7af-4603-4740-97ef-f24bab750d7a)

![image](https://github.com/user-attachments/assets/0730bc2e-37d6-41a9-bdae-a3348efe4554)


DOCTOR:

![image](https://github.com/user-attachments/assets/acb79f18-e328-4df5-accc-a2ffdc8257cd)

![image](https://github.com/user-attachments/assets/0c6c157d-0dd9-4d74-a565-1381525642fc)
![image](https://github.com/user-attachments/assets/3266f2ab-16fd-4c48-ab34-43168581eac6)


PATIENT:

![image](https://github.com/user-attachments/assets/950c3d29-8cf1-43f7-be7a-19b7c91b881b)

![image](https://github.com/user-attachments/assets/ca4b0bb3-844a-49eb-97ba-6968aa95cecf)

![image](https://github.com/user-attachments/assets/4415f2a4-f3b9-4ce3-bfe2-1c96b8249720)
![image](https://github.com/user-attachments/assets/d661b03d-93ed-4aae-ba4b-778316c53b6c)

![image](https://github.com/user-attachments/assets/090bf784-09f0-40e5-8ece-f1a05caee2cd)



