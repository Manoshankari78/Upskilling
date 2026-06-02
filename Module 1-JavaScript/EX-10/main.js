function createEvent(
    name="Unknown Event",
    category="General"
){
    return {name,category};
}
const event={
    name: "Music Festival",
    date: "2026-07-15",
    category: "Music"
};
const{name,date}=event;
console.log(name);
console.log(date);
const events=[
  { "name": "Music Festival" },
  { "name": "Coding Workshop" },
  { "name": "Workshop on Baking" },
  { "name": "Happening Street" }
];
const clone=[...events];
console.log(clone);
