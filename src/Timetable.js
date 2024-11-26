import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import TimeTable from './ShowTimeTable'; // Correct the import path
import Header from './Header'; // Import the Header component

const Timetable = () => {
    const [timetable, setTimetable] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
        const fetchTimetable = async () => {
            const token = localStorage.getItem('token');
            try {
                const response = await axios.get('http://localhost:8080/api/v1/employees/timetable', {
                    headers: { 
                        'Authorization': `Bearer ${token}`,
                        'Content-Type': 'application/json'
                    },
                    withCredentials: true
                });
                response.data.sort((a, b) => a.time.localeCompare(b.time));
                setTimetable(response.data);
            } catch (error) {
                console.error('Error fetching timetable', error);
                if (error.response?.status === 401) {
                    navigate('/'); // Redirect to login if unauthorized
                }
            }
        };

        fetchTimetable();
    }, [navigate]);

    const handleCourseClick = (courseId, courseName) => {
        navigate(`/courses/${courseId}/students`, { state: { courseName } });
    };

    return (
        <div>
            <Header />
            <h1 style={{ textAlign: 'center', marginTop: '20px' }}>Timetable</h1>
            <TimeTable data={timetable} person="Faculty" onCourseClick={handleCourseClick} />
        </div>
    );
};

export default Timetable;