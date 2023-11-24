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
@TableName("performance_evaluations")
public class PerformanceEvaluationsEntity extends InfraBaseEntity {
	/**
	 * 型号Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("型号Id")
	@TableField("model_id")
	private Long modelId;

	/**
	 * 准确率
	 */
	@ColumnType(MySqlTypeConstant.FLOAT)
	@ColumnComment("准确率")
	@TableField("accuracy")
	private Float accuracy;

	/**
	 * 召回率
	 */
	@ColumnType(MySqlTypeConstant.FLOAT)
	@ColumnComment("召回率")
	@TableField("recall")
	private Float recall;

	/**
	 * F1值
	 */
	@ColumnType(MySqlTypeConstant.FLOAT)
	@ColumnComment("F1值")
	@TableField("f1_score")
	private Float f1Score;

	/**
	 * 创建日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建日期")
	@TableField("created_at")
	private Date createdAt;


}
