<template>
  <!-- <div class="container">
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
                </div> -->
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
                          <table width=70% class="textbox" cellpadding="10">
                              
                            <tr>
                              <td>
                                 <input type='checkbox' name='btn' id='btn'  onclick='check_agree();'/>
                              </td>
                              <td><img src="pic/nike.png" width="170px" height="100px" style="border: 3px solid #C44953"/></td>
                              <td>NIKE Repel<br>เสื้อเจ็คเก๊ตสำหรับผู้หญิง</td>
                                <td>
                                  2,900 THB
                                </td>
                                <td>
                                  <table border="1px">
                                    <tr>
                                      <input type="number" style="width: 50px" >
                                    </tr>
                                  </table>
                                </td>
                                <td>
                                    2,900 THB
                                </td>
                                <td>
                                    <button type="button" id="deletebutton">ลบ</button>
                                </td>
                            </tr>
                          </table>
                          <table width=70% class="textbox" cellpadding="10">
                              <tr>
                                  <td>
                                      <input type='checkbox' name='btn' id='btn'  onclick='check_agree();'/>
                                   </td>
                                <td style="border :10px"><img src="pic/nike.png" width="170px" height="100px" style="border: 3px solid #C44953"/></td>
                                <td >NIKE Epic La<br>กางเกงวิ่งรัดรูปผู้หญิง&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                <td>
                                    3,700 THB
                                </td>
                                <td>
                                <table border="1px">
                                    <tr>
                                        <input type="number" style="width: 50px" >
                                    </tr>
                                  </table>
                                </td>
                                <td>
                                    3,700 THB
                                </td>
                                <td>
                                    <button type="button" id="deletebutton">ลบ</button>
                                </td>
                              </tr>
                            </table>
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
                              <button type="button" id="confirmbutton" >ยืนยันการสั่งซื้อสินค้า</button>
                              </div>
                              <br> <br> <br> <br> <br> <br> 


                    </div>
                </div>

        
</template>
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