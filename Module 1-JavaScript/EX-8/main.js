document.getElementById("rgtrBtn")
.addEventListener("click",()=>{
    alert("Registered Successfully");
});
document.getElementById("category")
.onChange=function(){
    console.log("Category changed");
};
document.getElementById("search")
.addEventListener("keydown",function(event){
    console.log("Searching:",event.target.value);
});