import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    count: 0,
    isCartPage: true,
    cart: []
  },
  mutations: {
    addCount: (state, amount) => {
      state.count += amount
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
    }
    
  },
  actions: {
    addCount: ({ commit },amount) => {
      commit('addCount',amount)
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
    getCount: (state) => {
       return state.count
    },
    getIsCartPage: state => {
      return state.isCartPage
    },
    getIdCart: state => {
      return state.cart
    },
    getCartLength: state => {
      return state.cart.length
    }
  }
})
