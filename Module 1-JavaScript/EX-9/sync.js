async function loadEvents(){
    const spinner=document.getElementById("spinner");
    spinner.style.display="block";
    try{
        const response=await fetch("events.json");
        const data=await response.json();
        console.log(data);
    }
    catch(error){
        console.error(error);
    }
    finally{
        spinner.style.display="none";
    }
}
loadEvents();