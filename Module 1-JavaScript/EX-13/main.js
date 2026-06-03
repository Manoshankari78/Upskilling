function submit(data){
    console.log("Step 1: Form Submitted");
    debugger;
    console.log("Step 2: Data Received");
    console.log(data);
    fetch("https://jsonplaceholder.typicode.com/posts",{
        method: "POST",
        headers:{
            "Content-Type":"application/json"
        },
        body: JSON.stringify(data)
     }).then(res=>res.json())
     .then(result=>{
        console.log("Step 3: Success");
        console.log(result);
     })
     .catch(error=>{
        console.error("Error:",error);
     });
 }