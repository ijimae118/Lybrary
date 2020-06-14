// khai bao mang chua ten cac hinh anh trong thu muc images cua website
var hinh=[
    "images/4.png",
    "images/5.png",
    "images/6.png",
    "images/7.png",
    "images/8.png",
    "images/9.png",
];
// lap trinh cho su kien load trang web 

window.onload=function(){
      document.write("<h2> Galary <\h2>");
      document.write("<hr>");

      document.write("<img src='images/4.png'><br>");
      document.write("<img src='"+"images/4.png"+"'><br>");
     for(var i in hinh){
      document.write("<img class='hinh' src='"+hinh[i]+"'><br><br>");
    }
    //do dùng windown nó làm mất cái khung border ,nó chỉ chỉnh sua font padding v.v nên phải để css vao js 
    document.write(" <link rel='stylesheet' href='css/d08_array.css'> ")
}