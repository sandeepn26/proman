<div class="content">
	<form action="#" class="appform">
		<p>Personal Information</p>

		<table>
			<tr>
				<td><label for="first_name">Firstname</label> <br /> <input
					type="text" id="first_name" /></td>
				<td><label for="last_name">Lastname</label> <br /> <input
					type="text" id="last_name" /></td>
			</tr>
			<tr>
				<td><label for="street_address">Street Address</label> <br />
					<input type="text" id="street_address" /></td>
				<td><label for="city">City</label> <br /> <input type="text"
					id="city" /></td>
			</tr>

			<tr>
				<td><label for="state">State</label> <label
					style="margin-left: 100px;">Zip</label> <br /> <input type="text"
					id="state" maxlength="2" style="width: 25%;" /> <input type="text"
					maxlength="5" id="zip" style="width: 25%;" />-<input type="text"
					maxlength="4" id="county" style="width: 25%;" /></td>
				<td><label for="country">Country</label> <br /> <input
					type="text" id="country" /></td>
			</tr>

			<tr>
				<td><label for="dob">Date of Birth</label> <br />
					<div class="dob_container">
						<select class="bear-dates"></select> 
						<select class="bear-months"></select>
						<select class="bear-years"></select>
					</div></td>
				<td></td>
			</tr>

			<tr>
				<td><label for="email">Email</label> <br /> <input
					type="email" name="email" id="email"></td>
				<td><label for="phone">Phone</label> <br /> <input type="tel"
					name="phone" id="phone"></td>
			</tr>

			<tr>
				<td><a style="width: 300px;" href="signin">Cancel</a></td>
				<td><input style="width: 300px; float: right;" type="submit"
					value="Submit"></td>
			</tr>

		</table>
	</form>

</div>

<script src="/proman/resources/js/calender.js" type="text/javascript"></script>
<script type="text/javascript">
	dates('option');
	months('option');
	//You can change the startYear(1990) and endYear(2017)
	years('option', 2000, 2017);
</script>