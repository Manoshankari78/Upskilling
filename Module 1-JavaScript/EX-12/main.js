function submitRegistration(userData){
    setTimeout(async()=>{
        try{
            const res=await fetch("https://jsonplaceholder.typicode.com/posts",{
                method: "POST",
                headers:{
                    "Content-Type":"application/json"
                },
                body: JSON.stringify(userData)
            });
            const data=await res.json();
            console.log("Registration Successful", data);
        }catch(error){
            console.error("Registration Failed",error);
        }
    },2000);
}
submitRegistration({
    name:"John",
    email:"john@gmail.com"
});