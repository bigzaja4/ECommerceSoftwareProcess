<template>
  <div style="font-family: 'Kanit', sans-serif;">
     <div class="row" >
        <div class="col-lg" >
          <div class="card-deck">
          <div class="card" style="width: 13.5rem;margin-bottom:15px;box-shadow: 1px 1px 1px 0px rgba(50, 50, 50, .5);border-radius: 10px;overflow: hidden;">
              <div class="img-resize" >
                <router-link :to="`/item/description/${product.productId}`">
                <img class="card-img-top" :src="product.picture" alt="productPicture" >
                </router-link>
                <router-view/>
              </div>
              <div class="card-body" style="margin-bottom:-17px">
                 <h5 class="card-title" style="margin-top:1px;font-size:18px;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><b>{{product.productName}}</b></h5>
                 <p class="card-text" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;color:#535352">{{product.category}}</p>
                 <p style="margin-bottom:-5px;"><p style="font-size:6px;color:#C44953;margin-left:-1px;"><b style="font-size:19px;color:#C44953">{{product.productPrice}}</b>&nbsp;THB&nbsp;
                 <a class="btn btn-sm" href="#" role="button" style="background:#C44953;margin-right:3px">ซื้อเลย</a>
                 <button @click="addIdToCart(product.productId)" class="btn btn-sm">
                    <img src="../pic/shopping-cart1.png" width="20px" height="20px" style="float:right;margin-right:3px;margin:1px">
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
  width: 14rem;
  height: auto;
} 

div.img-resize {
  width: 14rem;
  height: 11.8rem;
  overflow: hidden;
  text-align: center;
}

</style>
