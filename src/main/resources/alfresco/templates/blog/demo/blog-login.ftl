<html>
   <head>
      <title>Blog Application Login</title>
   </head>
   <body>
      <form id="loginform" accept-charset="UTF-8" method="post" action="${url.context}/page/dologin">
         Username: <input type="text" id="username" name="username"/><br>
         Password: <input type="password" id="password" name="password"/><br>
         <input type="submit" id="btn-login" />
      </form>
   </body>
</html>