import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './Login';
import Timetable from './Timetable';
import Students from './Students';
import ProtectedRoute from './ProtectedRoute';
import NotFound from './NotFound';

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
                <Route path="*" element={<NotFound />} />
            </Routes>
        </Router>
    );
};

export default App;