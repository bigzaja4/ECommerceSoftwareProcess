<template>
  <div class="home">
    <div class="container">
    <div class="row text-center" >
      <HelloWorld v-for="item in product" :key="item" :product="item" />
    </div>
  </div></div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import axios from "axios";
axios.defaults.withCredentials = true;
export default {
  data() {
    return {
      product: {}
    };
  },
  props: {
    
  },
  name: 'home',
  components: {
    HelloWorld
  },
  methods: {
    getAllProduct: async function() {
      let product = await axios.get("http://localhost:8099/product");
      this.product = product.data;
      console.log(this.product);
    }
  },
  mounted() {
    this.getAllProduct();
  }
}
</script>
