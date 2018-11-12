<template>
  <!-- <div class="hello">
    <h1>{{ msg }}</h1> -->
  <div>
    <div class="row text-center" style="padding:25px; margin-top:-55px">
        <div class="col" v-for="item in product" :key="item">
          <div class="card-deck">
          <div class="card" style="width: 14rem;margin-bottom:15px">
              <img class="card-img-top" src="http://placehold.it/500x325" alt="productPicture">
              <div class="card-body">
                 <h5 class="card-title" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">{{item.productName}}</h5>
                 <p class="card-text" >เสื้อแจ็คเก็ตวิ่งผู้หญิง</p>
                 <p class="showPrice"><b>{{item.productPrice}}&nbsp;THB&nbsp;</b>
                 <a class="btn sale" href="#" role="button">ซื้อเลย</a>
                 <img src="../pic/shopping-cart1.png" width="20px" height="20px"/>
                 </p>
              </div>
          </div>
          </div>
        </div>
     </div>
  </div>

  
</template>

<script>
import axios from "axios";
axios.defaults.withCredentials = true;
export default {
  data() {
    return {
      product: {}
    };
  },
  name: "HelloWorld",
  props: {
    msg: String
  },
  methods: {
    isNextProduct: function(index) {
      let result = true;
      if (product[index] == null) {
        result == false;
      }
      return result;
    },
    getAllProduct: async function() {
      let product = await axios.get("http://localhost:8099/product");
      this.product = product.data;
      console.log(this.product);
    }
  },
  mounted() {
    this.getAllProduct();
  }
};
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
  color: #ffffff;
}

</style>
