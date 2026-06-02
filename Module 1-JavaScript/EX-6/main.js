const Events=[];
Events.push({
    name:"Music Festival",
    category: "music"
});
Events.push({
    name:"Workshop on Baking",
    category: "workshop"
});
Events.push({
    name:"Rock Concert",
    category: "music"
});
const musicEvents=Events.filter(e=>e.category==="music")
console.log(musicEvents);
const cards=Events.map(e=>`Event card: ${e.name}`);
console.log(cards);