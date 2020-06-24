import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Layout from '@/layout'
// import componentsRouter from './modules/components'
// import chartsRouter from './modules/charts'
// import tableRouter from './modules/table'
// import educationRouter from '@/router/modules/education'
// import DailyRouter from '@/router/modules/Daily'
// import dynamicRouter from '@/router/modules/dynamic'
// import disciplinaryRouter from '@/router/modules/disciplinary'
// import supervisionRouter from '@/router/modules/supervision'

export const constantRoutes = [
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path(.*)',
        component: () => import('@/views/redirect/index')
      }
    ]
  },
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },
  {
    path: '/auth-redirect',
    component: () => import('@/views/login/auth-redirect'),
    hidden: true
  },
  {
    path: '/404',
    component: () => import('@/views/error-page/404'),
    hidden: true
  },
  {
    path: '/401',
    component: () => import('@/views/error-page/401'),
    hidden: true
  },
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [
      {
        path: 'dashboard',
        component: () => import('@/views/dashboard/index'),
        name: 'Dashboard',
        meta: { title: '香飘飘烟草', icon: 'dashboard', affix: true }
      }
    ]
  }
]

export const asyncRoutes = [
  {
    path: '/permission',
    component: Layout,
    redirect: '/permission/page',
    alwaysShow: true,
    name: 'Permission',
    meta: {
      title: '系统管理',
      icon: 'lock',
      roles: ['超级管理员']
    },
    children: [
      {
        path: 'organization',
        component: () => import('@/views/Kcsvue/organization'),
        name: 'Organization ',
        meta: {
          title: '机构管理'
        }
      },
      {
        path: 'employee',
        component: () => import('@/views/Kcsvue/employee'),
        name: 'employee',
        meta: {
          title: '员工管理'
        }
      },
      {
        path: 'post',
        component: () => import('@/views/Kcsvue/Post'),
        name: 'Post',
        meta: {
          title: '岗位管理'
          // roles: ['admin']
        }
      },
      {
        path: 'rights',
        component: () => import('@/views/permission/rights'),
        name: 'Rights',
        meta: {
          title: '权限管理'
        }
      },
      {
        path: 'Log',
        component: () => import('@/views/permission/Log'),
        name: 'Log',
        meta: {
          title: '日志管理'
        }
      }
    ]
  },
  {
    path: '/government',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Government',
    meta: {
      title: '廉政教育',
      icon: 'chart'
    },
    children: [
      {
        path: 'government',
        component: () => import('@/views/government/education'),
        name: 'Government',
        meta: { title: '廉政教育', noCache: true }
      },
      {
        path: 'eduAdd',
        component: () => import('@/views/government/eduAdd'),
        name: 'eduAdd',
        meta: { title: '添加', noCache: true, activeMenu: '@/views/government/education' },
        hidden: true
      },
      {
        path: 'eduUpdate',
        component: () => import('@/views/government/eduUpdate'),
        name: 'eduUpdate',
        meta: { title: '修改', noCache: true, activeMenu: '@/views/government/education' },
        hidden: true
      }
    ]
  },
  {
    path: '/documentary',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Documentary',
    meta: {
      title: '责任纪实',
      icon: 'component'
    },
    children: [
      {
        path: 'plan',
        component: () => import('@/views/documentary/plan'),
        name: 'Plan',
        meta: { title: '工作计划' }
      },
      {
        path: 'deployment',
        component: () => import('@/views/documentary/deployment'),
        name: 'Deployment',
        meta: { title: '工作部署' }
      },
      {
        path: 'conversation',
        component: () => import('@/views/documentary/conversation'),
        name: 'Conversation',
        meta: { title: '廉政谈话' }
      },
      {
        path: 'responsibility',
        component: () => import('@/views/documentary/responsibility'),
        name: 'Responsibility',
        meta: { title: '主体责任' }
      }
    ]
  },
  {
    path: '/culture',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Culture',
    meta: {
      title: '廉政文化',
      icon: 'chart'
    },
    children: [
      {
        path: 'kam',
        component: () => import('@/views/culture/kam'),
        name: 'Kam',
        meta: { title: '资料锦集', noCache: true }
      },
      {
        path: 'wind',
        component: () => import('@/views/culture/wind'),
        name: 'Wind',
        meta: { title: '清风文苑', noCache: true }
      }
    ]
  },
  {
    path: '/prevention',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Prevention',
    meta: {
      title: '风险防控',
      icon: 'table'
    },
    children: [
      {
        path: 'jobs',
        component: () => import('@/views/prevention/jobs'),
        name: 'Jobs',
        meta: { title: '岗位风险梳理' }
      },
      {
        path: 'process',
        component: () => import('@/views/prevention/process'),
        name: 'Process',
        meta: { title: '流程风险梳理' }
      },
      {
        path: 'risk',
        component: () => import('@/views/prevention/risk'),
        name: 'Risk',
        meta: { title: '风险点评定' }
      }
    ]
  },
  {
    path: '/daily',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Daily',
    meta: {
      title: '日常管理',
      icon: 'chart'
    },
    children: [
      {
        path: 'report',
        component: () => import('@/views/daily/report'),
        name: 'Report',
        meta: { title: '信访举报管理', noCache: true }
      },
      {
        path: 'regulatory',
        component: () => import('@/views/daily/regulatory'),
        name: 'Regulatory',
        meta: { title: '三重一大事项监管', noCache: true }
      },
      {
        path: 'summary',
        component: () => import('@/views/daily/summary'),
        name: 'Summary',
        meta: { title: '三重一大事项汇总', noCache: true }
      },
      {
        path: 'audit',
        component: () => import('@/views/daily/audit'),
        name: 'Audit',
        meta: { title: '三重一大事项备案审核', noCache: true }
      }
    ]
  },
  {
    path: '/dynamic',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Dynamic',
    meta: {
      title: '动态管理',
      icon: 'chart'
    },
    children: [
      {
        path: 'warning',
        component: () => import('@/views/dynamic/warning'),
        name: 'Warning',
        meta: { title: '风险点预警管理', noCache: true }
      },
      {
        path: 'perfect',
        component: () => import('@/views/dynamic/perfect'),
        name: 'Perfect',
        meta: { title: '制度流程完善', noCache: true }
      }
    ]
  },
  {
    path: '/evaluation',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Evaluation',
    meta: {
      title: '风险评价',
      icon: 'chart'
    },
    children: [
      {
        path: 'proportion',
        component: () => import('@/views/evaluation/proportion'),
        name: 'Proportion',
        meta: { title: '风险占比分析', noCache: true }
      },
      {
        path: 'growth',
        component: () => import('@/views/evaluation/growth'),
        name: 'Growth',
        meta: { title: '增长态势分析', noCache: true }
      }
    ]
  },
  {
    path: '/report',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Report',
    meta: {
      title: '纪检报表',
      icon: 'chart'
    },
    children: [
      {
        path: 'disciplinary',
        component: () => import('@/views/report/disciplinary'),
        name: 'Disciplinary',
        meta: { title: '纪检报表', noCache: true }
      }
    ]
  },
  {
    path: '/supervision',
    component: Layout,
    redirect: 'noRedirect',
    name: 'Supervision',
    meta: {
      title: '监督责任',
      icon: 'chart'
    },
    children: [
      {
        path: 'supervision',
        component: () => import('@/views/supervision/supervision'),
        name: 'Supervision',
        meta: { title: '监督责任', noCache: true }
      }
    ]
  },
  // educationRouter,
  // componentsRouter,
  // chartsRouter,
  // tableRouter,
  // DailyRouter,
  // dynamicRouter,
  // disciplinaryRouter,
  // supervisionRouter,

  { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
