import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/report/add',
    method: 'post',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: '/report/delete',
    method: 'get',
    params: { id }
  })
}

export function update(data) {
  return request({
    url: '/report/update',
    method: 'post',
    data
  })
}

export function list(data) {
  return request({
    url: '/report/list',
    method: 'post',
    data
  })
}
