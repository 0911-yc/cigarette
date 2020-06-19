import request from '@/utils/request'

export function newList(data) {
  return request({
    url: 'new/newList',
    method: 'post',
    data
  })
}

export function newDel(id) {
  return request({
    url: 'new/newDel',
    method: 'get',
    params:{ id }
  })
}
