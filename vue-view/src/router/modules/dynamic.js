import Layout from '@/layout'

const dynamicRouter = {
  path: '/charts',
  component: Layout,
  redirect: 'noRedirect',
  name: 'Charts',
  meta: {
    title: '动态管理',
    icon: 'chart'
  },
  children: [
    {
      path: 'risk',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '风险点预警管理', noCache: true }
    },
    {
      path: 'system',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '制度流程完善', noCache: true }
    }
  ]
}

export default dynamicRouter
