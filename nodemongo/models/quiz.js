const mongoose = require('mongoose');

// const questionSchema = new mongoose.Schema({
//   questionText: { type: String, required: true },
//   options: [{ type: String, required: true }],
//   correctOptionIndex: { type: Number, required: true },
//   timeLimitSeconds: { type: Number, default: 30 }
// });

const quizSchema = new mongoose.Schema({
  title: { type: String, required: true },
  description: { type: String },
  //   questions: [questionSchema],
  createdAt: { type: Date, default: Date.now }
});

const Quiz = mongoose.model('Quiz', quizSchema);

module.exports = { Quiz };