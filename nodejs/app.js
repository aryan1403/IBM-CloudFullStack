const os = require('os');
const fs = require('fs');
const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');


// console.log(os.arch(), os.freemem(), os.homedir(), os.hostname(), os.uptime());
async function getHTMLFileSync(filename) {
    return await fs.readFile('../html css js/'.concat(filename), (err, data) => {
        if(err) {
            console.log(err);
        } else {
            console.log(data.toString());
            return data.toString();
        }
    });
}

// fs.writeFile('names.txt', 'Hello World', (err) => {
//     if(err) {
//         console.log(err);
//     } else {
//         console.log('File written successfully');
//     }
// });

// const myServer = http.createServer(async (req, res) => {
//     if(req.url === '/start') { 
//         res.writeHead(200, {'Content-Type': 'text/html'});
//         res.end(await getHTMLFileSync('index.html'));
//     } if(req.url === '/login') {
//         res.writeHead(200, {'Content-Type': 'text/html'});
//         res.end(await getHTMLFileSync('login.html'));
//     }
// });

// myServer.listen(8000, () => console.log('Server started'));

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.json());

app.get('/login', async (req, res) => {
    await res.sendFile(path.join('../html css js/login.html'));
});

app.get('/home', (req, res) => {
    res.json({
        name: 'Aaryan',
        role: 'Trainer'
    });
});

app.post('/login', (req, res) => {
    const email = req.body.email;
    const pass = req.body.pass;

    if(email === 'aaryan@example.com' && pass === 'password') {
        res.json({
            name: 'Aaryan',
            role: 'Trainer',
            msg: 'Successfully logged in'
        });
    } else {
        res.status(401).json({
            error: 'Invalid credentials'
        });
    }

    // console.log(email, pass);
});

app.listen(8000, () => console.log('Application started'))