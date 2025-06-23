<template>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
      <router-link class="navbar-brand" to="/">라우팅 연습</router-link>
      <ul class="navbar-nav">
        <li class="nav-item"><router-link class="nav-link" to="/">Home</router-link></li>
        <li class="nav-item"><router-link class="nav-link" to="/about">About</router-link></li>
        <li class="nav-item"><router-link class="nav-link" to="/members">Members</router-link></li>
        <li class="nav-item"><router-link class="nav-link" to="/videos">Videos</router-link></li>
      </ul>
    </div>
  </nav>
</template>

<script>
export default {
  name: 'Header'
}
</script>
