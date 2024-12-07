<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
  <%@include file="mainnavbar.jsp" %>
    <h3 style="text-align: center;"><u>Event Registration</u></h3>
    <div class="form-container" align = "center">
        <form method="post" action="insertevent">
            <table>
            
             <tr>
                    <td><label for="eid">Enter ID</label></td>
                    <td><input type="number" id="eid" name="eid" required/></td>
                </tr>
               <tr>
                    <td><label for="ename">Enter Name</label></td>
                    <td><input type="text" id="ename" name="ename" required/></td>
                </tr>
               
                <tr>
                    <td><label for="elocation">Enter Location</label></td>
                    <td><input type="text" id="elocation" name="elocation" required/></td>
                </tr>
                
                <tr>
                    <td><label for="edate">Enter Date</label></td>
                    <td><input type="date" id="edate" name="edate" required/></td>
                </tr>
                <tr>
                    <td><label for="edescription">Enter Description</label></td>
                    <td><input type="text" id="edescription" name="edescription" required/></td>
                </tr>
                <tr>
                    <td><label for="eorganizer">Enter Organizer</label></td>
                    <td><input type="text" id="eorganizer" name="eorganizer" required/></td>
                </tr>
                <tr>
                    <td colspan="2" class="button-container">
                        <input type="submit" value="Register"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
