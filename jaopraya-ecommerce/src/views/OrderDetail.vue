<template>
  <div class="container-fluid" style="font-family: 'Kanit', sans-serif;background: #ECEDEF;">
    <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);margin-top:-60px;margin-left:-30px;margin-right:-30px" >
      <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 1px; text-align: right;">     
                    <p class="userName" style="margin-top:5px;margin-bottom:7px" >
                        <img src="../pic/notification.png" width="25px" height="25px"/>
                        <img src="../pic/settings-work-tool.png" width="25px" height="25px"/>&nbsp;
                  
                        </p>
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
                               &nbsp;| รายละเอียดคำสั่งซื้อ</p>
                      </div> 
                      
                </div>
                 <!-- -----------------------------header-------------------------------- -->
                <br> 
                <div class="container">
                <div class="row" >
                        <div class="col" style="background: #ECEDEF; padding-right: 15px"><br>
                            <p id="add" style="color:#8D8E8D;float:left;margin-left:19%;margin-bottom:-81px" >ที่อยู่จัดส่ง</p>
                            <table class="textbox" width=70%  cellpadding="10" >
                              <tr>
                                  <td >
                                    <p style="width:450px;word-wrap:break-word;text-align:left;margin:10px;margin-left:30px">
                                      <b>{{order[this.length].name}}</b><br>
                                      {{order[this.length].address}}</p>
                                  </td>
                              </tr>

                            </table>
                  <!-- ----------------------------------------ที่อยู่จัดส่ง---------------------------------------- -->
                            <div class="row" style="margin-left:-10px;color:#8D8E8D;">
                                <div class="col-sm-8" style="text-align:left;margin-right:-180px;margin-left:19%;margin-top:20px;margin-bottom:-30px">สินค้าทั้งหมด</div>
                                <div class="col-sm-1.5" style="margin-top:20px;margin-bottom:-30px">สถานะ</div>
                                <div class="col-sm-2" style="margin-top:20px;margin-bottom:-30px">คำสั่งซื้อ</div>
                            </div> 
                      <!-- ---------------------------------------ช่องสินค้า no1 ----------------------------------------       -->
                          <table width=70% class="textbox" cellpadding="10" style="margin-bottom:-20px">
                              
                            <tr v-for="item in product" :key="item">
                              <td style="width:20%">
                                <div  class="img-resize" style="border: 2px solid #959595  ;border-radius: 10px;float:right">
                                  <img :src="item.picture" />
                                  </div>
                                </td>
                              <td style="width:46%;text-align:left;">
                                {{item.productName}}<br>
                                {{item.category}}
                                </td>
                                <td style="width:13%">
                                  1 ชิ้น
                                </td>
                                <td style="width:auto">
                                    {{item.productPrice}} THB
                                </td>
                            </tr>
                          </table>

                            <!-- ---------------------------------- ปุ่มนานาชนิด -------------------------------------------- -->
                            <div class="cfmbtn">
                              <table>
                                <tr>
                                 <td> <button class="btn" type="button" id="reviewbutton" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">เขียนรีวิว</button> </td> 
                                <td>  <button class="btn" type="button" id="confirmbutton" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">ดูสถานะการส่งสินค้า</button> </td> 
                              <td>  <button class="btn" type="button" id="confirmbutton" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">แชทเลย</button></td> 
                                  </tr>
                              </table>
                            </div>

                            <!-- ------------------------------คำสั่งซื้อ------------------------------------ -->
                            <table width=70% class="textbox" cellpadding="10" >
                                <tr>
                                    <td><p style="text-align:left;margin:10px;margin-left:30px">
                                      <b style="font-size:20px">คำสั่งซื้อสินค้า#2105279762250</b>
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                      <b style="color:#C44953">สถานะ: กำลังจัดส่ง</b>
                                          <br>&nbsp;&nbsp;สั่งซื้อสินค้าวันที่: 7 ก.ย. 2561                 
                                          <br>&nbsp;&nbsp;ชำระเงินวันที่: 7 ก.ย. 2561</p>
                                          <hr style="width:400px;margin-left:20px;">
                                          <p style="text-align:left;margin:10px;margin-left:30px">&nbsp;&nbsp;ราคาสินค้ารวม: {{order[this.length].totalPrice}} THB 
                                          <br>&nbsp;&nbsp;ค่าส่ง: 0 THB 
                                          <br>&nbsp;&nbsp;รวมทั้งหมด: {{order[this.length].totalPrice}} THB
                                          </p>
                                    </td>
                                    
                                </tr> 
                              </table>
                             <!-- ------------------------------ยอดรวม------------------------------------ -->
                            
                              <br>
                              <br> <br> <br><br><br> 
 
 


                    </div>
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
            order: [],
            product: []
        }
    },
    methods: {
        ...mapActions(['clearIdCart']),
        getAllOrder: async function() {
        let order = await axios.get("http://localhost:5000/order/");  
        this.order = order.data;
        console.log(this.order);
        console.log(this.order.length);
        this.length = this.order.length-1;
        console.log(this.length);
        
       
        let listId = this.order[this.length].listProduct;
        let productId = [];
        
        while(listId.indexOf(',') != -1){
            productId.push( listId.substr( 0 , listId.indexOf(',') ))
            console.log("First:" +listId.substr( 0 , listId.indexOf(',') ))
            listId = listId.substr(listId.indexOf(',')+1 , listId.length)
            
        }
        console.log("last"+listId)
        productId.push(listId);
        console.log(productId)
        
        for(let i=0; i<productId.length; i++){ 
            let product = await axios.get('http://localhost:5000/productId/'+productId[i])
            this.product.push(product.data);
            this.totalPrice += product.data.productPrice;
        }
        console.log(this.product)
      }
    
    },
    mounted() {
      this.getAllOrder();
      this.clearIdCart();
    }

}
</script>
<style>
.textbox{
    border-width:3px !important;
    background: #ffffff;
    border-radius: 6px;
    box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);
    margin-left:180px;
    margin-top: 30px;

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
.cfmbtn{
  float: right;
  margin-right:15.8%; 
  margin-bottom: 18px;
  margin-top:27px;
}
</style>

