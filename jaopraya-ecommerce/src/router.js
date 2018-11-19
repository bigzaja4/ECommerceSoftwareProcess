import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
// import test from './views/23.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/:searchKey',
      name: 'home',
      component: Home
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/item/description/:id',
      name: 'description',
      component: () => import('./views/Description.vue'),
      props: true
    },
    {
      path: '/cart/cart',
      name: 'cart',
      component: () => import('./views/Cart.vue')
    },
    {
      path: '/cart/payment',
      name: 'payment',
      component: () => import('./views/Order.vue')
    },
    {
      path: '/cart/Order',
      name: 'payment',
      component: () => import('./views/OrderDetail.vue')
    },
    {
      path: '/cart/login',
      name: 'login',
      component: () => import('./views/login.vue')
    }

  ]
})
