<template>
    <div class="description">  
      <div  class="row px-3 " style="margin-top:-30px">
        <h3 style="margin-left:11.5%;font-size:18px;color:#8D8E8D;margin-bottom:5px">ข้อมูลสินค้า</h3> 
      </div>
    <div  class="row px-3 ">
      <div class="col-10 offset-1 borderR " style="border-width:3px !important;background: #ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);"> 
        <div class="row" style="margin-left:20px">
          <div style="margin: 30px;" class="col-4 " >
            <div class="img-resize" style="border: 2px solid #8D8E8D  ;border-radius: 10px;">
              <img
                :src="description.picture" 
              >
              
            
            </div>
          </div>
          <div class="col" style="margin-left:30px">
            <br><br>
            <h1 style="text-align:left;font-size:30px;width:400px;word-wrap:break-word;margin-top:12px">{{product.productName}}</h1>
            
            
            <div class="cutText" style="text-align:left;width:500px;margin-top:-8px">{{product.category}}</div><br>
            
            <p style="text-align:left;font-size:30px;color:#C44953;margin-top:-10px">  <Blink><b>&nbsp;&nbsp;&nbsp;{{product.productPrice}}</b></Blink>  บาท</p>
           <hr style="width:400px;margin-left:0px;margin-bottom:20px">
            <div style="text-align:left;">
              
              &nbsp;&nbsp;<b>ขนาด</b> <br>
            <div class="btn-group btn-group-toggle" data-toggle="buttons">
              <label class="btn btn-secondary active">
                <input type="radio" name="options" id="option1" autocomplete="off" checked> ไซส์ S
              </label>
              <label class="btn btn-secondary">
                <input type="radio" name="options" id="option2" autocomplete="off"> ไซส์ M
              </label>
              <label class="btn btn-secondary">
                <input type="radio" name="options" id="option3" autocomplete="off"> ไซส์ L
              </label>
            </div>
               <p> &nbsp; มีสินค้าทั้งหมด {{description.stockQuantity}} ชิ้น </p>
 
            <!-- login แล้ว -->
            
            <button @click="addIdToCart(product.productId)" type="button" class="btn btn-danger" v-if="getIsConnected">เพิ่มไปยังรถเข็น</button>&nbsp;

            <!-- ยังไม่ล็อกอิน -->
            
            <button @click="getAlert(true)" type="button" class="btn btn-danger" v-if="!getIsConnected" >เพิ่มไปยังรถเข็น</button>&nbsp;
            
              
            <router-link to="/cart/cart"  >
            <button @click="addIdToCart(product.productId)&&console.log('ff')" type="button" class="btn btn-danger" v-if="getIsConnected">ซื้อสินค้า</button>
             </router-link>

             <button @click="getAlert(true)&&console.log('dd')" type="button" class="btn btn-danger" v-if="!getIsConnected">ซื้อสินค้า</button>
             <div class="card" style="position:absolute;z-index:4;margin:50px;left:-50%;top:-20%;right:auto;background:#ffffff;border:3px solid #EE8981;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);border-radius: 10px;" v-if="alert" >
                            <p style="color:#000000;margin:50px;text-align:center;color:#EE8981;font-size:25px">
                              
                            <button class="btn" style="float:right;font-size:20px;color:#EE8981;margin-top:-43px;margin-right:-27px;background:#ffffff;" @click="getAlert(false)"><b>X</b></button>  
                              
                            <img src="../pic/exclamation-mark.png" width="150px" height="150px"/> <br><br>
                            <b>ล็อกอินก่อนดิสัส</b></p>
                        </div> 

                        
            </div>
          </div>
        </div>
      </div>
    </div>
      
    <br>
    <!-- ----------------------------------------------- -->
    <h3 style="text-align:left;margin-left:11.5%;font-size:18px;color:#8D8E8D;margin-bottom:5px">รายละเอียดสินค้าเพิ่มเติม</h3>
    
    <div class="row px-3 ">
      <div class="col-10 offset-1  borderR" style="border-width:3px !important;background: #ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">
        <div class="row">
          <div style="margin: 30px;" class="col-4 ">
            <div style="text-align:left;margin-left:40px"> 
              <table>
                <tr>
                  <td style="vertical-align:top;width:60px"><b>Detail :</b></td><td> {{description.descriptionDetail}}</td> 
                </tr>
                  <tr>
              <td style="vertical-align:top;width:60px"><b>Color :</b></td> <td>{{description.productColor}}</td> 
              </tr>
              <tr>
              <td style="vertical-align:top;width:60px"><b>Size :</b></td> <td>{{description.size}}</td>
              </tr>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br><br><br><br>
  </div>
</template>

<script>
import {mapGetters,mapActions} from 'vuex'
import axios from "axios";  
axios.defaults.withCredentials = false; 
export default {
  data() {
    return {
        description: {},
        product: {},
        id: '',
        alert: false
    };
  },
  props: {
    id: '',
    product: {}
  },
  computed: {
    ...mapGetters(['getCart']),
    ...mapGetters(['getIsConnected']),
  },
  name: "Description",
  methods: {
      ...mapActions(['addIdToCart']),
      ...mapActions(['setIsConnected']),
      getDescription: async function() {
      let description = await axios.get('http://localhost:5000/description/'+this.id)
      this.description = description.data
      console.log(this.description)
    },
      getProduct: async function(){
      let product = await axios.get('http://localhost:5000/productId/'+this.id)
      this.product = product.data
      console.log(this.product)
      },
    getAlert(p) {
      this.alert = p;
    }

  },
  mounted() {
      this.getDescription();
      this.getProduct();
      
  },
};
</script>

<style>
.description{
    font-family: 'Kanit', sans-serif;
  }
.borderR{
  border: 2px solid #ffffff;
  border-radius: 10px;
}
.cutText{
word-wrap:break-word;

}
div.img-resize img {
  width: 360px;
  height: auto;
  
  
} 

div.img-resize {
  width: 360px;
  height: 360px;
  overflow: hidden;
  text-align: center;
  vertical-align:middle;
}
</style>
