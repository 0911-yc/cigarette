import Layout from '@/layout'

const supervisionRouter = {
  path: '/charts',
  component: Layout,
  redirect: 'noRedirect',
  name: 'Charts',
  meta: {
    title: '监督责任',
    icon: 'chart'
  },
  children: [
    {
      path: 'supervision',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '监督责任', noCache: true }
    }
  ]
}

export default supervisionRouter
