require('dotenv').config();
const mongo = require('mongoose');

const connectDB = async () => {
    try {
        const conn = await mongo.connect(process.env.MONGO_URI);
        console.log(`MongoDB Connected: ${conn.connection.host}`);
    } catch (err) {
        console.error(err);
        process.exit(1);
    }
};
// connectDB().then(con => {
// }).catch((err) => {
// });
// connectDB().then(() => {
//     console.log('Database connection established');
// }).catch((err) => {
//     console.error('Database connection error:', err);
// });

module.exports = connectDB;