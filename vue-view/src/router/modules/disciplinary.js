import Layout from '@/layout'

const disciplinaryRouter = {
  path: '/charts',
  component: Layout,
  redirect: 'noRedirect',
  name: 'Charts',
  meta: {
    title: '纪检报表',
    icon: 'chart'
  },
  children: [
    {
      path: 'disciplinary',
      component: () => import('@/views/charts/line'),
      name: 'LineChart',
      meta: { title: '纪检报表', noCache: true }
    }
  ]
}

export default disciplinaryRouter
