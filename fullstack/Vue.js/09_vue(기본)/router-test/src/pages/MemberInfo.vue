<template>
  <div class="card card-body">
    <h2>Member Info</h2>
    <div v-if="member">
      경로 패턴: /members/:id<br />
      요청 경로: {{ route.path }}<br />
      id값: {{ route.params.id }}<br />
      <hr />
      <h4>{{ member.name }}</h4>
      <img :src="member.photo" style="width:120px" />
      <p>{{ member.description }}</p>
      <a v-if="member.instagram" class="fa fa-instagram" :href="member.instagram" target="_blank"></a>
      <a v-if="member.facebook" class="fa fa-facebook" :href="member.facebook" target="_blank"></a>
      <a v-if="member.youtube" class="fa fa-youtube" :href="member.youtube" target="_blank"></a>
    </div>
  </div>
</template>

<script>
import { useRoute } from 'vue-router'
import members from '@/members.json'

export default {
  name: 'MemberInfo',
  setup() {
    const route = useRoute()
    const member = members.find(m => m.id === parseInt(route.params.id))
    return { route, member }
  }
}
</script>
