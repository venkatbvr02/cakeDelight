$(document).ready(function() {
	alert("coming to load page");
	getcartCount();

});
function getcartCount() {
	alert("check status of row cpount");
	$.ajax({
		url:baseurl+"mycart.htm",
		method:"POST",
		accpet: "text/html",
		//data:{productname:productname,productdesc:productdesc},
		success:function(data){
			alert(data);
			$("#cartnumber").html(data);
			
			
		}
	});
}