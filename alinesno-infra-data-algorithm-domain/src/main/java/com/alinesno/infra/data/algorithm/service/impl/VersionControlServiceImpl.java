package com.alinesno.infra.data.algorithm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.algorithm.entity.VersionControlEntity;
import com.alinesno.infra.data.algorithm.mapper.VersionControlMapper;
import com.alinesno.infra.data.algorithm.service.IVersionControlService;
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
public class VersionControlServiceImpl extends IBaseServiceImpl<VersionControlEntity, VersionControlMapper> implements IVersionControlService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(VersionControlServiceImpl.class);

}
