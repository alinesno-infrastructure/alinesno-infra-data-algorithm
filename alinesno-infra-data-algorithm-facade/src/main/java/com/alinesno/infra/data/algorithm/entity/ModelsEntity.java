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
@TableName("models")
public class ModelsEntity extends InfraBaseEntity {
	/**
	 * 名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("名称")
	@TableField("name")
	private String name;

	/**
	 * 版本
	 */
	@ColumnType(length = 50)
	@ColumnComment("版本")
	@TableField("version")
	private String version;

	/**
	 * 来源
	 */
	@ColumnType(length = 255)
	@ColumnComment("来源")
	@TableField("source")
	private String source;

	/**
	 * 模型训练参数
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("模型训练参数")
	@TableField("train_params")
	private String trainParams;

	/**
	 * 性能指标
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("性能指标")
	@TableField("performance_metrics")
	private String performanceMetrics;

	/**
	 * 创建日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建日期")
	@TableField("created_at")
	private Date createdAt;

	/**
	 * 更新日期
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("更新日期")
	@TableField("updated_at")
	private Date updatedAt;


}
