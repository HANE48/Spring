<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	const send1 = (f) =>{
		let name = f.name.value;
		let tel = f.tel.value;
		let age = f.age.value;
		
		if(!name.trim()){
			alert("이름을 입력하세요");
			return ;
		}
		
		if(age === ''){
			alert("나이를 입력하세요");
			return;
		}
		
		if(tel === ''){
			alert("전화번호를 입력하세요");
			return;
		}
		
		f.action="insert1.do";
		f.submit();
		
	}//send1

	const send2 = (f) => {
		f.action = "insert2.do";
		f.method = "post";
		f.submit();
	}
</script>
</head>
<body>
	<form>
		<table border="1" align="center">
			<caption>개인정보 입력</caption>
			<tr>
				<th>이름</th>
				<td><input name="name" />
			</tr>
			<tr>
				<th>나이</th>
				<td><input name="age" type="number" />
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input name="tel"/>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="낱개로 받기" onClick="send1(this.form)"/>
					<input type="button" value="객체로 받기" onClick="send2(this.form)"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>