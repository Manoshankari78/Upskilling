const events=[];
function addEvent(name,category){
    events.push({name,category});
}
function register(eventName){
    console.log(`Successfully registered  for ${eventName}`);
}
function filterEventsByCategory(category){
    return events.filter(e=> e.category===category);
}
function registrationTracker(){
    let count=0;
    return function(){
        count++;
        return count;
    };
}
const musicRegisteration=registrationTracker();
console.log(musicRegisteration());
console.log(musicRegisteration());
function searchEvents(callback){
    return callback(events);
}
addEvent("Music Night","Music");
addEvent("Star Evening","Music");
const res=searchEvents(events=> events.filter(e=>e.category==="Music"));
console.log(res);