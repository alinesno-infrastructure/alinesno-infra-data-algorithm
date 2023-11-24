package com.alinesno.infra.data.algorithm.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("security_management")
public class SecurityManagementEntity extends InfraBaseEntity {
	/**
	 * 型号Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("型号Id")
	@TableField("model_id")
	private Long modelId;

	/**
	 * 访问权限
	 */
	@ColumnType(length = 255)
	@ColumnComment("访问权限")
	@TableField("access_permission")
	private String accessPermission;

	/**
	 * 数据保护
	 */
	@ColumnType(length = 255)
	@ColumnComment("数据保护")
	@TableField("data_protection")
	private String dataProtection;

	/**
	 * 数据隐私
	 */
	@ColumnType(length = 255)
	@ColumnComment("数据隐私")
	@TableField("data_privacy")
	private String dataPrivacy;

	/**
	 * 访问日志
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("访问日志")
	@TableField("access_logs")
	private String accessLogs;

	/**
	 * 创建日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建日期")
	@TableField("created_at")
	private Date createdAt;


}
