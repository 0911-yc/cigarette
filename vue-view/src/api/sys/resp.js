import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/resp/add',
    method: 'post',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: '/resp/delete',
    method: 'get',
    params: { id }
  })
}

export function update(data) {
  return request({
    url: '/resp/update',
    method: 'post',
    data
  })
}

export function list(data) {
  return request({
    url: '/resp/list',
    method: 'post',
    data
  })
}

export function FileUpload(data) {
  return request({
    url: '/resp/FileUpload',
    method: 'post',
    data
  })
}
