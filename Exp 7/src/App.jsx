import './App.css';

export default function App() {
  const students = [
    {
      id: 1,
      name: "Rahul Sharma",
      course: "Computer Science",
      marks: 85
    },
    {
      id: 2,
      name: "Aishwarya Gupta",
      course: "Information Technology",
      marks: 92
    },
    {
      id: 3,
      name: "Roshni Anand",
      course: "Electronics",
      marks: 78
    }
  ];

  return (
    <div className="student-container">
      <h1 className="student-title">Student Information</h1>
      <div className="cards-wrapper">
        {students.map((student) => (
          <div key={student.id} className="student-card">
            <h2 className="student-name">{student.name}</h2>
            <p className="student-course">Course: {student.course}</p>
            <p className="student-marks">Marks: {student.marks}</p>
          </div>
        ))}
      </div>
    </div>
  );
}