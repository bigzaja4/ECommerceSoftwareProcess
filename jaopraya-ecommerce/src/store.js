import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    count: 0,
    isCartPage: true
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
    }
  },
  getters: {
    getCount: (state) => {
       return state.count
    },
    getIsCartPage: state => {
      return state.isCartPage
    }
  }
})
