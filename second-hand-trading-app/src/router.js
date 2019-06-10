import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import detail from './components/detail.vue'
import login from './components/login.vue'
import register from './components/register.vue'
import addGoods from './components/addGoods.vue'
import mycenter from './components/mycenter.vue'

Vue.use(Router)

export default new Router({
  // mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
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
      path: '/detail',
      name: 'detail',
      component: detail
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
          path: '/register',
          name: 'register',
          component: register
    },
    {
      path: '/addGoods',
      name: 'addGoods',
      component: addGoods
    },
    {
      path: '/mycenter',
      name: 'mycenter',
      component: mycenter
    },
  ]
})
