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
@TableName("automation_management")
public class AutomationManagementEntity extends InfraBaseEntity {
	/**
	 * 型号Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("型号Id")
	@TableField("model_id")
	private Long modelId;

	/**
	 * 自动化测试
	 */
	@ColumnType(length = 255)
	@ColumnComment("自动化测试")
	@TableField("automated_testing")
	private String automatedTesting;

	/**
	 * 自动化部署
	 */
	@ColumnType(length = 255)
	@ColumnComment("自动化部署")
	@TableField("automated_deployment")
	private String automatedDeployment;

	/**
	 * 自动调整
	 */
	@ColumnType(length = 255)
	@ColumnComment("自动调整")
	@TableField("automated_tuning")
	private String automatedTuning;

	/**
	 * 自动化结果
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("自动化结果")
	@TableField("automation_results")
	private String automationResults;

	/**
	 * 创建日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建日期")
	@TableField("created_at")
	private Date createdAt;


}
