/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*let mainNav=document.getElementById("js-menu");
let navBarToggle=document.getElementById("js-navbar-toggle");
navBarToggle.addEventListener("click",function(){
    mainNav.classList.toggle("active");
});

$(function(){
    $(".nav-toggle").on("click",
    function(){
        if
        ($(".nav-links").hasClass("active")){
            $(".nav-links").removeClass("active");
            $(this).find("a").html( <i class="fa fa-plus-circle"></i>);}
            else{
              $(".nav-links").addClass("active"); 
              $(this).find("a").html( <i class="fa fa-plus-circle"></i>);
            }
        });
        
    });*/
//function to toggle the bar
function geeksforgeeks(){
    var x=document.getElementById("js-menu");
    if(x.style.display==="block"){
        x.style.display="none";
    }else{
        x.style.display="block";
    }
}
//function to toggle minus
function myFunction(x){
    x.classList.toggle("fa-minus-circle");
}