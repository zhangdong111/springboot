package po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2021-08-13 02:42:06
 * @since jdk1.8
 */
public class OnlineCoachingInfoPo implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  private Integer id;
  /**
   * 用户名
   */
  private String userName;
  /**
   * 真实姓名
   */
  private String fullName;
  /**
   * ip地址
   */
  private String ip;
  /**
   * 端口号
   */
  private String port;
  /**
   * 用户类型,0老师,1学生2游客
   */
  private Integer userType;
  /**
   * 房间id
   */
  private Integer roomId;
  /**
   * 房间名称
   */
  private String roomName;
  /**
   * 教师用户用户名
   */
  private String teacherName;
  /**
   * 教师真实姓名
   */
  private String teacherFullName;
  /**
   * 试卷id
   */
  private Integer paperId;
  /**
   * 学科id
   */
  private Integer subjectId;
  /**
   * 题目id
   */
  private Integer questionId;
  /**
   * 知识点id
   */
  private Integer knowledgeId;
  /**
   * 创建时间
   */
  private Date createdTime;
  /**
   * 更新时间
   */
  private Date updatedTime;
  /**
   * 退出直播间的时间
   */
  private Date endTime;

  /**
   *
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   *
   */
  public Integer getId() {
    return id;
  }

  /**
   * 用户名
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * 用户名
   */
  public String getUserName() {
    return userName;
  }

  /**
   * 真实姓名
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * 真实姓名
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * ip地址
   */
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * ip地址
   */
  public String getIp() {
    return ip;
  }

  /**
   * 端口号
   */
  public void setPort(String port) {
    this.port = port;
  }

  /**
   * 端口号
   */
  public String getPort() {
    return port;
  }

  /**
   * 用户类型,0老师,1学生2游客
   */
  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  /**
   * 用户类型,0老师,1学生2游客
   */
  public Integer getUserType() {
    return userType;
  }

  /**
   * 房间id
   */
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  /**
   * 房间id
   */
  public Integer getRoomId() {
    return roomId;
  }

  /**
   * 房间名称
   */
  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  /**
   * 房间名称
   */
  public String getRoomName() {
    return roomName;
  }

  /**
   * 教师用户用户名
   */
  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  /**
   * 教师用户用户名
   */
  public String getTeacherName() {
    return teacherName;
  }

  /**
   * 教师真实姓名
   */
  public void setTeacherFullName(String teacherFullName) {
    this.teacherFullName = teacherFullName;
  }

  /**
   * 教师真实姓名
   */
  public String getTeacherFullName() {
    return teacherFullName;
  }

  /**
   * 试卷id
   */
  public void setPaperId(Integer paperId) {
    this.paperId = paperId;
  }

  /**
   * 试卷id
   */
  public Integer getPaperId() {
    return paperId;
  }

  /**
   * 学科id
   */
  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  /**
   * 学科id
   */
  public Integer getSubjectId() {
    return subjectId;
  }

  /**
   * 题目id
   */
  public void setQuestionId(Integer questionId) {
    this.questionId = questionId;
  }

  /**
   * 题目id
   */
  public Integer getQuestionId() {
    return questionId;
  }

  /**
   * 知识点id
   */
  public void setKnowledgeId(Integer knowledgeId) {
    this.knowledgeId = knowledgeId;
  }

  /**
   * 知识点id
   */
  public Integer getKnowledgeId() {
    return knowledgeId;
  }

  /**
   * 创建时间
   */
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 创建时间
   */
  public Date getCreatedTime() {
    return createdTime;
  }

  /**
   * 更新时间
   */
  public void setUpdatedTime(Date updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * 更新时间
   */
  public Date getUpdatedTime() {
    return updatedTime;
  }

  /**
   * 退出直播间的时间
   */
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * 退出直播间的时间
   */
  public Date getEndTime() {
    return endTime;
  }
}
