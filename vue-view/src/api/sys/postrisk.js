import request from '@/utils/request'

export function deptOptions() {
  return request({
    url: '/risk/dept',
    method: 'get'
  })
}

export function postOptions(id) {
  return request({
    url: '/risk/post',
    method: 'get',
    params: { id: id }
  })
}

export function getselCondition(data) {
  return request({
    url: '/risk/getselCondition',
    method: 'post',
    data
  })
}

export function getsel() {
  return request({
    url: '/risk/getsel',
    method: 'get'
  })
}

export function listPostRisk() {
  return request({
    url: '/risk/listPostRisk',
    method: 'get'
  })
}
