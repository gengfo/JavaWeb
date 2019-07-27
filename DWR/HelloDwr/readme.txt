https://www.cnblogs.com/sonwrain/articles/3660519.html


Reminders
1.need define context-root
e.g. HelloDwr

2.in web.xml to define the url-pattern related to context-root
e.g.
<url-pattern>/HelloDwr/*</url-pattern>

3.in client codes, e.g. jsp use same context-root for generated js
<script type= "text/javascript" src ="HelloDwr/util.js"></script>

