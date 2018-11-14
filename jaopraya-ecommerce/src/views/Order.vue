<template>
  <div id="app">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="all.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
  
    <div class="container-fluid" style="background: #ECEDEF;">
                <div class="row" style="">
                  <div class="col" style="background: #C44953;">
                    <img src="./pic/logo.png" width="145px" height="100px" />
                  </div>
                  <!-- <div class="col-6" style="background: #C44953; padding-top: 50px;text-align: left;">
                        <div class="input-group mb-3">
                                <input type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="button-addon2" v-model="searchKeyword">
                                <div class="input-group-append">
                                  <router-link :to="`/${searchKeyword}`">
                                    <button class="btn btn-secondary" type="button" id="button"><img src="./pic/magnifier.png" width="20px" height="20px"/></button>
                                  </router-link>
                                </div>
                              </div>
                  </div> -->
                  <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                    <p class="userName" ><img src="./pic/user-avatar-main-picture.png" width="35px" height="35px"/>&nbsp;&nbsp;<b>Prayut</b></p>
                    <div class="iconMenu">
                        <img src="./pic/shopping-cart.png" width="40px" height="40px"/>
                        <img src="./pic/notification.png" width="30px" height="30px"/>
                        <img src="./pic/settings-work-tool.png" width="30px" height="30px"/></div>
                  </div>
                </div>
                <div id="nav">
                  <!-- <router-link to="/about">About</router-link> -->
                </div>
                <router-view/>
        </div>
 <div class="row">
                  <div class="col" style="background: #C44953; padding-right: 15px">
                    <img src="pic/logo.png" width="145px" height="100px"/>
                  </div>
                  <div class="col-6" style="background: #C44953; padding-top: 50px;text-align: left;">
                        <div class="input-group mb-3">
                                <input type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="button-addon2">
                                <div class="input-group-append">
                                  <button class="btn btn-secondary" type="button" id="button"><img src="pic/magnifier.png" width="20px" height="20px"/></button>
                                </div>
                              </div>
                  </div>
                  <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                    <p class="nameUser" ><img src="pic/user-avatar-main-picture.png" width="35px" height="35px"/>&nbsp;&nbsp;<b>Prayut</b></p>
                    <div class="iconMenu">
                        <img src="pic/shopping-cart.png" width="40px" height="40px"/>
                        <img src="pic/notification.png" width="30px" height="30px"/>
                        <img src="pic/settings-work-tool.png" width="30px" height="30px"/></div>
                  </div>
                </div>
                         
                <div class="row">
                        <div class="col" style="background: #ECEDEF; padding-right: 15px">
                          <br><h1>ทำการสั่งซื้อ</h1>
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
                            <p>วิธีการชำระเงิน</p>
                        <div class="howto-checkout">
                          <button type="button" onclick="inputCreditCard()">Credit Card</button><br>
                          
                            <span id="demo">
                            <form action="/action_page.php">
                              <!-- First name:<br> -->
                              
                              <br><span id="namename"></span>
                              <input type="text" name="firstname" id="name" value="" style="visibility: hidden">
                              <br><br>
                              <!-- Last name:<br> -->

                              <span id="numCard"></span>
                              <input type="text" name="lastname" id="numOfCard" maxlength="16" value="" style="visibility: hidden">
                              <br><br>

                              <span id="typeCard"></span>                   
                              <button type="button" onclick="hideForm()" id="typeVISA" style="visibility: hidden">VISA</button>
                              <button type="button" onclick="hideForm()" id="typeMC" style="visibility: hidden">MASTER CARD</button>
                              <br><br>

                              <span id="expire-date"></span>
                              <input type="text" name="lastname" id="expDate" value="" style="visibility: hidden">
                              <br><br>

                              <span id="cvvNum"></span>
                              <input type="text" name="lastname" id="cvv" maxlength="3" value="" style="visibility: hidden">
                              <br><br>

                              <span id= "content-form">
                              <button type="button" onclick="hideForm()" id="buttonHide" style="visibility: hidden">Hide</button>                         
                              </span>
                            </span>
                        <div class="checkout">
                        <br><button type="button" id="button-checkout">สั่งสินค้า</button>
                        </div>  
                        </div>
                </div>
</template>          
      
        <script>
            function inputCreditCard() { 
              document.getElementById("namename").innerHTML = "ชื่อที่ปรากฎบนบัตร";
              document.getElementById("name").style.visibility = 'visible';    
              document.getElementById("numCard").innerHTML = "หมายเลขบัตร";
              document.getElementById("numOfCard").style.visibility = 'visible';    
              document.getElementById("expire-date").innerHTML = "วันหมดอายุ";
              document.getElementById("expDate").style.visibility = 'visible'; 
              document.getElementById("cvvNum").innerHTML = "CVV";
              document.getElementById("cvv").style.visibility = 'visible'; 
              document.getElementById("typeCard").innerHTML = "ประเภทของบัตร";
              document.getElementById("typeVISA").style.visibility = 'visible'; 
              document.getElementById("typeMC").style.visibility = 'visible'; 
              document.getElementById("buttonHide").style.visibility = 'visible';
            }      

            function hideForm() {
            document.getElementById("demo").style.visibility = "hidden";
            document.getElementById("namename").style.visibility = "hidden";
              document.getElementById("name").style.visibility = "hidden";    
              document.getElementById("numCard").style.visibility = "hidden";  
              document.getElementById("numOfCard").style.visibility = "hidden";      
              document.getElementById("expire-date").style.visibility = "hidden";  
              document.getElementById("expDate").style.visibility = "hidden";  
              document.getElementById("cvvNum").style.visibility = "hidden";  
              document.getElementById("cvv").style.visibility = "hidden"; 
              document.getElementById("typeCard").style.visibility = "hidden";  
              document.getElementById("typeVISA").style.visibility = "hidden"; 
              document.getElementById("typeMC").style.visibility = "hidden"; 
              document.getElementById("buttonHide").style.visibility = 'hidden';
            }
      </script>

<style>
      .nameUser{
    color: white;
    font-size: 17px;
    padding-right: 20px;
}
.iconMenu{
    margin-top: -10px;
}

#box-address{
    padding-left :5px;
    padding-top: 10px;
    border: 3px  solid #C44953;
    margin-left: 150px;
    margin-right: 150px;
}

.howto-checkout{
    padding :15px; 
    border :  3px;
    border-color: #C44953;
    border-style: solid;
    margin-left: 150px;
    margin-right: 150px;
}

.content-row{
    height: 350px;
    font-weight: 500px;
    border :  3px;
    border-color: #C44953;
    border-style: solid;
}
h1{
    margin-left: 100px;
}

p {
    margin-left: 140px;
}

.row  #topic-product{
    margin-left: 20px;
}

.row .col .row{
    margin-left: 130px;
    margin-right: 50px;
}

.content-row{
    margin-left: 150px;
    margin-right: 150px;

}

#button-checkout{
    font-size: 18px;
    color: aliceblue;
    margin-left: 1120px;
    background-color: #C44953;
    
}

.total-row{
    border-top: 3px  solid #C44953;
    height: 80px;
    margin-top: 210px;
}

.text-total{
    position: absolute;
    right: 300px;
    margin-top: 10px;
}

</style>