import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams, useLocation } from 'react-router-dom';
import './Students.css';

const Students = () => {
    const { courseId } = useParams();
    const location = useLocation();
    const { courseName } = location.state || {};
    const [students, setStudents] = useState([]);

    useEffect(() => {
        const fetchStudents = async () => {
            const token = localStorage.getItem('token');
            try {
                const response = await axios.get(`http://localhost:8080/api/v1/employees/courses/${courseId}/students`, {
                    headers: { Authorization: `Bearer ${token}` }
                });
                setStudents(response.data);
            } catch (error) {
                console.error('Error fetching students', error);
            }
        };

        fetchStudents();
    }, [courseId]);

    return (
        <div className="students-container">
            <h2 className="students-heading">Students Enrolled in {courseName}</h2>
            <table className="students-table">
                <thead>
                    <tr>
                        <th>Roll No.</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {students.map((student) => (
                        <tr key={student.studentId}>
                            <td>{student.rollNumber}</td>
                            <td>{student.firstName}</td>
                            <td>{student.lastName}</td>
                            <td>{student.email}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default Students;