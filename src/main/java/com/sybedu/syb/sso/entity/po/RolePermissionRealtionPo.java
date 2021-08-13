package com.sybedu.syb.sso.entity.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author Rexxer
 * @since 2021-08-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@TableName("au_role_permission_realtion")
@Schema(name = "RolePermissionRealtionEntity",description="")
public class RolePermissionRealtionPo extends Model implements Serializable {

  private static final long serialVersionUID=1L;

  @TableId(value = "id", type = IdType.ASSIGN_ID)
  private Long id;

  @Schema(name = "roleId" , description = "角色id")
  private Integer roleId;

  @Schema(name = "permissionId" , description = "功能id")
  private Integer permissionId;

  @Schema(name = "createdTime" , description = "创建时间")
  @TableField(fill = FieldFill.INSERT)
  private Date createdTime;

  @Schema(name = "updatedTime" , description = "更新时间")
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updatedTime;

  @Schema(name = "isDeleted" , description = "逻辑删除")
  @TableLogic
  private Boolean isDeleted;

  @Schema(name = "version" , description = "数据版本号")
  @Version
  private Integer version;


}