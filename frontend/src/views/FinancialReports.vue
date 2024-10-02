<template>
  <div class="financial-reports">
    <h2>財務報表</h2>
    <div class="row">
      <div class="col-md-6">
        <h3>收入概覽</h3>
        <canvas id="incomeChart"></canvas>
      </div>
      <div class="col-md-6">
        <h3>支出概覽</h3>
        <canvas id="expenseChart"></canvas>
      </div>
    </div>
    <div class="row mt-4">
      <div class="col-md-12">
        <h3>財務摘要</h3>
        <table class="table table-dark table-striped">
          <thead>
            <tr>
              <th>項目</th>
              <th>金額</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>總收入</td>
              <td>{{ financialSummary.totalIncome }}</td>
            </tr>
            <tr>
              <td>總支出</td>
              <td>{{ financialSummary.totalExpense }}</td>
            </tr>
            <tr>
              <td>淨利潤</td>
              <td>{{ financialSummary.netProfit }}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
    <div class="row mt-4">
      <div class="col-md-12">
        <h3>生成報表</h3>
        <form @submit.prevent="generateReport">
          <div class="mb-3">
            <label for="reportType" class="form-label">報表類型</label>
            <select id="reportType" v-model="reportType" class="form-select">
              <option value="daily">
                日報
              </option>
              <option value="weekly">
                週報
              </option>
              <option value="monthly">
                月報
              </option>
            </select>
          </div>
          <div class="mb-3">
            <label for="startDate" class="form-label">開始日期</label>
            <input
              id="startDate"
              v-model="startDate"
              type="date"
              class="form-control"
            />
          </div>
          <div class="mb-3">
            <label for="endDate" class="form-label">結束日期</label>
            <input
              id="endDate"
              v-model="endDate"
              type="date"
              class="form-control"
            />
          </div>
          <button type="submit" class="btn btn-primary">
            生成報表
          </button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import Chart from 'chart.js/auto';

export default {
  name: 'FinancialReports',
  data() {
    return {
      financialSummary: {
        totalIncome: 150000,
        totalExpense: 100000,
        netProfit: 50000
      },
      reportType: 'monthly',
      startDate: '',
      endDate: ''
    }
  },
  mounted() {
    this.renderCharts();
  },
  methods: {
    renderCharts() {
      // 收入圖表
      new Chart(document.getElementById('incomeChart'), {
        type: 'bar',
        data: {
          labels: ['一月', '二月', '三月', '四月', '五月', '六月'],
          datasets: [{
            label: '月收入',
            data: [12000, 19000, 15000, 20000, 18000, 23000],
            backgroundColor: 'rgba(75, 192, 192, 0.6)'
          }]
        },
        options: {
          responsive: true,
          scales: {
            y: {
              beginAtZero: true
            }
          }
        }
      });

      // 支出圖表
      new Chart(document.getElementById('expenseChart'), {
        type: 'bar',
        data: {
          labels: ['一月', '二月', '三月', '四月', '五月', '六月'],
          datasets: [{
            label: '月支出',
            data: [10000, 15000, 13000, 17000, 16000, 19000],
            backgroundColor: 'rgba(255, 99, 132, 0.6)'
          }]
        },
        options: {
          responsive: true,
          scales: {
            y: {
              beginAtZero: true
            }
          }
        }
      });
    },
    generateReport() {
      // 實現生成報表的邏輯
      console.log(`生成${this.reportType}報表，從${this.startDate}到${this.endDate}`);
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
.form-control, .form-select {
  background-color: #333;
  color: #fff;
  border-color: #666;
}
.form-control:focus, .form-select:focus {
  background-color: #444;
  color: #fff;
}
</style>