<template>
  <div >
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
                <div class="container">

                
                <div class="row">
                        <div class="col" style="background: #ECEDEF; padding-right: 15px"><br>
                            <div><h3>รายละเอียดคำสั่งซื้อ</h3></div>
                            <div class="topic"><h6>ที่อยู่จัดส่งและออกใบเสร็จ</h6></div>
                            <table width=70% class="address" cellpadding="10" >
                              <tr>
                                  <td ><h6>ที่อยู่</h6> ชื่อ นางสาวคุณัญญา เทวรุ่งสัจจา  3/21 โครงการ the cube (ประชาอุทิศ) อาคารB ชั้น3 ซ.ประชาอุทิศ37 
                                  <br>แขวงราษฎร์บูรณะ เขตราษฎร์บูรณะ กรุงเทพมหานคร 10140 </td>
                              </tr>

                            </table>
                            <div class="topicproduct"><h6>สินค้า</h6></div>
                            <table width=70% class="textbox" cellpadding="10">
                              <tr>
                                <th>สินค้าทั้งหมด&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                </th>
                                <th>สถานะ</th>
                                <th>คำสั่งซื้อ</th>
                              </tr>
                            </table>
                          <table width=70% class="textbox" cellpadding="10">
                              
                            <tr>
                              <td><img src="pic/nike.png" width="170px" height="100px" style="border: 3px solid #C44953"/></td>
                              <td>NIKE Repel<br>เสื้อเจ็คเก๊ตสำหรับผู้หญิง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                <td>
                                  1 ชิ้น
                                </td>
                                <td>
                                    2,900 THB
                                </td>
                            </tr>
                          </table>
                          <table width=70% class="textbox" cellpadding="10">
                            
                              <tr>
                                <td style="border :10px"><img src="pic/nike.png" width="170px" height="100px" style="border: 3px solid #C44953"/></td>
                                <td >NIKE Epic La<br>กางเกงวิ่งรัดรูปผู้หญิง &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                <td>
                                    1 ชิ้น
                                </td>
                                <td>
                                    3,700 THB
                                </td>
                              </tr>
                            </table>
                            <div class="cfmbtn">
                              <table>
                                <tr>
                                 <td> <button type="button" id="reviewbutton" >เขียนรีวิว</button> </td> 
                                <td>  <button type="button" id="confirmbutton" >ดูสถานะการส่งสินค้า</button> </td> 
                              <td>  <button type="button" id="confirmbutton" >แชทเลย</button></td> 
                                  </tr>
                              </table>
                            </div>
                            <table width=70% class="textbox" cellpadding="10" >
                                <tr>
                                    <td ><h6>คำสั่งซื้อสินค้า#2105279762250</h6>สั่งซื้อสินค้าวันที่: 7 ก.ย. 2561 <br>ชำระเงินวันที่: 7 ก.ย. 2561</td>
                                </tr> 
                              </table>
                              <table width=70% class="textbox" cellpadding="10" >
                                  <tr>
                                      <td >ราคาสินค้ารวม<br>ค่าส่ง<br>รวมทั้งหมด</td>
                                      <td >6,600THB<br>100THB<br>6,700THB</td>
                                  </tr> 
                                  
                                </table>
                              <br>
                              <br> <br> <br> <br> <br> <br> 


                    </div>
                </div>
              </div>
        </div>

  
</template>