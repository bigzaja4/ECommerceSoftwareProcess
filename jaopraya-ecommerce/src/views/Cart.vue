<template>
  <div class="container">
                <div class="row">
                        <div class="col" style="background: #ECEDEF; padding-right: 15px"><br>
                            <div class="topic"><h3>รถเข็น</h3></div>
                            <table width=70% class="textbox" cellpadding="10" >
                              <tr>
                                  <td >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;รายการสินค้าทั้งหมด&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                
                                  <td>ราคาต่อชิ้น</td>
                                  <td>จำนวน</td>
                                  <td>ราคารวม</td>
                                  <td>แอคชั่น</td>
                                  
                              </tr>

                            </table>
                        <div v-for="item in product" :key="item">
                          <table width=70% class="textbox" cellpadding="10">
                            <tr>
                              <td>
                                 <input type='checkbox' name='btn' id='btn'  onclick='check_agree();'/>
                              </td>
                              <td><img :src="`${item.picture}`" width="170px" height="100px" style="border: 3px solid #C44953"/></td>
                              <td>{{item.productName}}<br>{{item.category}}</td>
                                <td>
                                  {{item.productPrice}} THB
                                </td>
                                <td>
                                  <table border="0px">
                                    <tr>
                                        1
                                      <!-- <input type="number" style="width: 50px" v-model="quantity"> -->
                                    </tr>
                                  </table>
                                </td>
                                <td>
                                    {{item.productPrice}} THB
                                </td>
                                <td>
                                    <button type="button" id="deletebutton">ลบ</button>
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
                                 
                                    <td>รวมราคาสินค้า(6สินค้า)&nbsp;&nbsp;&nbsp;&nbsp;6,600 THB</td>
                                </tr>
                              </table>
                              <br>
                              <div class="cfmbtn">
                              <button type="button" id="confirmbutton" @click="clearIdCart()">ล้างตระกร้าสินค้า</button>
                              <br>
                              <button type="button" id="confirmbutton" >ยืนยันการสั่งซื้อสินค้า</button>
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
    border:10px solid #C44953;
    margin-left:180px;
    margin-top: 30px;

}
.cfmbtn{
    width: 200px;
  margin: 0 auto; 
}
</style>