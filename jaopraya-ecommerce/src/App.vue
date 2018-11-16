<template>
  <div id="app">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="all.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
    <div class="container-fluid" style="background: #EAEAEA">
                <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);">
                  <div class="col" style="background: #C44953;">
                    <router-link to="/">
                      <img src="./pic/logo.png" width="145px" height="100px" />
                    </router-link>
                  </div>
                  <div class="col-6" style="background: #C44953; padding-top: 50px;text-align: left;">
                        <div class="input-group mb-3" v-show="getIsCartPage">
                                <input type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="button-addon2" v-model="searchKeyword">
                                <div class="input-group-append">
                                  <router-link :to="`/${searchKeyword}`">
                                    <button class="btn btn-secondary" type="button" id="button"><img src="./pic/magnifier.png" width="20px" height="20px"/></button>
                                  </router-link>
                                </div>
                              </div>
                  </div>
                  <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                    <p class="userName" ><img src="./pic/user-avatar-main-picture.png" width="35px" height="35px"/>&nbsp;&nbsp;<b>Prayut</b></p>
                    <div class="iconMenu" style="color:#ffffff;font-family: 'Kanit', sans-serif;">
                        <b style="background:#1A9F79;border: 1px solid #1A9F79  ;border-radius: 10px;box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, .5);position:absolute;right:118px;top:50px">&nbsp;{{getCartLength}}&nbsp;</b>
                        <router-link to='/cart/cart'>
                         <img src="./pic/shopping-cart.png" width="40px" height="40px"/> 
                        </router-link>
                        
                        <img src="./pic/notification.png" width="30px" height="30px"/>
                        
                        <img src="./pic/settings-work-tool.png" width="30px" height="30px"/></div>
                  </div>
                </div>
                <div id="nav">
                  <!-- <router-link to="/about">About</router-link> -->
                </div>
                <router-view/>
                
                

        </div>
  </div>
</template>

<script>
import {mapGetters, mapActions} from 'vuex'
import VueRouter from 'vue-router'
export default {
  computed: {
    ...mapGetters(['getIsCartPage']),
    ...mapGetters(['getCartLength'])
  },methods: {  
    ...mapActions(['notCartPage'])
  },
  data() {
    return{
      searchKeyword: '',
    }
  },
  mounted() {
      this.notCartPage();
      
  }
  
 
}
</script>


<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
.userName{
    color: white;
    font-size: 17px;
    padding-right: 20px;
}
.iconMenu{
    margin-top: -10px;
}
.text1{
    color: white;
    font-size: 30px;
    margin-top: -22px;
    font-family: 'Kanit', sans-serif;
}
.card-text{
    font-family: 'Kanit', sans-serif;
    margin-top: -15px;
}
.card-title{
    margin-top: -10px;
}
.sale{
    background: #C44953;
    color: #fff;
    font-family: 'Kanit', sans-serif;
    float: right;
}
.showPrice{
    color: #C44953;
    font-size: 18px; 
}

</style>
