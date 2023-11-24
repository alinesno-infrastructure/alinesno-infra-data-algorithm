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
@TableName("interfaces")
public class InterfacesEntity extends InfraBaseEntity {
	/**
	 * 型号Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("型号Id")
	@TableField("model_id")
	private Long modelId;

	/**
	 * 接口端点
	 */
	@ColumnType(length = 255)
	@ColumnComment("接口端点")
	@TableField("endpoint")
	private String endpoint;

	/**
	 * 接口参数设置
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("接口参数设置")
	@TableField("params")
	private String params;

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
