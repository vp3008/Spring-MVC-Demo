<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

	<title>Customer Confirmation Page</title>

</head>

<body>

Customer name is : ${customer.firstName} ${customer.lastName}

<br><br>

Free Passes:: ${customer.freePasses}

<br><br>

Postal code:: ${customer.postalCode}

<br><br>

Course Code:: ${customer.courseCode}

<br><br>


</body>


</html>