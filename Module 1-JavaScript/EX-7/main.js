const container=document.querySelector("#eventContainer");
const events=[
    {name: "Music Festival"},
    {name: "Coding Workshop"}
];
events.forEach(e=>{
    const card=document.createElement("div");
    card.textContent=e.name;
    container.appendChild(card);
});
function updateUI(message){
    const p=document.createElement("p");
    p.textContent=message;
    container.appendChild(p);
}
updateUI("User Registered");