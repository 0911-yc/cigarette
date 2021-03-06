import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/post/add',
    method: 'post',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: '/post/delete',
    method: 'get',
    params: { id }
  })
}

export function update(data) {
  return request({
    url: '/post/update',
    method: 'post',
    data
  })
}

export function list(data) {
  return request({
    url: '/post/list',
    method: 'post',
    data
  })
}
