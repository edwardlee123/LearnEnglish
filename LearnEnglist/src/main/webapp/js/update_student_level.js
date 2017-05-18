function register(){
	if(confirm("确认修改么?")){
		$.ajax({
			url : "student/updateStudentGroupAction.do",
			data : {
				wordType : $("#wordType").val(),
			},
			success : function(json) {
				var data = json.statue;
				if (data == "success") {
					window.location.href = "student_word_list.jsp";
					alert("修改成功");
				} else {
					alert("修改失败");
				}
			}
		});
	}
}