<template>
  <div class="order-management">
    <h2>訂單管理</h2>
    <table class="table table-dark table-striped">
      <thead>
        <tr>
          <th>訂單ID</th>
          <th>客戶名稱</th>
          <th>訂單金額</th>
          <th>狀態</th>
          <th>操作</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="order in orders" :key="order.id">
          <td>{{ order.id }}</td>
          <td>{{ order.customerName }}</td>
          <td>{{ order.total }}</td>
          <td>{{ order.status }}</td>
          <td>
            <button class="btn btn-primary btn-sm" @click="updateStatus(order.id)">
              更新狀態
            </button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'OrderManagement',
  data() {
    return {
      orders: [
        { id: 'ORD001', customerName: 'John Doe', total: 577, status: '待處理' },
        { id: 'ORD002', customerName: 'Jane Smith', total: 588, status: '已完成' },
        { id: 'ORD003', customerName: 'Bob Johnson', total: 977, status: '配送中' },
      ]
    }
  },
  methods: {
    updateStatus(orderId) {
      // 這裡應該調用後端API來更新訂單狀態
      console.log(`更新訂單 ${orderId} 的狀態`);
    }
  }
}
</script>

<style scoped>
.table {
  color: #fff;
}
.table-dark {
  background-color: #222;
}
</style>