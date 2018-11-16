<template>
  <div class="container-fluid" style="font-family: 'Kanit', sans-serif;background: #EAEAEA">
      <div class="row" style="margin-top:-60px;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);margin-left:-30px;margin-right:-30px">
                    <!-- <div class="col" style="background: #6D5F69; padding-left: 35px; padding-top:10px;padding-bottom: 10px ">
                        <img src="pic/logo.png" width="125px" height="80px"/>
                      </div> -->
                     
                      <div class="col" style="background: #6D5F69; padding-top: 50px;">
                          <p class="text1"><img src="../pic/shopping-cart.png" width="70px" height="auto"> &nbsp;| รถเข็น</p>
                      </div>
                      <div class="col" style="background: #6D5F69; padding-top: 5px;padding-right: 40px; text-align: right;">      
                      </div>
                </div>
                <br>
                <div class="row">
                        <div class="col" style="background: #ECEDEF; padding-right: 15px">
                            <p style="margin-bottom:-24px;color:#8D8E8D">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                รายการทั้งหมด &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 
                            ราคาต่อชิ้น&nbsp;&nbsp;&nbsp;&nbsp; 
                            จำนวน&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                            ราคารวม&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp; 
                            แอคชั่น</p>
                            <table width=70% class="" cellpadding="10" >
                              <!-- <tr >
                                  <td><b style="margin-left:80px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;รายการสินค้าทั้งหมด
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></td>
                                  <td>ราคาต่อชิ้น</td>
                                  <td>จำนวน</td>
                                  <td>ราคารวม</td>
                                  <td>แอคชั่น</td>
                                  
                              </tr> -->

                            </table>
                        <div v-for="item in product" :key="item">
                          <table width=70% class="textbox" cellpadding="10" style="margin-bottom:-20px">
                            <tr>
                              <td width=50px style="text-align:center;">
                                 <input type='checkbox' name='btn' id='btn'  onclick='check_agree();'/>
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
                                      <!-- <input type="number" style="width: 50px" v-model="quantity"> -->
                                    
                                </td>
                                <td width=100px style="text-align:center;">
                                    {{item.productPrice}} THB
                                </td>
                                <td width=auto style="text-align:center;">
                                    <button class="btn" type="button" id="deletebutton" >ลบ</button>
                                </td>
                            </tr>
                          </table>
                        </div>

                            <table width=70% class="textbox" cellpadding="10" >
                                <tr>
                                    <td>
                                        <input type='checkbox' name='btn' id='btn'  onclick='check_agree();'/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;เลือกทั้งหมด 
                                     </td>
                                     <td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                 
                                    <td>รวมราคาสินค้า(6สินค้า)&nbsp;&nbsp;&nbsp;&nbsp;<b> 6,600 </b> THB </td>
                                </tr>
                              </table>
                              <br>
                              <div class="cfmbtn">
                              <p><button class="btn" type="button" id="confirmbutton" @click="clearIdCart()" style="background:#C44953;color:#ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">ล้างตระกร้าสินค้า</button>&nbsp;
                              <button class="btn" type="button" id="confirmbutton" style="background:#C44953;color:#ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">ยืนยันการสั่งซื้อสินค้า</button></p>
                              </div>
                              <br> <br> <br> <br> <br> <br> 


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
            quantity: 0

        }
    },
    computed: {
        ...mapGetters(['getIsCartPage']),
        ...mapGetters(['getIdCart'])
    },methods: {  
        ...mapActions(['inCartPage']),
        ...mapActions(['clearIdCart']),
        addItemToCart: async function() {
            let productId = this.getIdCart;
            for(let i=0; i<productId.length; i++){ 
                let product = await axios.get('http://localhost:8099/product/'+productId[i])
                this.product.push(product.data);   
            }
            console.log(this.product)
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
  margin-right:210px 
  
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