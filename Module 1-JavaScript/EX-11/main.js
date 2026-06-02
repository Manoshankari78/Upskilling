document.getElementById("registerForm")
.addEventListener("submit", function (event) {
    event.preventDefault();
    const name=this.elements["name"].value;
    const email=this.elements["email"].value;
    const selectedEvent=this.elements["event"].value;
    const errorDiv=document.getElementById("error");
    if(!name || !email){
        errorDiv.textContent="All fields are required";
        return;
    }
    errorDiv.textContent="";
    console.log(name, email, selectedEvent);
});