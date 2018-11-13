<template>
  <div class="home">  
    {{searchKey}}  <br>
    {{$route.params.searchKey}}
    <div class="container">
    <div class="row text-center" >
      <HelloWorld v-for="item in product" :key="item.id" :product="item" />
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
      product: {},
      searchKey: ''
    };
  },
  props: {
    
  },
  name: 'home',
  components: {
    HelloWorld
  },
  watch: {
    '$route.params.searchKey': function (searchKey) {
      console.log('Watch change : ' + searchKey )
      this.getSearchKey(searchKey);
    }
  },
  methods: {
    getAllProduct: async function() {
      let product = await axios.get("http://localhost:8099/product");
      this.product = product.data;
      console.log(this.product);
    },
    getSearchKey: function(searchKey){
      this.searchKey = searchKey;  
      console.log(' เรียก getSearchKey fucntion : ' + this.searchKey);
    }
    // searchItem: async function() {
    //   let items = await axios.get('http://localhost:8099/product/'+this.searchKeyword)
    //   this.itemProduct = items.data
    //   console.log(items)
    // }
  },
  mounted() {
    this.getAllProduct();
  },
  updated() {
    
  }
}
</script>
