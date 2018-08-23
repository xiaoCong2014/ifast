package com.ifast.sys.dao;

import com.ifast.common.base.BaseDao;
import com.ifast.sys.domain.DictDO;

import java.util.List;

/**
 * 字典表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-03 15:45:42
 */
public interface DictDao extends BaseDao<DictDO>{

    List<DictDO> listType();
    
}
