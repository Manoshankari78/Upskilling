function Event(name,date,seats){
    this.name=name;
    this.date=date;
    this.seats=seats;
}
Event.prototype.checkAvailability=function(){
    return this.seats>0;
}
const e1=new Event("Music Festival","2026-06=15",50);
console.log(e1.checkAvailability());
Object.entries(e1).forEach(([key,value])=>{
    console.log(`${key}: ${value}`)
});