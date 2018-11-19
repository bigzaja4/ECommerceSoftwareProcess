import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    isCartPage: true,
    cart: [],
    totalPrice: 0
  },
  mutations: {
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
