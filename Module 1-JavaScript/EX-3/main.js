const events=[
    {name:"Music festival",seats:50,isPast:false},
    {name:"Coding Workshop",seats:0,isPast:false},
    {name:"Art Expo",seats:20,isPast:true}
];
events.forEach(e=>{
    if(!e.isPast && e.seats>0){
        console.log(`${e.name} is available`);
    }else{
        console.log(`${e.name} is unavailable`);
    }
});
function register(e){
    try{
        if(e.seats<=0) throw new Error("No seats available");
        e.seats--;
        console.log("Registration Successful");
    }catch(error){
        console.error(error.message);
    }
}
register(events[1]);
