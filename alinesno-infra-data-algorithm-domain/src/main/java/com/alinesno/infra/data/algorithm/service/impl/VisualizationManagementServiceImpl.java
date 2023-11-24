package com.alinesno.infra.data.algorithm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.algorithm.entity.VisualizationManagementEntity;
import com.alinesno.infra.data.algorithm.mapper.VisualizationManagementMapper;
import com.alinesno.infra.data.algorithm.service.IVisualizationManagementService;
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
public class VisualizationManagementServiceImpl extends IBaseServiceImpl<VisualizationManagementEntity, VisualizationManagementMapper> implements IVisualizationManagementService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(VisualizationManagementServiceImpl.class);

}
