import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import Timetable from './components/TimeTable';
import Students from './components/Students';
import ProtectedRoute from './components/ProtectedRoute';

const App = () => {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Login />} />
                <Route 
                    path="/timetable" 
                    element={
                        <ProtectedRoute>
                            <Timetable />
                         </ProtectedRoute>
                    } 
                />
                <Route 
                    path="/courses/:courseId/students" 
                    element={
                         <ProtectedRoute>
                            <Students />
                         </ProtectedRoute>
                    } 
                />
            </Routes>
        </Router>
    );
};

export default App;