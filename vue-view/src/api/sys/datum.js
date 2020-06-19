import request from '@/utils/request'

export function datList(data) {
  return request({
    url:'dat/datList',
    method:'post',
    data
  })
}
