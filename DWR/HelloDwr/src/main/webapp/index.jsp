<%@page pageEncoding="utf-8"%>
<html>  
<head>
 <SCRIPT type="text/javascript" src="js/jquery-1.4.2.js"></SCRIPT>
    <script type= "text/javascript" src ="HelloDwr/util.js"></script>
    <script type="text/javascript" src= "HelloDwr/engine.js"></script >
    <script type="text/javascript" src= "HelloDwr/interface/messagePush.js" ></script>
    
    <SCRIPT type="text/javascript">
      $(function(){ 
        $('#btn').click(function(){
        var txt = $('#txt').val();
        messagePush.send(txt);
        });
      }); 
    </SCRIPT>
  </head>
  <body>
   <table>
    <tr><Td><input type="text" id="txt" /></Td></tr>
   <tr><td><input type="button" value="Click" id="btn" /></td></tr>
   </table>
  </body>
</html>