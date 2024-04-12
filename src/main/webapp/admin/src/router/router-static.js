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
    import sushebaoxiu from '@/views/modules/sushebaoxiu/list'
    import sushejiancha from '@/views/modules/sushejiancha/list'
    import suguan from '@/views/modules/suguan/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengwangui from '@/views/modules/xueshengwangui/list'
    import tiwenshangbao from '@/views/modules/tiwenshangbao/list'
    import wupinjieyong from '@/views/modules/wupinjieyong/list'
    import susheanpai from '@/views/modules/susheanpai/list'
    import wupinxinxi from '@/views/modules/wupinxinxi/list'
    import jiaqiliuxiao from '@/views/modules/jiaqiliuxiao/list'
    import tuisuxinxi from '@/views/modules/tuisuxinxi/list'
    import shiwuzhaoling from '@/views/modules/shiwuzhaoling/list'
    import wupinguihai from '@/views/modules/wupinguihai/list'
    import jiaofeixinxi from '@/views/modules/jiaofeixinxi/list'
    import sushexinxi from '@/views/modules/sushexinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import loudong from '@/views/modules/loudong/list'


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
	path: '/sushebaoxiu',
        name: '宿舍报修',
        component: sushebaoxiu
      }
          ,{
	path: '/sushejiancha',
        name: '宿舍检查',
        component: sushejiancha
      }
          ,{
	path: '/suguan',
        name: '宿管',
        component: suguan
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/xueshengwangui',
        name: '学生晚归',
        component: xueshengwangui
      }
          ,{
	path: '/tiwenshangbao',
        name: '体温上报',
        component: tiwenshangbao
      }
          ,{
	path: '/wupinjieyong',
        name: '物品借用',
        component: wupinjieyong
      }
          ,{
	path: '/susheanpai',
        name: '宿舍安排',
        component: susheanpai
      }
          ,{
	path: '/wupinxinxi',
        name: '物品信息',
        component: wupinxinxi
      }
          ,{
	path: '/jiaqiliuxiao',
        name: '假期留校',
        component: jiaqiliuxiao
      }
          ,{
	path: '/tuisuxinxi',
        name: '退宿信息',
        component: tuisuxinxi
      }
          ,{
	path: '/shiwuzhaoling',
        name: '失物招领',
        component: shiwuzhaoling
      }
          ,{
	path: '/wupinguihai',
        name: '物品归还',
        component: wupinguihai
      }
          ,{
	path: '/jiaofeixinxi',
        name: '缴费信息',
        component: jiaofeixinxi
      }
          ,{
	path: '/sushexinxi',
        name: '宿舍信息',
        component: sushexinxi
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
	path: '/loudong',
        name: '楼栋',
        component: loudong
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
