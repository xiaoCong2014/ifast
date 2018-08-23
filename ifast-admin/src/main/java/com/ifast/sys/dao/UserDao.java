package com.ifast.sys.dao;

import com.ifast.common.base.BaseDao;
import com.ifast.common.domain.UserDO;

/**
 * <pre>
 * </pre>
 * <small> 2018年3月23日 | Aron</small>
 */
public interface UserDao extends BaseDao<UserDO> {
	
	Long[] listAllDept();

}
