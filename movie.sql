/*
 Navicat Premium Data Transfer

 Source Server         : 123456
 Source Server Type    : MySQL
 Source Server Version : 50548
 Source Host           : localhost:3306
 Source Schema         : movie

 Target Server Type    : MySQL
 Target Server Version : 50548
 File Encoding         : 65001

 Date: 12/12/2019 17:09:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for actorimg
-- ----------------------------
DROP TABLE IF EXISTS `actorimg`;
CREATE TABLE `actorimg`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '照片演员的关系id',
  `a_img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '照片路径',
  `a_id` int(11) DEFAULT NULL COMMENT '演员id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_actor
-- ----------------------------
DROP TABLE IF EXISTS `t_actor`;
CREATE TABLE `t_actor`  (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '演员id',
  `a_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '演员名',
  `a_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '演员性别',
  `a_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '演员地区',
  `a_birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '演员出生日期',
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_actorfilm
-- ----------------------------
DROP TABLE IF EXISTS `t_actorfilm`;
CREATE TABLE `t_actorfilm`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '影片演员关系id',
  `a_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '演员id',
  `f_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '影片id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_address
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address`  (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地区id',
  `a_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地区名',
  `pri_id` int(11) DEFAULT NULL COMMENT '父地区id',
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_address
-- ----------------------------
INSERT INTO `t_address` VALUES (1, '北京', NULL);
INSERT INTO `t_address` VALUES (2, '郑州', NULL);
INSERT INTO `t_address` VALUES (3, '上海', NULL);
INSERT INTO `t_address` VALUES (4, '杭州', NULL);
INSERT INTO `t_address` VALUES (5, '深圳', NULL);
INSERT INTO `t_address` VALUES (6, '开封', NULL);
INSERT INTO `t_address` VALUES (7, '青岛', NULL);
INSERT INTO `t_address` VALUES (8, '合肥', NULL);
INSERT INTO `t_address` VALUES (9, '南昌', NULL);
INSERT INTO `t_address` VALUES (10, '太原', NULL);

-- ----------------------------
-- Table structure for t_cinema
-- ----------------------------
DROP TABLE IF EXISTS `t_cinema`;
CREATE TABLE `t_cinema`  (
  `c_id` int(11) NOT NULL COMMENT '电影院id',
  `c_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影院名',
  `c_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影院详细地址',
  `c_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系方式',
  `a_id` int(11) NOT NULL COMMENT '地区id',
  `c_intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '影院简介',
  `c_img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '宣传图片地址',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_film
-- ----------------------------
DROP TABLE IF EXISTS `t_film`;
CREATE TABLE `t_film`  (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电影id',
  `f_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影名',
  `f_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影类型',
  `f_country` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影区域',
  `f_time` datetime DEFAULT NULL COMMENT '上映时间',
  `f_duration` int(11) DEFAULT NULL COMMENT '时长',
  `f_priture_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '海报地址',
  `f_intro` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '剧情简介',
  `f_language` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '语言版本',
  `f_office` double(255, 0) DEFAULT NULL COMMENT '累计票房',
  `f_score` double DEFAULT NULL COMMENT '电影评分',
  `f_expectation_value` double DEFAULT NULL COMMENT '想看量',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_filmimg
-- ----------------------------
DROP TABLE IF EXISTS `t_filmimg`;
CREATE TABLE `t_filmimg`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '影片图片集id',
  `f_img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图片地址',
  `f_id` int(11) DEFAULT NULL COMMENT '影片id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `o_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `u_id` int(11) DEFAULT NULL COMMENT '用户id',
  `r_id` int(11) DEFAULT NULL COMMENT '放映记录id',
  `seat_num` int(11) DEFAULT NULL COMMENT '座位数量',
  `seat_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '座位信息',
  `money` double(6, 0) DEFAULT NULL COMMENT '金额',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `add_time` datetime DEFAULT NULL COMMENT '购买时间',
  `o_phone` int(11) DEFAULT NULL COMMENT '取票手机号',
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ordertype
-- ----------------------------
DROP TABLE IF EXISTS `t_ordertype`;
CREATE TABLE `t_ordertype`  (
  `ot_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单状态id',
  `typename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`ot_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_ordertype
-- ----------------------------
INSERT INTO `t_ordertype` VALUES (1, '待支付');
INSERT INTO `t_ordertype` VALUES (2, '未领票');
INSERT INTO `t_ordertype` VALUES (3, '已完成');

-- ----------------------------
-- Table structure for t_record
-- ----------------------------
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE `t_record`  (
  `r_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '放映记录id',
  `f_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '影片id',
  `c_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '影院id',
  `room_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '放映厅id',
  `starttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `endtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '预计结束时间',
  `total_num` int(11) DEFAULT NULL COMMENT '总座位数',
  `sel_num` int(11) DEFAULT NULL COMMENT '已售座位数',
  `r_price` double(10, 2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_room
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room`  (
  `room_id` int(11) NOT NULL COMMENT '放映厅id',
  `room_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '放映厅名',
  `room_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '座位布局信息',
  `room_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '放映厅类型',
  `room_num` int(11) DEFAULT NULL COMMENT '座位数',
  `c_id` int(11) DEFAULT NULL COMMENT '影院id',
  PRIMARY KEY (`room_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `u_idu_` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户昵称',
  `u_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `u_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `brithday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  `animation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '生活状态',
  `u_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  PRIMARY KEY (`u_idu_`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
