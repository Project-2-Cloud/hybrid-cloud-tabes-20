

<template>
  <div class="container">
    <div class="container">
      <div class="row">
        <Item v-for="teacher in teachers" 
          :key="teacher.id"
          :item="teacher"
        />
      </div>
    </div>  
  </div>
</template>
	
<script>
// @ is an alias to /src
import Item from "@/Item.vue"	
export default {
  name: 'Home',
  computed: {
    teachers() {
      return this.$store.state.teachers;
    }
  },
  components: {
    Item
  }
}
</script>