import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import AddUser from '@/components/Add'
import FindUser from '@/components/Query'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path:"/",
      name:'AddUser',
      component:AddUser
    },
    {
      path:"/add",
      name:'AddUser',
      component:AddUser
    },
    {
      path:'/query',
      name:'FindUser',
      component:FindUser
    }

  ]
})
