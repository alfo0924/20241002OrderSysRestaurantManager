<template>
  <div id="app">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">餐廳管理系統</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <router-link class="nav-link" to="/menu">菜單管理</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/orders">訂單管理</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/inventory">庫存管理</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/employees">員工管理</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/finance">財務報表</router-link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container mt-4">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
body {
  background-color: #000;
  color: #fff;
}
.navbar {
  background-color: #000 !important;
}
.nav-link {
  color: #fff !important;
}
.nav-link:hover {
  color: rgba(204, 204, 204, 0.23) !important;
}
.btn-primary {
  background-color: rgba(233, 0, 0, 0.98);
  border-color: rgba(233, 0, 0, 0.98);
}
.btn-primary:hover {
  background-color: rgba(204, 204, 204, 0.23);
  border-color: rgba(204, 204, 204, 0.23);
}
</style>