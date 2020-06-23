import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/sysProcess/add',
    method: 'post',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: '/sysProcess/delete',
    method: 'get',
    params: { id }
  })
}

export function update(data) {
  return request({
    url: '/sysProcess/update',
    method: 'post',
    data
  })
}

export function list(data) {
  return request({
    url: '/sysProcess/list',
    method: 'post',
    data
  })
}
