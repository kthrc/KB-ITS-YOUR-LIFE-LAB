<template>
  <li>
    <input type="checkbox" :id="idol.id" v-model="idol.checked" />
    <label :for="idol.id">{{ idol.name }}</label>
  </li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  props: {
    idol: {
      type: Object,
      required: true,
      validator(value) {
        return (
          (typeof value.id === 'number' || typeof value.id === 'string') &&
          typeof value.name === 'string' &&
          (typeof value.checked === 'boolean' || value.checked === undefined)
        )
      }
    }
  }
}
</script>
