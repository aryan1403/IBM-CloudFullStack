require('dotenv').config()
const express = require('express')
const connectDB = require('./db')
const app = express()
const port = process.env.PORT

app.get('/', async (req, res) => {
    const con = await connectDB();
});
app.listen(port, () => console.log(`Example app listening on port ${port}!`))