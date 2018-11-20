import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    isCartPage: true,
    cart: [],
    totalPrice: 0,
    userName: '',
    isConnected: false
  },
  mutations: {
    setIsConnected: (state,val) => {
      console.log(val)
      state.isConnected = val;
    },
    setUserName: (state, name) => {
      state.userName = name;
    },
    clearUserName: (state) => {
      state.userName = '';
    },
    inCartPage: (state) => {
      state.isCartPage = false;
    },
    notCartPage: (state) => {
      state.isCartPage = true;
    },
    addIdToCart: (state, productId) => {
      state.cart.push(productId);
    },
    deleteIdFromCart: (state, index) => {
      state.cart.splice(index,1);
    },
    clearIdCart: (state) => {
      state.cart = [];
    },
    setTotalPrice: (state,totalPrice) => {
      state.totalPrice = totalPrice;
    },
    resetTotalPrice: (state) => {
      state.totalPrice = 0;
    }
    
  },
  actions: {
    setIsConnected: ({commit},val) => {
      commit('setIsConnected',val)
    },
    setUserName: ({commit},name) => {
      commit('setUserName',name)
    },
    clearUserName: ({commit}) => {
      commit('clearUserName')
    },
    setTotalPrice: ({commit},totalPrice) => {
      commit('setTotalPrice',totalPrice)
    },
    resetTotalPrice: ({commit}) => {
      commit('resetTotalPrice');
    },
    inCartPage: ({commit}) => {
      commit('inCartPage')
    },
    notCartPage: ({commit}) => {
      commit('notCartPage')
    },
    addIdToCart: ({commit},productId) => {
      commit('addIdToCart',productId)
      console.log('Add: '+productId)
    },
    clearIdCart: ({commit}) => {
      commit('clearIdCart')
    },
    deleteIdFromCart: ({commit}, index) => {
      commit('deleteIdFromCart',index)
      console.log('Delete: '+index)
    }
  },
  getters: {
    getIsConnected: state => {
      return state.isConnected
    },
    getUserName: state => {
      return state.userName
    },
    getIsCartPage: state => {
      return state.isCartPage
    },
    getIdCart: state => {
      return state.cart
    },
    getCartLength: state => {
      return state.cart.length
    },
    getTotalPrice: state => {
      return state.totalPrice;
    }
  }
})
