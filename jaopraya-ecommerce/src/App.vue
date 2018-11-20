<template>
  <div id="app">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="all.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
    <div class="container-fluid" style="background: #ECEDEF;" >
                <div class="row" style="box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);" v-show="getIsCartPage">
                  <div class="col" style="background: #C44953;">
                    <router-link to="/">
                      <img src="./pic/logo.png" width="145px" height="100px" />
                    </router-link>
                  </div>
                  <div class="col-4" style="background: #C44953; padding-top: 50px;text-align: left;">
                        <div class="input-group mb-3" >
                                <input type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="button-addon2" v-model="searchKeyword">
                                <div class="input-group-append">
                                  <router-link :to="`/${searchKeyword}`">
                                    <button class="btn btn-secondary" type="button" id="button"><img src="./pic/magnifier.png" width="20px" height="20px"/></button>
                                  </router-link>
                                </div>
                              </div>
                  </div>
                  <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                     <div style="font-family: 'Kanit', sans-serif;">
                       <b  v-if="!getIsConnected" style="font-size:15px;color:#ffffff">WELCOME  &nbsp;|</b>
                       <b  v-if="getIsConnected" style="font-size:15px;color:#ffffff">{{name}}  &nbsp;|</b>
                     <facebook-login class="btn"
                          appId="266604957536014"
                          @login="onLogin"
                          @logout="onLogout"
                          @sdk-loaded="sdkLoaded" style="width:200px;margin-right:36px">
                     </facebook-login> 
                    
                      
                     </div>
                    
                      
                    <div class="iconMenu" style="color:#ffffff;font-family: 'Kanit', sans-serif;margin-top:1px">
                        <b style="background:#1A9F79;border: 1px solid #1A9F79  ;border-radius: 10px;box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, .5);position:absolute;right:122px;top:50px;">&nbsp;{{getCartLength}}&nbsp;</b>
                        
                        
                        
                        <router-link to='/cart/cart' v-if="isConnected">
                         <img src="./pic/shopping-cart.png" width="40px" height="40px"/> 
                        </router-link>
                        
                        
                       
                         <img src="./pic/shopping-cart.png" width="40px" height="40px" v-if="!isConnected"  @click="getAlert(true)" /> 
                          <div class="card" style="position:absolute;z-index:2;margin:50px;left:-80%;right:auto;top:185px;background:#ffffff;border:3px solid #EE8981;box-shadow: 3px 3px 4px 0px rgba(50, 50, 50, .5);border-radius: 10px;" v-if="alert" >
                            <p style="color:#000000;margin:50px;text-align:center;color:#EE8981;font-size:25px">
                              
                            <button class="btn" style="float:right;font-size:20px;color:#EE8981;margin-top:-43px;margin-right:-27px;background:#ffffff;" @click="getAlert(false)"><b>X</b></button>  
                              
                            <img src="./pic/exclamation-mark.png" width="150px" height="150px"/> <br><br>
                            <b>ล็อกอินก่อนดิสัส</b></p>
                        </div>  
                         
                         
                        <img src="./pic/notification.png" width="30px" height="30px"/>
                        
                        <img src="./pic/settings-work-tool.png" width="30px" height="30px"/>&nbsp;</div>
                  </div>
                </div>
                
                <div id="nav">
                  <!-- <router-link to="/about">About</router-link> -->
                </div>
                
                <router-view />
                
                

        </div>
  </div>
</template>

<script>
import facebookLogin from 'facebook-login-vuejs'
import {mapGetters, mapActions} from 'vuex'
export default {
  components:{
     facebookLogin
  },
  computed: {
    ...mapGetters(['getIsCartPage']),
    ...mapGetters(['getCartLength']),
    ...mapGetters(['getUserName']),
    ...mapGetters(['getIsConnected']),
  },methods: {  
    ...mapActions(['notCartPage']),
    ...mapActions(['setUserName']),
    ...mapActions(['setIsConnected']),
    getUserData() {
      this.FB.api('/me', 'GET', { fields: 'id,name,email' },
        userInformation => {
          this.personalID = userInformation.id;
          this.email = userInformation.email;
          this.name = userInformation.name;
          this.setUserName(this.name);
        }
      )
    },
    sdkLoaded(payload) {
      this.isConnected = payload.isConnected
      this.FB = payload.FB
      if (this.isConnected) this.getUserData()
    },
    onLogin() {
      // this.isConnected = true
      this.getUserData(),
      this.setIsConnected(true);
    },
    onLogout() {
      // this.isConnected = false;
      this.setIsConnected(false);
      FB.logout()
    },
    getAlert(p) {
      this.alert = p;
    }
  
  
  
  },
  data() {
    return{
      searchKeyword: '',
      // isConnected: false,
      name: '',
      email: '',
      personalID: '',
      pic: '',
      FB: undefined,
      alert: false
    }
  },
  mounted() {
      this.notCartPage();
      console.log("aa")
      if(getIsConnect){
        this.getUserData(),
      this.setIsConnected(true);
        
      }
  },
  
 
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
.information {
  margin-top: 100px;
  margin: auto;
  display: flex;
  flex-direction: column;
}

</style>
