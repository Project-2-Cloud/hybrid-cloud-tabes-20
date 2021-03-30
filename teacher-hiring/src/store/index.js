import Vue from 'vue'
import Vuex from 'vuex'
import createPersistedState from "vuex-persistedstate";

Vue.use(Vuex)

const url = "http://localhost:8000/index";
const headers = { Accept: "application/json" };

export default new Vuex.Store({
  plugins: [createPersistedState()],
  state: {
    teachers: [],
    inCart: [],
    user: {
      isAuthenticated: false,
      name: "",
      email: "",
      idToken: ""
    },
    endpoints: {
      login: "http://localhost:3000/login"
    },
   },
   getters: {
    teachers: state => state.teachers,
    inCart: state => state.inCart,
   },
   mutations: { //synchronous
     setTeachers(state, payload) {
       state.teachers = payload;
     },
     addToCart(state, payload) { 
      console.log(payload);
      state.inCart.push(payload);
     },
     removeFromCart(state, item) { 
       state.inCart.splice(item, 1); 
     },
     logout(state) {
      state.user.isAuthenticated = false;
      state.user.name = "";
      state.user.email ="";
      state.user.idToken ="";
     },
     login(state, payload) {
      state.user.isAuthenticated = true;
      state.user.name = payload.name;
      state.user.email =payload.email;
      state.user.idToken =payload.idToken;
     },
   },
   actions: { //asynchronous
     async getTeachers(state) {
       const teachers = await fetch(url, { headers });
       const prods = await teachers.json();
       state.commit("setTeachers", prods);
       console.log(prods);
     }
   },
  modules: {
  }
})
