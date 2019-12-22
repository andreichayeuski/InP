<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
  <script type="text/javascript">
    let ws = null;

    function socketStart() {
      ws = new WebSocket(`ws://localhost:8081/${pageContext.request.contextPath}/web-socket`);
      ws.onmessage = (event) => {
        document.getElementById("web-socket-messages").innerHTML += '<div>' + event.data + '</div>';
      };
    }

    function socketClose() {
      ws.close();
    }
  </script>
</head>
<body>
<button onclick="socketStart()">Пуск</button>
<button onclick="socketClose();">Стоп</button>
<div id="web-socket-messages"></div>
</body>
</html>
