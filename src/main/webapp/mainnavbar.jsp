<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot</title>
     <style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Body styles */
body {
    font-family: 'Arial', sans-serif;
    background-color: #f4f4f4;
    color: #333;
    line-height: 1.6;
}

/* Centered heading */
h2 {
    text-align: center;
    margin: 20px 0;
    color: #35424a;
}

/* Navbar styles */
.navbar {
    background-color: #C4E1F6;
    overflow: hidden;
    display: flex;
    justify-content: center;
    padding: 3px 0;
}

/* Navbar links */
.navbar a {
    color: #798645;
    text-decoration: none;
    padding: 10px 20px;
    transition: background 0.3s, color 0.3s;
}

/* Navbar link hover effect */
.navbar a:hover {
    background-color: #433878;
    color: #ffffff;
}

/* Responsive design for smaller screens */
@media (max-width: 600px) {
    .navbar {
        flex-direction: column;
    }
    .navbar a {
        padding: 10px;
        text-align: center;
    }
}
     
     </style>
</head>
<body>
    <h2 align="center">Spring Boot MVC SDP Project</h2>
    <div class="navbar">
         <a href="/">Home</a>
        <a href="eventreg.jsp">Event Registration</a>
       
        <a href="viewallevents">View All Events</a>
    </div>
</body>
</html>