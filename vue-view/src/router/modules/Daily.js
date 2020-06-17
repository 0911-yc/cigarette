import Layout from '@/layout'

const DailyRouter = {
  path: '/charts',
  component: Layout,
  redirect: 'noRedirect',
  name: 'Charts',
  meta: {
    title: '日常管理',
    icon: 'chart'
  },
  children: [
    {
      path: 'report',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '信访举报管理', noCache: true }
    },
    {
      path: 'regulatory',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '三重一大事项监管', noCache: true }
    },
    {
      path: 'summary',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '三重一大事项汇总', noCache: true }
    },
    {
      path: 'record',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '三重一大事项备案审核', noCache: true }
    }
  ]
}

export default DailyRouter
