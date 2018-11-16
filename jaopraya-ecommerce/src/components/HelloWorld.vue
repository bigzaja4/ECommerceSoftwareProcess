<template>
  <div>
     <div class="row text-center">
        <div class="col-lg">
          <div class="card-deck">
          <div class="card" style="width: 13rem;margin-bottom:15px">
              <div class="img-resize">
                <router-link :to="`/item/description/${product.productId}`">
                <img class="card-img-top" :src="product.picture" alt="productPicture" >
                </router-link>
                <router-view/>
              </div>
              <div class="card-body">
                 <h5 class="card-title" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">{{product.productName}}</h5>
                 <p class="card-text" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">{{product.category}}</p>
                 <p class="showPrice"><b>{{product.productPrice}}&nbsp;THB&nbsp;</b>
                 <a class="btn sale btn-sm" href="#" role="button">ซื้อเลย</a>
                 <button @click="addIdToCart(product.productId)">
                    <img src="../pic/shopping-cart1.png" width="20px" height="20px" style="float:right;margin-top:5px;margin-right:5px">
                 </button>
                  
                 </p>
              </div>
          </div>&nbsp;&nbsp;
          </div>
        </div>
     </div>
  </div>
  
  
</template>

<script>
import {mapGetters,mapActions} from 'vuex'
export default {
  name: "HelloWorld",
  props: {
    product: {}
  },
  computed: {
    ...mapGetters(['getCart'])
  },
  methods: {
    ...mapActions(['addIdToCart']),
    ...mapActions(['clearIdCart'])
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
div.img-resize img {
  width: 13rem;
  height: auto;
} 

div.img-resize {
  width: 13rem;
  height: 13rem;
  overflow: hidden;
  text-align: center;
}

</style>
