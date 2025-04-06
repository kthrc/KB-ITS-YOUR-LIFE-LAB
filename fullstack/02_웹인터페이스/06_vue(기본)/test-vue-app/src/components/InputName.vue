<template>
  <div>
    <label for="name">이름 입력: </label>
    <input type="text" :value="name" @input="$emit('nameChanged', $event.target.value)" />
  </div>
</template>

<script>
export default {
  name: 'InputName',
  props: {
    name: {
      type: String,
      required: true,
      validator(value) {
        return value.length >= 3
      }
    }
  }
}
</script>
