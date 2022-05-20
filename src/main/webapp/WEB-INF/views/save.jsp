<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 4:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/jquery.js"></script>
    <style>
        .container {
            max-width: 500px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 class="display-4 fw-normal">save.jsp</h2>
    <div class="py-5 text-center">

        <form action="/save" method="post">
            <input class="form-control mb-2" type="text"  onblur="duplicateCheck()" id="memberId" name="memberId" placeholder="아이디">
                <span id="dup-check-result"></span>
            <input class="form-control mb-2" type="text" name="memberPassword" placeholder="비밀번호">
            <input class="form-control mb-2" type="text" name="memberName" placeholder="이름">
            <input class="form-control mb-2" type="text" name="memberAge" placeholder="나이">
            <input class="form-control mb-2" type="text" name="memberPhone" placeholder="전화번호">
            <input class="btn btn-primary" type="submit" value="회원가입">
            <button>버튼tag가입</button>
            <input type="button" value="button타입">
        </form>
    </div>
</div>
</body>
<script>
    const duplicateCheck = () => {
      const memberId=document.getElementById("memberId").value;
      const checkResult=document.getElementById("dup-check-result");
        $.ajax({
           type:"post",//http request method
           url: "duplicate-check", //컨트롤 주소값
            data:{"memberId":memberId}, //전송하는 파라미터
            dataType:"text", //리턴받을 데이터 형식
            success:function (result){
               if(result == "ok"){
                   //사용가능한아이디
                  checkResult.innerHTML="사용가능합니다";
                  checkResult.style.color="green";
               }else{
                   // 이미 사용 중인 아이디
                   checkResult.innerHTML="이미사용중인아이디입니다.";
                   checkResult.style.color="red";
               }
               alert("ajax 성공");
            },
            error:function (){
              alert("오타체크");
            }
        });
    }
</script>
</html>
