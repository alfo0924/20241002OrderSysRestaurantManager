<template>
  <div class="menu-management">
    <h2>菜單管理</h2>
    <div class="row">
      <div class="col-md-6">
        <h3>菜單列表</h3>
        <ul class="list-group">
          <li v-for="item in menuItems" :key="item.id" class="list-group-item d-flex justify-content-between align-items-center">
            {{ item.name }}
            <span class="badge bg-primary rounded-pill">{{ item.price }}</span>
          </li>
        </ul>
      </div>
      <div class="col-md-6">
        <h3>新增菜品</h3>
        <form @submit.prevent="addMenuItem">
          <div class="mb-3">
            <label for="itemName" class="form-label">菜品名稱</label>
            <input type="text" class="form-control" id="itemName" v-model="newItem.name" required>
          </div>
          <div class="mb-3">
            <label for="itemPrice" class="form-label">價格</label>
            <input type="number" class="form-control" id="itemPrice" v-model="newItem.price" required>
          </div>
          <button type="submit" class="btn btn-primary">新增</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MenuManagement',
  data() {
    return {
      menuItems: [
        { id: 1, name: '炸雞套餐', price: 199 },
        { id: 2, name: '漢堡套餐', price: 179 },
        { id: 3, name: '義大利麵', price: 229 },
      ],
      newItem: {
        name: '',
        price: null
      }
    }
  },
  methods: {
    addMenuItem() {
      this.menuItems.push({
        id: this.menuItems.length + 1,
        ...this.newItem
      });
      this.newItem = { name: '', price: null };
    }
  }
}
</script>

<style scoped>
.list-group-item {
  background-color: rgba(204, 204, 204, 0.23);
  color: #fff;
}
.form-control {
  background-color: #333;
  color: #fff;
  border-color: #666;
}
.form-control:focus {
  background-color: #444;
  color: #fff;
}
</style>