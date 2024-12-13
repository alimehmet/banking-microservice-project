import axios from 'axios';

// Backend API bağlantısı için Axios instance oluşturuyoruz.
const api = axios.create({
  baseURL: 'http://localhost:8080/api', // Backend API URL'si
});

export default api;
