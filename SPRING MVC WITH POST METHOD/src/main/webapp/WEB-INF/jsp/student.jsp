<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
      <form method = "POST" action = "/SpringTutTest/addStudent" name="student" modelAttribute="student">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><input name = "studentName" /></td>
               <td>name</td>
            </tr>
            <tr>
               <td><form:label path = "id">ID</form:label></td>
                <td><input name = "studentId" /></td>
                <td>Student id</td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form>
   </body>
   
</html>