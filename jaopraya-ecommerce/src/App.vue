<template>
  <div id="app">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="homePage.css" rel="stylesheet" type="text/css" />
  
    <div class="container">
                <div class="row">
                  <div class="col" style="background: #C44953; padding-right: 15px">
                    <img src="./pic/logo.png" width="145px" height="100px"/>
                  </div>
                  <div class="col-6" style="background: #C44953; padding-top: 50px;text-align: left;">
                        <div class="input-group mb-3">
                                <input type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="button-addon2">
                                <div class="input-group-append">
                                  <button class="btn btn-secondary" type="button" id="button"><img src="./pic/magnifier.png" width="20px" height="20px"/></button>
                                </div>
                              </div>
                  </div>
                  <div class="col" style="background: #C44953; padding-top: 5px;padding-right: 30px; text-align: right;">     
                    <p class="nameUser" ><img src="./pic/user-avatar-main-picture.png" width="35px" height="35px"/>&nbsp;&nbsp;<b>Prayut</b></p>
                    <div class="iconMenu">
                        <img src="./pic/shopping-cart.png" width="40px" height="40px"/>
                        <img src="./pic/notification.png" width="30px" height="30px"/>
                        <img src="./pic/settings-work-tool.png" width="30px" height="30px"/></div>
                  </div>
                </div>
                <div id="nav">
                  <router-link to="/">Home</router-link> |
                  <router-link to="/about">About</router-link>
                </div>
                <router-view/>
                
                

        </div>
  </div>
</template>

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
</style>
