<template>
  <div class="container">
    <Header />
    <router-view />
  </div>
</template>

<script setup>
import { reactive, provide } from "vue";
import Header from "@/components/Header.vue";

const states = reactive({
  todoList: [
    { id: 1, todo: "ES6 학습", desc: "설명 1", done: false },
    { id: 2, todo: "React 학습", desc: "설명 2", done: false },
    { id: 3, todo: "ContextAPI 학습", desc: "설명 3", done: true },
    { id: 4, todo: "야구경기 관람", desc: "설명 4", done: false },
  ],
});

const addTodo = ({ todo, desc }) => {
  states.todoList.push({
    id: new Date().getTime(),
    todo,
    desc,
    done: false,
  });
};

const updateTodo = ({ id, todo, desc, done }) => {
  const index = states.todoList.findIndex((item) => item.id === id);
  if (index !== -1) {
    states.todoList[index] = { ...states.todoList[index], todo, desc, done };
  }
};

const deleteTodo = (id) => {
  const index = states.todoList.findIndex((item) => item.id === id);
  if (index !== -1) {
    states.todoList.splice(index, 1);
  }
};

const toggleDone = (id) => {
  const index = states.todoList.findIndex((item) => item.id === id);
  if (index !== -1) {
    states.todoList[index].done = !states.todoList[index].done;
  }
};

provide("todoList", states.todoList);
provide("actions", { addTodo, deleteTodo, toggleDone, updateTodo });
</script>
