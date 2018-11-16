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
  </div>
</template>

<script>
import {mapGetters, mapActions} from 'vuex'
export default {
  computed: {
    ...mapGetters(['getIsCartPage'])
  },methods: {  
    ...mapActions(['inCartPage'])
  },
  mounted() {
      this.inCartPage();
      
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