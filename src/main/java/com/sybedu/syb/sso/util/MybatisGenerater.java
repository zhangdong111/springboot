package com.sybedu.syb.sso.util;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.ArrayList;

/**
 * Created By Rexxar on 2021/7/20
 */
public class MybatisGenerater {

  public static void main(String[] args) {

    // 全局配置
    GlobalConfig gc = new GlobalConfig();
    String projectPath = System.getProperty("user.dir");  // 获取当前项目根路径 user.dir : E:\IdeaProjects\JavaPrimary
    gc.setOutputDir(projectPath+"/src/main/java");
    gc.setAuthor("Rexxer");
    gc.setOpen(false); //不打开生产的文件
    gc.setFileOverride(true); //不覆盖之前生成的文件
//        //设置生成代码的名字
//    gc.setEntityName("%sEntity")
    gc.setEntityName("%sEntity")
      .setServiceName("I%sService")
      .setServiceImplName("%sServiceImpl")
      .setMapperName("%sMapper")
      .setControllerName("%sController");
    gc.setServiceName("%sService");//前面%s一定要加，否则生成的service会存在- Adminervice
    gc.setIdType(IdType.ASSIGN_ID);// 主键策略 自增  注意要和数据库中表实际情况对应
    gc.setDateType(DateType.ONLY_DATE);
    gc.setEnableCache(true);// XML 二级缓存
    gc.setBaseResultMap(true);// XML ResultMap
    gc.setBaseColumnList(true);// XML columList
    gc.setSwagger2(true);





    // 数据源配置
    DataSourceConfig dsc = new DataSourceConfig();
    dsc.setDriverName("com.mysql.cj.jdbc.Driver");
    dsc.setUrl("jdbc:mysql://localhost:3306/syb_sso?serverTimezone=UTC");
    dsc.setUsername("root");
    dsc.setPassword("root");
    dsc.setDbType(DbType.MYSQL);


    // 包配置
    PackageConfig pc = new PackageConfig();
    pc.setParent("com.sybedu.syb.sso");
    pc.setController("controller");
    pc.setService("service");
    pc.setEntity("entity");
    pc.setMapper("mapper");

    //设置自定义模板
//    String templatePath = "/templates/entity.java.vm";
//    List<FileOutConfig> focList = new ArrayList<>();
//    // 自定义配置会被优先输出
//    focList.add(new FileOutConfig(templatePath) {
//      @Override
//      public String outputFile(TableInfo tableInfo) {
//        // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//        return projectPath + "/src/main/com/sybedu/syb/sso/entity" + pc.getModuleName()
//            + "/" + tableInfo.getEntityName().replace("Entity", "") + "Mapper" + StringPool.DOT_XML;
//      }
//    });



    // 策略配置
    StrategyConfig strategy = new StrategyConfig();
    strategy.setNaming(NamingStrategy.underline_to_camel);// 下划线转驼峰
    strategy.setColumnNaming(NamingStrategy.underline_to_camel);
    strategy.setEntityLombokModel(true);// 自动生成lombok注解  记住要有lombok依赖和对应的插件哈
    strategy.setRestControllerStyle(true); //rest风格controller
//     strategy.setInclude("t_user");
    //可以用同配符号:表示生成t_开头的对应库下所有表
//    strategy.setInclude("au_\\w**");
    strategy.setTablePrefix("au_");
    strategy.setLogicDeleteFieldName("is_deleted");//设置逻辑删除字段
    strategy.setSuperEntityClass(Model.class);//领域模型
    // 设置创建时间和更新时间自动填充策略
    TableFill created_date = new TableFill("created_time", FieldFill.INSERT);
    TableFill updated_date = new TableFill("updated_time", FieldFill.INSERT_UPDATE);
    ArrayList<TableFill> tableFills = new ArrayList<>();
    tableFills.add(created_date);
    tableFills.add(updated_date);
    strategy.setTableFillList(tableFills);
    // 乐观锁策略
    strategy.setVersionFieldName("version");
    strategy.setRestControllerStyle(true);//采用restful 风格的api
    strategy.setControllerMappingHyphenStyle(true); // controller 请求地址采用下划线代替驼峰



    // 代码生成器
    AutoGenerator mpg = new AutoGenerator();

    // 配置模板
    TemplateConfig templateConfig = new TemplateConfig();

    // 配置自定义输出模板
    //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
    templateConfig.setEntity("vm/entity.java");
    // templateConfig.setService();
    // templateConfig.setController("templates/controller.java");
    mpg.setTemplate(templateConfig);

    mpg.setGlobalConfig(gc);
    mpg.setDataSource(dsc);
    mpg.setStrategy(strategy);
    mpg.setPackageInfo(pc);

    // 执行
    mpg.execute();
  }


}
