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
import {mapGetters, mapActions} from 'vuex'
import axios from "axios";  
axios.defaults.withCredentials = true;
export default {
  computed: {
    ...mapGetters(['getIsCartPage'])
  },
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
      let product = await axios.get("http://localhost:5000/product");  
      this.product = product.data;
      console.log(this.product);
    },
    getSearchKey: function(searchKey){
      this.searchKey = searchKey;  
      console.log(' เรียก getSearchKey fucntion : ' + this.searchKey);
      if(this.searchKey == null |this.searchKey == undefined){
        this.getAllProduct();
      }else{
        console.log("Hello El")
        this.searchItem(this.searchKey);
      }
    },
    searchItem: async function() {
      let product = await axios.get('http://localhost:5000/product/'+this.searchKey)
      this.product = product.data
      console.log(this.product)
    },
    ...mapActions(['notCartPage'])
  },
  mounted() {
    this.getAllProduct();
    this.notCartPage();
  }
}
</script>
