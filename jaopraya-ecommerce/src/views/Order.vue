<template>
  <div id="23">
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
                     <!-- <div class="col" style="background: #6D5F69; padding-top: 50px;">
                        <img src="../pic/logo.png" width="125px" height="80px"/>
                      </div> -->
                     
                      <div class="col" style="background: #6D5F69; padding-top: 50px;">
                          <p class="text1" style="float:left;margin-left:230px"> 
                              <router-link to="/">
                              <img src="../pic/logo.png" width="125px" height="auto"/>
                              </router-link>
                               &nbsp;| ทำการสั่งซื้อ</p>
                      </div> 
                      
                </div>
                <br>            
    <div class="row">
        <div class="col" style="background: #ECEDEF; padding-right: 15px">
              <div class="address"><br>
                  <p id="add">ที่อยู่จัดส่ง</p>
                  <div class="border-row">
                      <div id="box-address">
                          <p>3/21 โครงการ the cube (ประชาอุทิศ) อาคารB ชั้น3 ซ.ประชาอุทิศ37 <br> 
                                      แขวงราษฎร์บูรณะ เขตราษฎร์บูรณะ กรุงเทพมหานคร 10140</p>
                      </div>
                  </div>
                  <br>
                              
                  <div class="row">
                      <div class="col-sm-8">รายการสินค้า</div>
                      <div class="col-sm-1.5">ราคาต่อหน่วย</div>
                      <div class="col-sm-1">จำนวน</div>
                      <div class="col-sm-1">ราคารวม</div>
                  </div> 
                  <div class="content-row">
                      <table style="width:100%" >
                                            <tr>
                                              <td></td>
                                              <td></td>
                                              <td></td>
                                              <td></td>
                                            </tr>
                                            <tr>
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                              </tr>
                                        </table>
                                  <div class="total-row">
                                      <span class="text-total">
                                      <p>ราคาสินค้ารวม </p>
                                      <p>ค่าจัดส่ง</p>
                                      <p>รวมทั้งหมด </p>
                                    </span>
                                  </div>
                   </div>
               </div><br>
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
        ...mapActions(['inCartPage']),
        ...mapActions(['notCartPage'])
        
    },
    mounted() {
        this.inCartPage();
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
  border-color: #c44953;
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
  border-top: 3px solid #c44953;
  height: 80px;
  margin-top: 210px;
}

.text-total {
  position: absolute;
  right: 300px;
  margin-top: 10px;
}
</style>