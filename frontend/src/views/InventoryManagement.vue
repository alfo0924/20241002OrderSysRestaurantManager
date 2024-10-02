<template>
  <div class="inventory-management">
    <h2>庫存管理</h2>
    <div class="row">
      <div class="col-md-8">
        <h3>庫存列表</h3>
        <table class="table table-dark table-striped">
          <thead>
            <tr>
              <th>物品名稱</th>
              <th>當前數量</th>
              <th>最低庫存量</th>
              <th>狀態</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="item in inventoryItems" :key="item.id">
              <td>{{ item.name }}</td>
              <td>{{ item.currentQuantity }}</td>
              <td>{{ item.minimumQuantity }}</td>
              <td :class="{ 'text-danger': item.currentQuantity < item.minimumQuantity }">
                {{ item.currentQuantity < item.minimumQuantity ? '庫存不足' : '正常' }}
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="col-md-4">
        <h3>新增庫存</h3>
        <form @submit.prevent="addInventoryItem">
          <div class="mb-3">
            <label for="itemName" class="form-label">物品名稱</label>
            <input
              id="itemName"
              v-model="newItem.name"
              type="text"
              class="form-control"
              required
            />
          </div>
          <div class="mb-3">
            <label for="itemQuantity" class="form-label">數量</label>
            <input
              id="itemQuantity"
              v-model="newItem.currentQuantity"
              type="number"
              class="form-control"
              required
            />
          </div>
          <div class="mb-3">
            <label for="itemMinimum" class="form-label">最低庫存量</label>
            <input
              id="itemMinimum"
              v-model="newItem.minimumQuantity"
              type="number"
              class="form-control"
              required
            />
          </div>
          <button type="submit" class="btn btn-primary">
            新增
          </button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'InventoryManagement',
  data() {
    return {
      inventoryItems: [
        { id: 1, name: '雞肉', currentQuantity: 50, minimumQuantity: 20 },
        { id: 2, name: '麵粉', currentQuantity: 100, minimumQuantity: 50 },
        { id: 3, name: '蔬菜', currentQuantity: 30, minimumQuantity: 40 },
      ],
      newItem: {
        name: '',
        currentQuantity: null,
        minimumQuantity: null
      }
    }
  },
  methods: {
    addInventoryItem() {
      this.inventoryItems.push({
        id: this.inventoryItems.length + 1,
        ...this.newItem
      });
      this.newItem = { name: '', currentQuantity: null, minimumQuantity: null };
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
.text-danger {
  color: rgba(233, 0, 0, 0.98) !important;
}
</style>