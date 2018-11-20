<template>
  <div class="container-fluid" style="font-family: 'Kanit', sans-serif;background: #ECEDEF;">
       <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);margin-top:-60px;margin-left:-30px;margin-right:-30px" >
      <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                    <p class="userName" style="margin-top:5px;margin-bottom:7px" >
                        <img src="../pic/notification.png" width="25px" height="25px"/>
                        <img src="../pic/settings-work-tool.png" width="25px" height="25px"/>&nbsp;
                  
                        <img src="../pic/user-avatar-main-picture.png" width="35px" height="35px"/>&nbsp;&nbsp;<b>Prayut</b></p>
                    </div>
  </div>
      <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);margin-left:-30px;margin-right:-30px">
                     <!-- <div class="col" style="background: #6D5F69; padding-top: 50px;">
                        <img src="../pic/logo.png" width="125px" height="80px"/>
                      </div> -->
                     
                      <div class="col" style="background: #6D5F69; padding-top: 50px;">
                          <p class="text1" style="float:left;margin-left:230px"> 
                              <router-link to="/">
                              <img src="../pic/logo.png" width="125px" height="auto"/>
                              </router-link>
                               &nbsp;| รถเข็น</p>
                      </div> 
                      
                </div>
                <!-- ----------------------------------header------------------------------------ -->
                <br>
                <div class="row" style="color:#8D8E8D">
                        <div class="col" style=" ">
                            <div class="row" style="color:#8D8E8D;text-align:center;margin-bottom:-28px;margin-top:10px">
                      <div class="col-sm-6" style="text-align:center;margin-top:-3px">รายการทั้งหมด</div>
                      <div class="col-sm-1.5" style="margin-top:-3px">ราคาต่อชิ้น</div>
                      <div class="col-sm-1" style="margin-top:-3px"> จำนวน</div>
                      <div class="col-sm-1" style="margin-top:-3px">ราคารวม</div>
                      <div class="col-sm-1" style="margin-top:-3px">แอคชั่น</div>
                  </div> 
                           
                            
                        <div v-for="item in product" :key="item">
                          <table width=70% class="textbox" cellpadding="10" style="margin-bottom:-20px">
                            <tr>
                              <td width=50px style="text-align:center;">
                                
                              </td>
                              <td width=100px style="text-align:center;">
                                  <div  class="img-resize" style="border: 2px solid #959595  ;border-radius: 10px;float:right">
                                  <img :src="`${item.picture}`"  /></div>
                               </td>
                              <td width=350px style="text-align:left;">&nbsp;&nbsp;&nbsp;{{item.productName}}<br>{{item.category}}</td>
                                <td width=100px style="text-align:center;">
                                  {{item.productPrice}} THB
                                </td>
                                <td width=80px style="text-align:center;">
                                        1
                                </td>
                                <td width=100px style="text-align:center;">
                                    {{item.productPrice}} THB
                                </td>
                                <td width=auto style="text-align:center;">
                                    <button class="btn" type="button" id="deletebutton" @click="deleteOneProductFromCart(item)" >ลบ</button>
                                </td>
                            </tr>
                          </table>
                        </div>

                            <table width=70% class="textbox" cellpadding="10" >
                                <tr>
                                    <td>
                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                     </td>
                                     <td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                 
                                    <td>รวมราคาสินค้า({{product.length}}สินค้า)&nbsp;&nbsp;&nbsp;&nbsp;<b>{{totalPrice}}</b> THB </td>
                                </tr>
                              </table>
                              <br>
                              <div class="cfmbtn">
                              <p><button class="btn" type="button" id="confirmbutton" @click="clearIdCart(),clearProductInCart()" style="background:#C44953;color:#ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">ล้างตระกร้าสินค้า</button>&nbsp;
                                    <router-link to="/cart/payment" >
                                        <button class="btn" type="button" id="confirmbutton"  style="background:#C44953;color:#ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);"> 
                                            ยืนยันการสั่งซื้อสินค้า  
                                        </button>
                                    </router-link>
                                    
                                </p>                               
                                
                              </div>
                              <br> <br> <br> <br> <br> <br>  <br> <br> <br> <br> <br> <br>  <br> <br> <br> <br> <br> <br>  <br> <br> <br> 
                    </div>
                </div>
  </div>
</template>

<script>
import {mapGetters, mapActions} from 'vuex'
import axios from "axios";  

axios.defaults.withCredentials = true;
export default {
    data() {
        return {
            product: [],
            quantity: 0,
            totalPrice: 0,

        }
    },
    computed: {
        ...mapGetters(['getIsCartPage']),
        ...mapGetters(['getIdCart'])
    },methods: { 
        ...mapActions(['setTotalPrice']),
        ...mapActions(['inCartPage']),
        ...mapActions(['clearIdCart']),
        ...mapActions(['deleteIdFromCart']),
        addItemToCart: async function() {
            let productId = this.getIdCart;
            for(let i=0; i<productId.length; i++){ 
                let product = await axios.get('https://jaophayabackendcommerce.mybluemix.net/productId/'+productId[i])
                this.product.push(product.data);
                this.totalPrice += product.data.productPrice;
            }
            this.setTotalPrice(this.totalPrice);
            console.log(this.product)
        },
        clearProductInCart: function(){
            this.product = [];
            this.totalPrice = 0;
            this.setTotalPrice(this.totalPrice);
        },
        deleteOneProductFromCart: function(product){
            let index = this.product.indexOf(product);
            console.log('index: '+index);
            this.totalPrice -= this.product[index].productPrice;
            this.setTotalPrice(this.totalPrice);
            this.product.splice(index,1);
            this.deleteIdFromCart(index);

            }
        
    },
    mounted() {

        this.inCartPage();
        this.addItemToCart();
    }   
}
</script>

<style scoped>
.nameUser{
    color: white;
    font-size: 17px;
    padding-right: 20px;
}
.iconMenu{
    
    margin-top: -10px;
}
.textbox{
    border-width:3px !important;
    background: #ffffff;
    border-radius: 6px;
    box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);
    margin-left:180px;
    margin-top: 30px;

}
.cfmbtn{
    /* width: 200px;
  margin: 0 auto;  */
  float: right;
  margin-right:18.4%
  
}
div.img-resize img {
  width: auto;
  height:80px;
} 

div.img-resize {
  width: 80px;
  height: 80px;
  overflow: hidden;
  text-align: center;
}
</style>