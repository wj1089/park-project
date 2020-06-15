import Vue from 'vue'
import Router from 'vue-router'
import GymHome from '@/components/common/GymHome'
import Mypage from '@/components/user/MyPage'
import Login from '@/components/user/Login'
import Join from '@/components/user/Join'
Vue.use(Router)
export default new Router( {
    mode: 'history',
    routes : [
        {path: '/common/GymHome', name:'gymhome' ,component: GymHome},
        {path: '/user/Login', name:'login', component: Login},
        {path: '/user/Mypage', name:'mypage', component: Mypage},
        {path: '/user/Join', name:'join', component: Join}
    ]
})


