package com.sybedu.syb.sso.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Rexxer
 * @since 2021-07-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BuUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 创建时间
     */
    private Integer createdTime;

    /**
     * 更新时间
     */
    private Integer updateTime;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Boolean flag;

    /**
     * 数据版本号
     */
    @Version
    private Integer version;


}
