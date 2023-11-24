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
@TableName("visualization_management")
public class VisualizationManagementEntity extends InfraBaseEntity {
	/**
	 * 型号Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("型号Id")
	@TableField("model_id")
	private Long modelId;

	/**
	 * 模型结构
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("模型结构")
	@TableField("structure")
	private String structure;

	/**
	 * 模型参数
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("模型参数")
	@TableField("parameters")
	private String parameters;

	/**
	 * 训练过程
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("训练过程")
	@TableField("training_process")
	private String trainingProcess;

	/**
	 * 可视化结果
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("可视化结果")
	@TableField("visualization_results")
	private String visualizationResults;

	/**
	 * 创建日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建日期")
	@TableField("created_at")
	private Date createdAt;


}
