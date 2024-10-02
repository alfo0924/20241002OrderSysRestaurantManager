// frontend/src/services/menuService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/menus';

export default {
    getAllMenus() {
        return axios.get(API_URL);
    },
    getMenu(id) {
        return axios.get(`${API_URL}/${id}`);
    },
    createMenu(menu) {
        return axios.post(API_URL, menu);
    },
    updateMenu(id, menu) {
        return axios.put(`${API_URL}/${id}`, menu);
    },
    deleteMenu(id) {
        return axios.delete(`${API_URL}/${id}`);
    }
};