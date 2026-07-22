// greet();
function greet() {
    console.log("Good morning")
}

// greet();
// function start(func) {
//     func();
// }

// [1,2,3].forEach()

// start(greet);

// console.log(a);
// var a = 5;

// const c = setTimeout(() => {
//     console.log('hey aaryan')
// }, 1000);
// clearTimeout(c);
// let count = 0;
// let d = setInterval(() => {
//     console.log('hey aaryan 2')
//     count++;
//     if(count > 5) {
//         clearInterval(d);
//     }
// }, 1000);
// clearInterval(d);
// console.log('hey aaryan 2')


// function getData() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             if(1 != 1) {
//                 resolve("data received");
//             } else {
//                 reject("data rejected");
//             }
//         }, 1000);
//     });
// }

// getData().then(data => console.log(data)).catch(err => console.log(err));


fetch("https://jsonplaceholder.typicode.com/todos")
    .then(res => res.json())
    .then(data => data.filter(d => d.completed == true))
    .then(data => console.log(data.reduce((acc, curr) => acc + curr.id, 0)))
    .catch(err => console.log(err));