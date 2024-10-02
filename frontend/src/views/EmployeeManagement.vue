<template>
  <div class="employee-management">
    <h2>員工管理</h2>
    <div class="row">
      <div class="col-md-8">
        <h3>員工列表</h3>
        <table class="table table-dark table-striped">
          <thead>
          <tr>
            <th>員工ID</th>
            <th>姓名</th>
            <th>職位</th>
            <th>聯繫方式</th>
            <th>操作</th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="employee in employees" :key="employee.id">
            <td>{{ employee.id }}</td>
            <td>{{ employee.name }}</td>
            <td>{{ employee.position }}</td>
            <td>{{ employee.contact }}</td>
            <td>
              <button class="btn btn-primary btn-sm me-2" @click="editEmployee(employee.id)">編輯</button>
              <button class="btn btn-danger btn-sm" @click="deleteEmployee(employee.id)">刪除</button>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
      <div class="col-md-4">
        <h3>新增員工</h3>
        <form @submit.prevent="addEmployee">
          <div class="mb-3">
            <label for="employeeName" class="form-label">姓名</label>
            <input type="text" class="form-control" id="employeeName" v-model="newEmployee.name" required>
          </div>
          <div class="mb-3">
            <label for="employeePosition" class="form-label">職位</label>
            <input type="text" class="form-control" id="employeePosition" v-model="newEmployee.position" required>
          </div>
          <div class="mb-3">
            <label for="employeeContact" class="form-label">聯繫方式</label>
            <input type="text" class="form-control" id="employeeContact" v-model="newEmployee.contact" required>
          </div>
          <button type="submit" class="btn btn-primary">新增員工</button>
        </form>
      </div>
    </div>
    <div class="row mt-4">
      <div class="col-md-6">
        <h3>員工排班</h3>
        <!-- 這裡可以添加排班功能的實現 -->
      </div>
      <div class="col-md-6">
        <h3>績效評估</h3>
        <!-- 這裡可以添加績效評估功能的實現 -->
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'EmployeeManagement',
  data() {
    return {
      employees: [
        { id: 1, name: '張三', position: '廚師', contact: '0912-345-678' },
        { id: 2, name: '李四', position: '服務生', contact: '0923-456-789' },
        { id: 3, name: '王五', position: '經理', contact: '0934-567-890' },
      ],
      newEmployee: {
        name: '',
        position: '',
        contact: ''
      }
    }
  },
  methods: {
    addEmployee() {
      this.employees.push({
        id: this.employees.length + 1,
        ...this.newEmployee
      });
      this.newEmployee = { name: '', position: '', contact: '' };
    },
    editEmployee(id) {
      // 實現編輯員工的邏輯
      console.log(`編輯員工 ID: ${id}`);
    },
    deleteEmployee(id) {
      // 實現刪除員工的邏輯
      console.log(`刪除員工 ID: ${id}`);
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