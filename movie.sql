/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.48 : Database - movie
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`movie` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `movie`;

/*Table structure for table ` t_user` */

DROP TABLE IF EXISTS ` t_user`;

CREATE TABLE ` t_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `u_pwd` varchar(255) NOT NULL COMMENT '用户密码',
  `u_sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `brithday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  `animation` varchar(255) DEFAULT NULL COMMENT '生活状态',
  `u_phone` varchar(255) NOT NULL COMMENT '手机号',
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table ` t_user` */

/*Table structure for table `t_actor` */

DROP TABLE IF EXISTS `t_actor`;

CREATE TABLE `t_actor` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '演员id',
  `a_name` varchar(255) DEFAULT NULL COMMENT '演员名',
  `a_sex` varchar(255) DEFAULT NULL COMMENT '演员性别',
  `a_address` varchar(255) DEFAULT NULL COMMENT '演员地区',
  `a_birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '演员出生日期',
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_actor` */

/*Table structure for table `t_actorfilm` */

DROP TABLE IF EXISTS `t_actorfilm`;

CREATE TABLE `t_actorfilm` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '影片演员关系id',
  `a_id` int(11) NOT NULL COMMENT '演员id',
  `f_id` int(11) NOT NULL COMMENT '影片id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_actorfilm` */

/*Table structure for table `t_actorimg` */

DROP TABLE IF EXISTS `t_actorimg`;

CREATE TABLE `t_actorimg` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '照片演员的关系id',
  `a_img_url` varchar(255) DEFAULT NULL COMMENT '照片路径',
  `a_id` int(11) DEFAULT NULL COMMENT '演员id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_actorimg` */

/*Table structure for table `t_address` */

DROP TABLE IF EXISTS `t_address`;

CREATE TABLE `t_address` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地区id',
  `a_name` varchar(255) NOT NULL COMMENT '地区名',
  `pri_id` int(11) DEFAULT NULL COMMENT '父地区id',
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_address` */

insert  into `t_address`(`a_id`,`a_name`,`pri_id`) values (1,'北京',NULL),(2,'郑州',NULL),(3,'上海',NULL),(4,'杭州',NULL),(5,'深圳',NULL),(6,'开封',NULL),(7,'青岛',NULL),(8,'合肥',NULL),(9,'南昌',NULL),(10,'太原',NULL);

/*Table structure for table `t_cinema` */

DROP TABLE IF EXISTS `t_cinema`;

CREATE TABLE `t_cinema` (
  `c_id` int(11) NOT NULL COMMENT '电影院id',
  `c_name` varchar(255) NOT NULL COMMENT '电影院名',
  `c_address` varchar(255) NOT NULL COMMENT '电影院详细地址',
  `c_phone` varchar(255) NOT NULL COMMENT '联系方式',
  `a_id` int(11) NOT NULL COMMENT '地区id',
  `c_intro` varchar(255) NOT NULL COMMENT '影院简介',
  `c_img_url` varchar(255) NOT NULL COMMENT '宣传图片地址',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_cinema` */

/*Table structure for table `t_film` */

DROP TABLE IF EXISTS `t_film`;

CREATE TABLE `t_film` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电影id',
  `f_name` varchar(255) NOT NULL COMMENT '电影名',
  `f_type` varchar(255) DEFAULT NULL COMMENT '电影类型',
  `f_country` varchar(255) DEFAULT NULL COMMENT '电影区域',
  `f_time` datetime DEFAULT NULL COMMENT '上映时间',
  `f_duration` int(11) DEFAULT NULL COMMENT '时长',
  `f_priture_url` varchar(255) DEFAULT NULL COMMENT '海报地址',
  `f_intro` varchar(2000) DEFAULT NULL COMMENT '剧情简介',
  `f_language` varchar(255) DEFAULT NULL COMMENT '语言版本',
  `f_office` double(255,0) DEFAULT NULL COMMENT '累计票房',
  `f_score` double DEFAULT NULL COMMENT '电影评分',
  `f_expectation_value` double DEFAULT NULL COMMENT '想看量',
  `f_status` int(11) DEFAULT '1' COMMENT '电影状态（0正映，1即映，2经典电影）',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_film` */

/*Table structure for table `t_filmimg` */

DROP TABLE IF EXISTS `t_filmimg`;

CREATE TABLE `t_filmimg` (
  `id` varchar(255) DEFAULT NULL COMMENT '影片图片集id',
  `f_img_url` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `f_id` int(11) DEFAULT NULL COMMENT '影片id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_filmimg` */

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `u_id` int(11) DEFAULT NULL COMMENT '用户id',
  `r_id` int(11) DEFAULT NULL COMMENT '放映记录id',
  `seat_num` int(11) DEFAULT NULL COMMENT '座位数量',
  `seat_info` varchar(255) DEFAULT NULL COMMENT '座位信息',
  `money` double(6,0) DEFAULT NULL COMMENT '金额',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `add_time` datetime DEFAULT NULL COMMENT '购买时间',
  `o_phone` int(11) DEFAULT NULL COMMENT '取票手机号',
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_order` */

/*Table structure for table `t_ordertype` */

DROP TABLE IF EXISTS `t_ordertype`;

CREATE TABLE `t_ordertype` (
  `ot_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单状态id',
  `typename` varchar(255) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`ot_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_ordertype` */

insert  into `t_ordertype`(`ot_id`,`typename`) values (1,'待支付'),(2,'未领票'),(3,'已完成');

/*Table structure for table `t_record` */

DROP TABLE IF EXISTS `t_record`;

CREATE TABLE `t_record` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '放映记录id',
  `f_id` int(11) DEFAULT NULL COMMENT '影片id',
  `c_id` int(11) DEFAULT NULL COMMENT '影院id',
  `room_id` int(11) DEFAULT NULL COMMENT '放映厅id',
  `starttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `endtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '预计结束时间',
  `total_num` int(11) DEFAULT NULL COMMENT '总座位数',
  `sel_num` int(11) DEFAULT NULL COMMENT '已售座位数',
  `r_price` double(10,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_record` */

/*Table structure for table `t_room` */

DROP TABLE IF EXISTS `t_room`;

CREATE TABLE `t_room` (
  `room_id` int(11) NOT NULL COMMENT '放映厅id',
  `room_name` varchar(255) NOT NULL COMMENT '放映厅名',
  `room_content` varchar(255) NOT NULL COMMENT '座位布局信息',
  `room_type` varchar(255) DEFAULT NULL COMMENT '放映厅类型',
  `room_num` int(11) DEFAULT NULL COMMENT '座位数',
  `c_id` int(11) DEFAULT NULL COMMENT '影院id',
  PRIMARY KEY (`room_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `t_room` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
