package com.sybedu.syb.sso.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Rexxer
 * @since 2021-08-11
 */
@Data
    @EqualsAndHashCode(callSuper = true)
@TableName("au_user")
@Schema(name = "UserEntity",description="")
public class UserEntity extends Model {

private static final long serialVersionUID=1L;

                @TableId(value = "id", type = IdType.ASSIGN_ID)
                private Long id;

        @Schema(description = "用户名")
        private String username;

        @Schema(description = "密码")
        private String password;

        @Schema(description = "创建时间")
                @TableField(fill = FieldFill.INSERT)
        private Date createdTime;

        @Schema(description = "更新时间")
                @TableField(fill = FieldFill.INSERT_UPDATE)
        private Date updatedTime;

        @Schema(description = "逻辑删除")
            @TableLogic
private Boolean isDeleted;

        @Schema(description = "数据版本号")
        @Version
    private Integer version;


    }