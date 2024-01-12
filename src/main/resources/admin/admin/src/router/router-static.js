import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussjiudianxinxi from '@/views/modules/discussjiudianxinxi/list'
    import jiudianxinxi from '@/views/modules/jiudianxinxi/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import fangjianleixing from '@/views/modules/fangjianleixing/list'
    import mubiaoxinde from '@/views/modules/mubiaoxinde/list'
    import xiaofeizhangdan from '@/views/modules/xiaofeizhangdan/list'
    import chepiaoxinxi from '@/views/modules/chepiaoxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discusslvyougonglve from '@/views/modules/discusslvyougonglve/list'
    import lvyougonglve from '@/views/modules/lvyougonglve/list'
    import jiudianyuding from '@/views/modules/jiudianyuding/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '资讯信息',
        component: news
      }
      ,{
	path: '/discussjiudianxinxi',
        name: '酒店信息评论',
        component: discussjiudianxinxi
      }
      ,{
	path: '/jiudianxinxi',
        name: '酒店信息',
        component: jiudianxinxi
      }
      ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/fangjianleixing',
        name: '房间类型',
        component: fangjianleixing
      }
      ,{
	path: '/mubiaoxinde',
        name: '目标心得',
        component: mubiaoxinde
      }
      ,{
	path: '/xiaofeizhangdan',
        name: '消费账单',
        component: xiaofeizhangdan
      }
      ,{
	path: '/chepiaoxinxi',
        name: '车票信息',
        component: chepiaoxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discusslvyougonglve',
        name: '旅游攻略评论',
        component: discusslvyougonglve
      }
      ,{
	path: '/lvyougonglve',
        name: '旅游攻略',
        component: lvyougonglve
      }
      ,{
	path: '/jiudianyuding',
        name: '酒店预订',
        component: jiudianyuding
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
