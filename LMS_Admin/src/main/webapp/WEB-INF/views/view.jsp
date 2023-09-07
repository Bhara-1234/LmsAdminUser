<%@ page language="java" import="com.model.LoanApplicant"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loan Applicant Form</title>

<!-- Include Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Custom CSS for styling -->
<style>
/* Add your custom CSS styles here */
body {
	background-color: #f4f4f4;
}

.container {
	margin-top: 30px;
}

h1 {
	text-align: center;
	margin-bottom: 30px;
}

/* Add more custom styles as needed */
</style>
</head>
<body>
	<center>
		<%
		LoanApplicant l = (LoanApplicant) request.getAttribute("applicant");
		%>
		<div class="container">
			<h1>Loan Applicant Form</h1>
			<form action="Editapplicant" method="post" id="form">
				<!-- Input fields for the loan applicant data -->
				<!-- Bootstrap form group classes for styling 
             <div class="form-group">
                <label for="custId">Customer ID:</label>
                <input type="text" class="form-control" name="id">
            </div> -->
				<div class="form-group">
					<label for="custId">Application ID:</label> <input type="text"
						class="form-control" name="Id" value="<%=l.getId()%>" readonly>
				</div>

				<div class="form-group">
					<label for="custId">Customer ID:</label> <input type="text"
						class="form-control" name="customerId"
						value="<%=l.getCustomerId()%>" readonly>
				</div>

				<div class="form-group">
					<label for="apDate">Application Date:</label> <input type="text"
						class="form-control" name="applicationDate"
						value="<%=l.getApplicationDate()%>" readonly>
				</div>

				<div class="form-group">
					<label for="lntyId">Loan Type ID:</label> <input type="text"
						class="form-control" name="loanTypeId"
						value="<%=l.getLoanTypeId()%>" readonly>
				</div>
				<div class="form-group">
					<label for="noy">No.of.Years:</label> <input type="text"
						class="form-control" name="noy" value="<%=l.getNoy()%>" readonly>
				</div>
				<div class="form-group">
					<label for="amount">Loan Amount:</label> <input type="text"
						class="form-control" name="loanAmount"
						value="<%=l.getLoanAmount()%>" readonly>
				</div>
				<div class="form-group">
					<label for="remarks">Conclusion Remarks:</label> <input type="text"
						class="form-control" name="remarks" value="<%=l.getRemarks()%>"
						readonly>
				</div>
				<div class="form-group">
					<label for="emiFrom">EMI Range From:</label> <input type="text"
						class="form-control" name="emiRangeFrom"
						value="<%=l.getEmiRangeFrom()%>" readonly>
				</div>

				<div class="form-group">
					<label for="emiTo">EMI Range To:</label> <input type="text"
						class="form-control" name="emiRangeTo"
						value="<%=l.getEmiRangeTo()%>" readonly>
				</div>

				<div class="form-group">
					<label for="nomRequested">Nominal Requested:</label> <input
						type="text" class="form-control" name="nominalRequested"
						value="<%=l.getNominalRequested()%>" readonly>
				</div>

				<div class="form-group">
					<label for="cibilScore">CIBIL Score:</label> <input type="text"
						class="form-control" name="cibilScore"
						value="<%=l.getCibilScore()%>" readonly>
				</div>

				<div class="form-group">
					<label for="status">Status:</label> <input type="text"
						class="form-control" name="status" value="<%=l.getStatus()%>"
						readonly>
				</div>



				<div class="form-group">
					<label for="processedUser">Processed User:</label> <input
						type="text" class="form-control" name="processedUser"
						value="<%=l.getProcessedUser()%>" readonly>
				</div>

				<div class="form-group">
					<label for="processedDate">Processed Date:</label> <input
						type="text" class="form-control" name="processedDate"
						value="<%=l.getProcessedDate()%>" readonly>
				</div>



			</form>
			<br>
			<button onclick="enableFields()" class="btn btn-primary">Edit</button>
		</div>
	</center>
	<script>
		function enableFields() {
			// Access the form by its id
			var form = document.getElementById("form");

			// Remove the 'readonly' attribute from input fields
			var inputFields = form.querySelectorAll("input[readonly]");
			for (var i = 0; i < inputFields.length; i++) {
				if (i == 4 || i == 11) {

					inputFields[i].removeAttribute("readonly");
				}
			}

			var btn = document.createElement("button");
			btn.textContent = "Save";
			form.appendChild(btn);

			// Remove the 'disabled' attribute from the "Edit" button
			var editButton = document.querySelector(".btn-primary");
			editButton.style.display = "none"; // Alternatively, you can use editButton.disabled = true; to disable it
		}
	</script>

	<!-- Include Bootstrap JS and jQuery (if needed) for Bootstrap functionality -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>