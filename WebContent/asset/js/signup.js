function regsisteraccount()
{
	alert("coming to check regsister deatils");
	var email=$("#email").val();
	var username=$("#username").val();
	var password=$("#password").val();
	var confirmpassord=$("#confirmpassword").val();
	alert("emnail address "+email+"::: username::::"+username+"::::: password:::: "+password+":::donfirm password::::; "+confirmpassord)
$.ajax({
	url:baseurl+"signup.htm",
	method:"POST",
	data:{email:email,username:username,password:password},
	sucess:function(data)
	{
		alert(data);
	}
});
	
}