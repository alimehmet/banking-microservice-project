import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import UserList from './components/UserList';
import AddUser from './components/AddUser';

const App = () => {
  return (
    <Router>
      <div>
        <h1>Microservice Frontend</h1>
        {/* Navigasyon için Link bileşenlerini ekleyin */}
        <nav>
          <ul>
            <li>
              <Link to="/">User List</Link>
            </li>
            <li>
              <Link to="/add-user">Add User</Link>
            </li>
          </ul>
        </nav>
        {/* Sayfa içeriği */}
        <Routes>
          <Route path="/" element={<UserList />} />
          <Route path="/add-user" element={<AddUser />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;
