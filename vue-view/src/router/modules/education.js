import Layout from '@/layout'

const educationRouter = {
  path: '/charts',
  component: Layout,
  redirect: 'noRedirect',
  name: 'Charts',
  meta: {
    title: '廉政教育',
    icon: 'chart'
  },
  children: [
    {
      path: 'line',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '廉政教育', noCache: true }
    }
  ]
}

export default educationRouter
