$(document).ready(function() {
	$("#notifications-bar").hide();
});

function addtocart(productname,productdesc) {
	//var productname=$("#productname").val();
	//alert("productname is:::: "+productname+"::: product desc::: "+productdesc);
	
	$.ajax({
		url:baseurl+"addtocart.htm",
		method:"POST",
		data:{productname:productname,productdesc:productdesc},
		success:function(data){
			alert(data);
			
			
		}
	});

}