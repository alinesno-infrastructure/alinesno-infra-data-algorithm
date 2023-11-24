package com.alinesno.infra.data.algorithm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.algorithm.entity.InterfacesEntity;
import com.alinesno.infra.data.algorithm.mapper.InterfacesMapper;
import com.alinesno.infra.data.algorithm.service.IInterfacesService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class InterfacesServiceImpl extends IBaseServiceImpl<InterfacesEntity, InterfacesMapper> implements IInterfacesService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(InterfacesServiceImpl.class);

}
