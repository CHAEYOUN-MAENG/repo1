<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	// window.onload = function(){}

	// var const let
	// let은 변수를 한번만 선언 가능, 값은 바꿀 수 있음 (재할당O)
	// const는 값을 바꿀수 없음, 값을 바꾸지 않으면 메모리를 위해서라도 const가 좋음 (재할당X)
	// var는 상관없음

	// 언제 클릭이 이뤄질지 모름(비동기)
	window.addEventListener("load", function() {
		const btn = document.querySelector("#btn")
		btn.addEventListener("click", function() {
			console.log("click!")

			const xhr = new XMLHttpRequest();

			// const url = "ajax";
			// const url = "ajax/string";
			// const url = "ajax/dto";
			// const url = "ajax/list";
			const url = "human/test1"
			const data = {
				"ename" : "이름",
				sal : 3000,
			}

			xhr.open("post", url);
			xhr.setRequestHeader("Content-Type", "application/json");

			const strData = JSON.stringify(data);

			console.log(data) // 객체 그 자체
			console.log('' + data) // 네트워크는 객체를 전달 할 수 없다
			console.log(strData) // 그래서 string으로 변경

			console.log(data, strData);

			xhr.send(strData)
			xhr.onload = function() {
				console.log(xhr.responseText)

				try {
					let result = JSON.parse(xhr.responseText)
					console.log(result)

					console.log(result.ename)
					console.log(result["ename"])
				} catch (e) {
					console.log("json아님")
				}

			}
		})
	})
</script>
</head>
<body>
	<button id="btn">ajax 실행</button>
</body>
</html>