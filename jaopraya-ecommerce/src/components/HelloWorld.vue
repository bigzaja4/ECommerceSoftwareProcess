<template>
  <div>
     <div class="row text-center">
        <div class="col-lg">
          <div class="card-deck">
          <div class="card" style="width: 13rem;margin-bottom:15px">
              <img class="card-img-top" src="http://placehold.it/500x325" alt="productPicture">
              <div class="card-body">
                 <h5 class="card-title" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">{{product.productName}}</h5>
                 <p class="card-text" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">เสื้อแจ็คเก็ตวิ่งผู้หญิง</p>
                 <p class="showPrice"><b>{{product.productPrice}}&nbsp;THB&nbsp;</b>&nbsp;
                 <a class="btn sale btn-sm" href="#" role="button">ซื้อเลย</a>
                 <img src="../pic/shopping-cart1.png" width="20px" height="20px" style="float:right;margin-top:5px"/>
                 </p>
              </div>
          </div>&nbsp;&nbsp;
          </div>
        </div>
     </div>
  </div>

  
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    product: {}
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
