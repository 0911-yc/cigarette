import request from '@/utils/request'

export function datList(data) {
  return request({
    url: 'dat/datList',
    method: 'post',
    data
  })
}

export function delDat(id) {
  return request({
    url: 'dat/delDat',
    method: 'get',
    params: { id }
  })
}
