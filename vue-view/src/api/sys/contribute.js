import request from '@/utils/request'

export function conList(data) {
  return request({
    url: 'con/conList',
    method: 'post',
    data
  })
}

export function delList(id) {
  return request({
    url: 'con/delCon',
    method: 'post',
    params: { id }
  })
}
