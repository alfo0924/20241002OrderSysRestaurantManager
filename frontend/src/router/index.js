import { createRouter, createWebHistory } from 'vue-router'
import MenuManagement from '../views/MenuManagement.vue'
import OrderManagement from '../views/OrderManagement.vue'
import InventoryManagement from '../views/InventoryManagement.vue'
import EmployeeManagement from '../views/EmployeeManagement.vue'
import FinancialReports from '../views/FinancialReports.vue'

const routes = [
    {
        path: '/menu',
        name: 'MenuManagement',
        component: MenuManagement
    },
    {
        path: '/orders',
        name: 'OrderManagement',
        component: OrderManagement
    },
    {
        path: '/inventory',
        name: 'InventoryManagement',
        component: InventoryManagement
    },
    {
        path: '/employees',
        name: 'EmployeeManagement',
        component: EmployeeManagement
    },
    {
        path: '/finance',
        name: 'FinancialReports',
        component: FinancialReports
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router