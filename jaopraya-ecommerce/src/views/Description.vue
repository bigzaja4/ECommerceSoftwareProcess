<template>
    <div class="description">  
        <h3>ข้อมูลสินค้า</h3> 
    <div  class="row px-3 py-3">
      <div class="col-10 offset-1 border border-danger" style="border-width:3px !important"> 
        <div class="row">
          <div style="margin: 50px;" class="col-4 " >
            <div>
              <img
                src="pic/nikerepel.png"
                width="200px"
                height="150px"
                style="border: 3px solid #C44953"
              >
              <br><br>
              <img
                src="pic/nikerepel2.png"
                width="50px"
                height="50px"
                style="border: 3px solid #C44953"
              >
              <img
                src="pic/nikerepel3.png"
                width="50px"
                height="50px"
                style="border: 3px solid #C44953"
              >
              <img
                src="pic/nikerepel2.png"
                width="50px"
                height="50px"
                style="border: 3px solid #C44953"
              >
            </div>
          </div>
          <div class="col">
            <h1>Nike Repal</h1>
            <br />
            เสื้อแจ๊กเก็ตวิ่งผู้หญิง<br />
            2900 THB <br />
            <br>
            <div class="dropdown">
                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  ตัวเลือกสินค้า
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                  <a class="dropdown-item" href="#">S</a>
                  <a class="dropdown-item" href="#">M</a>
                  <a class="dropdown-item" href="#">L</a>
                </div>
              
            </div>
            <br>
            จำนวน &nbsp; {{description.stockQuantity}} &nbsp;
            <input type="number" style="width:50px">
            <br>
            <br>
            <button type="button" class="btn btn-danger">เพิ่มไปยังรถเข็น</button>
            <button type="button" class="btn btn-danger">ซื้อสินค้า</button>
          </div>
        </div>
      </div>
    </div>

    <br>
    &nbsp;<h3>รายละเอียดสินค้าเพิ่มเติม</h3>
    
    <div class="row px-4 py-4">
      <div class="col-10 offset-1 border border-danger" style="border-width:3px !important">
        <div class="row">
          <div style="margin: 50px;" class="col-4 ">
            <div>
              Detail: {{description.descriptionDetail}
              ยี่ห้อ <br>
              วัสดุภายนอก<br>
              รูปแบบ
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";  
axios.defaults.withCredentials = true; 
export default {
  data() {
    return {
        description: {},
        id: ''
    };
  },
  props: {
    id: ''
  },
  name: "Description",
  methods: {
      getDescription: async function() {
      let desciption = await axios.get('http://localhost:8099/description/'+this.id)
      this.description = desciption.data
      console.log(this.description)
    }
  },
  mounted() {
      this.getDescription();
  }
};
</script>
