import React from "react";
import "./TimeTable.css";

const TimeTable = ({ data, person, onCourseClick }) => {
  // Extract time slots and days from the data
  const timeSlots = [...new Set(data.map((entry) => entry.time))];
  const days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"];

  return (
    <div className="timetable-container-timetable">
      <table className="timetable">
        <thead>
          <tr>
            <th>Time</th>
            {days.map((day) => (
              <th key={day}>{day}</th>
            ))}
          </tr>
        </thead>
        <tbody>
          {timeSlots.map((time) => (
            <tr key={time}>
              <td>{time}</td>
              {days.map((day) => {
                const course = data.find(
                  (entry) => entry.day === day && entry.time === time
                );
                return (
                  <td key={`${day}-${time}`} onClick={() => course && onCourseClick(course.course_id, course.courseName)}>
                    {course ? `${course.courseName}` : ""} <br /> {course ? `${course.specialization} (Room No:${course.room})` : ""}
                  </td>
                );
              })}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default TimeTable;