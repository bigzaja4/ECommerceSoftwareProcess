<template>
  <div id="23" class="container-fluid" style="font-family: 'Kanit', sans-serif;background: #ECEDEF;">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="all.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">

    <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);margin-top:-60px;margin-left:-30px;margin-right:-30px" >
      <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                    <p class="userName" style="margin-top:5px;margin-bottom:7px" >
                        <img src="../pic/notification.png" width="25px" height="25px"/>
                        <img src="../pic/settings-work-tool.png" width="25px" height="25px"/>&nbsp;
                  
                        <img src="../pic/user-avatar-main-picture.png" width="35px" height="35px"/>&nbsp;&nbsp;<b>Prayut</b></p>
                    </div>
    </div>    
    <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);margin-left:-30px;margin-right:-30px">
                     
                      <div class="col" style="background: #6D5F69; padding-top: 50px;">
                          <p class="text1" style="float:left;margin-left:230px"> 
                              <router-link to="/">
                              <img src="../pic/logo.png" width="125px" height="auto"/>
                              </router-link>
                               &nbsp;| ทำการสั่งซื้อ</p>
                      </div> 
                      
                </div>
                <br>  

                <!-- -----------------------header--------------------------------           -->
    <div class="row">
        <div class="col" style="background: #ECEDEF; padding-right: 15px">
              <div class="address"><br><br>
                  <p id="add" style="color:#8D8E8D;float:left;margin-top:-29px;margin-left:14%" >ที่อยู่จัดส่ง</p>
                  <div class="border-row">
                      <div id="box-address" style="border:3px solid #ffffff !important;background: #ffffff;border-radius: 6px;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">
                          <p style="width:700px;word-wrap:break-word;text-align:left">3/21 โครงการ the cube (ประชาอุทิศ) อาคารB ชั้น3 ซ.ประชาอุทิศ37 <br> 
                                      แขวงราษฎร์บูรณะ เขตราษฎร์บูรณะ กรุงเทพมหานคร 10140</p>
                      </div>
                  </div>
                  <br>
                  <div class="row" style="margin-left:-0.5%;color:#8D8E8D;">
                      <div class="col-sm-8" style="text-align:left;margin-left:14%;margin-right:-180px;margin-top:-3px">รายการสินค้า</div>
                      <div class="col-sm-1.5" style="margin-top:-3px">ราคาต่อชิ้น</div>
                      <div class="col-sm-1" style="margin-top:-3px">จำนวน</div>
                      <div class="col-sm-1" style="margin-top:-3px">ราคารวม</div>
                  </div> 
                  <div class="row" style="width:76.5%;margin-left:12%;border:3px solid #ffffff !important;background: #ffffff;border-radius: 6px;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">
                      <table style="width:100%" >
                                            <tr v-for="item in product" :key="item" >
                                                <td style="width:13%;margin:2px"><div class="img-resize" style="float:right;border-radius: 6px;border:1px solid"><img :src="`${item.picture}`" >&nbsp;&nbsp;&nbsp;</div></td>
                                                <td style="width:52%;text-align:left;">&nbsp;&nbsp;{{item.productName}}</td>
                                                <td style="width:13%;">1</td>
                                                <td style="width:13p%;">1</td>
                                                <td style="width:auto;">{{item.productPrice}}</td>
                                              </tr>
                                        </table>
                                  <div class="" style="">
                                      <hr>
                                      <span class="text-total" style="">
                                      <p style="text-align;right">ราคาสินค้ารวม {{this.getTotalPrice}}</p> 
                                      <p style="margin-top:-18px;text-align;right">ค่าจัดส่ง 0 THB</p>
                                      <p style="margin-top:-10px;text-align;right">รวมทั้งหมด {{this.getTotalPrice}} THB</p>
                                    </span>
                                  </div>
                   </div>
               </div>
               <br>
               <div style="float:right;margin-right:11.5%">
               <button class="btn" @click="payCard()" type="button" id="confirmbutton" style="background:#C44953;color:#ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);"> 
                  สั่งซื้อสินค้า  
                </button>
               </div>
              <br><br><br><br>
            </div>
        </div>
  </div>
</template>          
  
<script>
import {mapGetters, mapActions} from 'vuex'
import axios from "axios";  
axios.defaults.withCredentials = true;

axios.defaults.withCredentials = true;
export default {
    data() {
        return {
            product: [],
            totalPrice: 0,

        }
    },
    computed: {
        ...mapGetters(['getIsCartPage']),
        ...mapGetters(['getIdCart']),
        ...mapGetters(['getTotalPrice']),
    },methods: {  
        ...mapActions(['inCartPage']),
        ...mapActions(['notCartPage']),
        payCard: async function(){
          OmiseCard.open({
            frameLabel: 'Esimo',
            frameDescription: 'Invoice #3847',
            amount: this.getTotalPrice*100,
            onCreateTokenSuccess: (token) => {
              /* Your code, e.g., submit form or send ajax request to server */
              axios({
                method: 'post',
                url: 'http://localhost:5000/Payment',
                data: {
                  token: token,
                  totalPrice: 12345
                }
              }).then(rest=>console.log(rest))
            },
            onFormClosed: () => {
              /* Your handler when form was closed */
            },
          })
        },
        addItemToCart: async function() {
            let productId = this.getIdCart;
            for(let i=0; i<productId.length; i++){ 
                let product = await axios.get('http://localhost:5000/productId/'+productId[i])
                this.product.push(product.data);
                this.totalPrice += product.data.productPrice;
            }
            console.log(this.product)
        }
        
    },
    mounted() {
        console.log("total: "+this.getTotalPrice)
        this.inCartPage();
        this.addItemToCart();
        OmiseCard.configure({
          publicKey: 'pkey_test_5dz2dxgy2mdrk7e7zhx',
          amount: this.getTotalPrice
        });
    }   
}
</script>      

<style>
.nameUser {
  color: white;
  font-size: 17px;
  padding-right: 20px;
}
.iconMenu {
  margin-top: -10px;
}

#box-address {
  padding-left: 5px;
  padding-top: 10px;
  border: 3px solid #c44953;
  margin-left: 150px;
  margin-right: 150px;
}

.howto-checkout {
  padding: 15px;
  border: 3px;
  border-color: #c44953;
  border-style: solid;
  margin-left: 150px;
  margin-right: 150px;
}

.content-row {
  height: 350px;
  font-weight: 500px;
  border: 3px;
  border-color: #ECEDEF;;
  border-style: solid;
}
h1 {
  margin-left: 100px;
}

p {
  margin-left: 140px;
}

.row #topic-product {
  margin-left: 20px;
}

.row .col .row {
  margin-left: 130px;
  margin-right: 50px;
}

.content-row {
  margin-left: 150px;
  margin-right: 150px;
}

#button-checkout {
  font-size: 18px;
  color: aliceblue;
  margin-left: 1120px;
  background-color: #c44953;
}

.total-row {
  /* border-top: 3px solid #ECEDEF;; */
  /* height: 80px;
  margin-top: 210px; */
}

/* .text-total {
  position: absolute;
  right: 300px;
  margin-top: 10px;
} */
.textbox{
    border-width:3px !important;
    background: #ffffff;
    border-radius: 6px;
    box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);
    margin-left:180px;
    margin-top: 30px;

}
div.img-resize img {
  width: 80px;
  height:auto;
} 

div.img-resize {
  width: 80px;
  height: 80px;
  overflow: hidden;
  text-align: center;
}
</style>