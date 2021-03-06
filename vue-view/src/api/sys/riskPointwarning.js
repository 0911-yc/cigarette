import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/riskPointwarning/add',
    method: 'post',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: '/riskPointwarning/delete',
    method: 'get',
    params: { id }
  })
}

export function update(data) {
  return request({
    url: '/riskPointwarning/update',
    method: 'post',
    data
  })
}

export function list(data) {
  return request({
    url: '/riskPointwarning/list',
    method: 'post',
    data
  })
}
