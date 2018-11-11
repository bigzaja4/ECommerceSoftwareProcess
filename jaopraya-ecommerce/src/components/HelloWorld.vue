<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <div class="row text-center">
        <div class="col" style="background: #ECEDEF; padding-right: 15px" v-for="item in product" :key="item">
            <div class="col-lg-3">
              <div class="card">
                <img class="card-img-top" src="http://placehold.it/500x325" alt="productPicture">
                <div class="card-body">
                <h4 class="card-title">{{item.productName}}</h4>
                <p class="card-text">{{item.productPrice}}&nbsp;THB&nbsp;<a class="btn btn-danger" href="#" role="button">Buy</a>
                  <img src="../pic/shopping-cart1.png" width="30px" height="30px"/></p>
                </div>
              </div>
            </div>
        </div>
    </div>
  </div>

  
</template>

<script>
import axios from "axios"
axios.defaults.withCredentials = true;
export default {
  data() {
    return {
      product: {}
    }
  },
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods: {
    isNextProduct: function(index){
        let result = true;
        if(product[index] == null){
          result == false;
        }
        return result;
    },
    getAllProduct: async function(){
        let product = await axios.get('http://localhost:8099/product');   
        this.product = product.data;
        console.log(this.product)
     }
  },
  mounted() {
    this.getAllProduct();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
