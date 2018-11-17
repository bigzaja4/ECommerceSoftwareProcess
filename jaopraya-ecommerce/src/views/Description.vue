<template>
    <div class="description">  
      <div  class="row px-3 " style="margin-top:-30px">
        <h3 style="margin-left:150px;font-size:18px;color:#8D8E8D;margin-bottom:5px">ข้อมูลสินค้า</h3> 
      </div>
    <div  class="row px-3 ">
      <div class="col-10 offset-1 borderR " style="border-width:3px !important;background: #ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);"> 
        <div class="row" style="margin-left:20px">
          <div style="margin: 30px;" class="col-4 " >
            <div class="img-resize" style="border: 2px solid #8D8E8D  ;border-radius: 10px;">
              <img
                :src="description.picture" 
              >
              
            
            </div>
          </div>
          <div class="col" style="margin-left:30px">
            <br><br>
            <h1 style="text-align:left;font-size:30px;width:400px;word-wrap:break-word;margin-top:12px">{{product.productName}}</h1>
            
            
            <div class="cutText" style="text-align:left;width:500px;margin-top:-8px">{{product.category}}</div><br>
            
            <p style="text-align:left;font-size:30px;color:#C44953;margin-top:-10px">  <Blink><b>&nbsp;&nbsp;&nbsp;{{product.productPrice}}</b></Blink>  บาท</p>
           <hr style="width:400px;margin-left:0px;margin-bottom:20px">
            <div style="text-align:left;">
            <div class="dropdown" style="margin-bottom:5px">
               &nbsp;ตัวเลือกสินค้า &nbsp;
                <button class="btn btn-sm btn-outline-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                  ขนาด
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                  <a class="dropdown-item" href="#">ไซส์ S</a>
                  <a class="dropdown-item" href="#">ไซส์ M</a>
                  <a class="dropdown-item" href="#">ไซส์ L</a>
                </div>
            </div>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; จำนวน &nbsp; 
                <input type="number" style="width:50px;border-radius: 5px">
                &nbsp; มีสินค้าทั้งหมด {{description.stockQuantity}} ชิ้น
            
            
        
            <br>
            <br>
            <button type="button" class="btn btn-danger">เพิ่มไปยังรถเข็น</button>&nbsp;
            <button type="button" class="btn btn-danger">ซื้อสินค้า</button>
            </div>
          </div>
        </div>
      </div>
    </div>

    <br>
    <!-- ----------------------------------------------- -->
    <h3 style="text-align:left;margin-left:150px;font-size:18px;color:#8D8E8D;margin-bottom:5px">รายละเอียดสินค้าเพิ่มเติม</h3>
    
    <div class="row px-3 ">
      <div class="col-10 offset-1  borderR" style="border-width:3px !important;background: #ffffff;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">
        <div class="row">
          <div style="margin: 30px;" class="col-4 ">
            <div style="text-align:left;margin-left:40px"> 
              <table>
                <tr>
                  <td style="vertical-align:top;width:60px"><b>Detail :</b></td><td> {{description.descriptionDetail}}</td> 
                </tr>
                  <tr>
              <td style="vertical-align:top;width:60px"><b>Color :</b></td> <td>{{description.productColor}}</td> 
              </tr>
              <tr>
              <td style="vertical-align:top;width:60px"><b>Size :</b></td> <td>{{description.size}}</td>
              </tr>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br><br><br><br>
  </div>
</template>

<script>
import axios from "axios";  
axios.defaults.withCredentials = false; 
export default {
  data() {
    return {
        description: {},
        product: {},
        id: ''
    };
  },
  props: {
    id: ''
  },
  name: "Description",
  methods: {
      getDescription: async function() {
      let description = await axios.get('http://localhost:8099/description/'+this.id)
      this.description = description.data
      console.log(this.description)
    },
      getProduct: async function(){
      let product = await axios.get('http://localhost:8099/product/'+this.id)
      this.product = product.data
      console.log(this.product)
      }

  },
  mounted() {
      this.getDescription();
      this.getProduct();
  },
};
</script>

<style>
.description{
    font-family: 'Kanit', sans-serif;
  }
.borderR{
  border: 2px solid #ffffff;
  border-radius: 10px;
}
.cutText{
word-wrap:break-word;
}
div.img-resize img {
  width: 360px;
  height: auto;
  
  
} 

div.img-resize {
  width: 360px;
  height: 360px;
  overflow: hidden;
  text-align: center;
  vertical-align:middle;
}
</style>
