function register() {
	window.location.href = "adminRegister.html";
}
function login() {
	$.ajax({
		url : "adminLoginAction.do",
		data : {
			email : $("#inputEmail").val(),
			password : $("#inputPassword").val()
		},
		success : function(json) {
			var data = json.statue;
			if (data == "success") {
				window.location.href = "word_list.jsp";
				alert("登录成功");
			} else {
				alert("用户名或密码错误");
			}
		}
	});
}