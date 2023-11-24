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
@TableName("version_control")
public class VersionControlEntity extends InfraBaseEntity {
	/**
	 * 型号Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("型号Id")
	@TableField("model_id")
	private Long modelId;

	/**
	 * 版本
	 */
	@ColumnType(length = 50)
	@ColumnComment("版本")
	@TableField("version")
	private String version;

	/**
	 * 训练数据
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("训练数据")
	@TableField("training_data")
	private String trainingData;

	/**
	 * 训练参数
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("训练参数")
	@TableField("training_params")
	private String trainingParams;

	/**
	 * 训练结果
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("训练结果")
	@TableField("training_result")
	private String trainingResult;

	/**
	 * 创建日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建日期")
	@TableField("created_at")
	private Date createdAt;


}
