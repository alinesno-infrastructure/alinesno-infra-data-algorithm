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
@TableName("call_records")
public class CallRecordsEntity extends InfraBaseEntity {
	/**
	 * 接口Id
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("接口Id")
	@TableField("interface_id")
	private Long interfaceId;

	/**
	 * 调用时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("调用时间")
	@TableField("call_time")
	private Date callTime;

	/**
	 * 后果
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("后果")
	@TableField("result")
	private String result;


}
