import axios from 'axios';

export default axios.create({
    baseURL: `http://localhost:8080` // base address for API endpoint client calling
});