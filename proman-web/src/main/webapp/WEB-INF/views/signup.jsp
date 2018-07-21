<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="content">
<form:form method="POST"
          action="addUser" class="signupform" modelAttribute="user">
		<table>
			<tr>
				<td><form:input type="text" placeholder="Username*" name="username" path="username"/></td>
			</tr>
			<tr>
				<td><form:input type="password" placeholder="Password*" path="password"/></td>
			</tr>
			<tr>
				<td><form:input type="password" placeholder="retype password*" path="retypedpassword"/></td>
			</tr>
			<tr>
				<!-- <td><a href="signin">create account</a></td> -->
				<td><input type="submit" value="create account"/></td>
			</tr>
		</table>
	</form:form>
</div>
