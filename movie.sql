/*
 Navicat Premium Data Transfer

 Source Server         : fan
 Source Server Type    : MySQL
 Source Server Version : 50548
 Source Host           : localhost:3306
 Source Schema         : movie

 Target Server Type    : MySQL
 Target Server Version : 50548
 File Encoding         : 65001

 Date: 21/12/2019 20:50:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_actor
-- ----------------------------
DROP TABLE IF EXISTS `t_actor`;
CREATE TABLE `t_actor`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '演员id',
  `actorName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '演员名',
  `actorSex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '演员性别',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '演员地区',
  `born` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '演员出生日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_actorfilm
-- ----------------------------
DROP TABLE IF EXISTS `t_actorfilm`;
CREATE TABLE `t_actorfilm`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '影片演员关系id',
  `actorId` int(10) NOT NULL COMMENT '演员id',
  `filmId` int(10) NOT NULL COMMENT '影片id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_actorimg
-- ----------------------------
DROP TABLE IF EXISTS `t_actorimg`;
CREATE TABLE `t_actorimg`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '照片演员的关系id',
  `imgUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '照片路径',
  `aid` int(10) DEFAULT NULL COMMENT '演员id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_address
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地区id',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地区名',
  `parentId` int(11) DEFAULT NULL COMMENT '父地区id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_address
-- ----------------------------
INSERT INTO `t_address` VALUES (1, '北京', 0);
INSERT INTO `t_address` VALUES (2, '河南', 0);
INSERT INTO `t_address` VALUES (3, '上海', 0);
INSERT INTO `t_address` VALUES (4, '江苏', 0);
INSERT INTO `t_address` VALUES (5, '深圳', 0);
INSERT INTO `t_address` VALUES (6, '山东', 0);
INSERT INTO `t_address` VALUES (7, '陕西', 0);
INSERT INTO `t_address` VALUES (8, '河北', 0);
INSERT INTO `t_address` VALUES (9, '郑州', 2);
INSERT INTO `t_address` VALUES (10, '开封', 2);

-- ----------------------------
-- Table structure for t_cinema
-- ----------------------------
DROP TABLE IF EXISTS `t_cinema`;
CREATE TABLE `t_cinema`  (
  `id` int(11) NOT NULL COMMENT '电影院id',
  `cinemaName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影院名',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影院详细地址',
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系方式',
  `addressId` int(11) NOT NULL COMMENT '地区id',
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '影院简介',
  `imgUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '宣传图片地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_cinema
-- ----------------------------
INSERT INTO `t_cinema` VALUES (1, '光合', '二七区工人路店', '0371-66666666', 9, NULL, NULL);

-- ----------------------------
-- Table structure for t_film
-- ----------------------------
DROP TABLE IF EXISTS `t_film`;
CREATE TABLE `t_film`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电影id',
  `filmName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电影名',
  `filmType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影类型',
  `filmArea` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影区域',
  `showTime` datetime DEFAULT NULL COMMENT '上映时间',
  `duration` int(11) DEFAULT NULL COMMENT '时长',
  `posterUrl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '海报地址',
  `filmIntro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '剧情简介',
  `language` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '语言版本',
  `boxOffice` decimal(10, 0) DEFAULT NULL COMMENT '累计票房',
  `filmScore` decimal(10, 0) DEFAULT NULL COMMENT '电影评分',
  `expect` decimal(10, 0) DEFAULT NULL COMMENT '想看量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_filmimg
-- ----------------------------
DROP TABLE IF EXISTS `t_filmimg`;
CREATE TABLE `t_filmimg`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '影片图片集id',
  `filmImgUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图片地址',
  `filmId` int(11) DEFAULT NULL COMMENT '影片id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `recordId` int(11) DEFAULT NULL COMMENT '放映记录id',
  `seatNum` int(11) DEFAULT NULL COMMENT '座位数量',
  `seatInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '座位信息',
  `money` decimal(6, 2) DEFAULT NULL COMMENT '金额',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `buyTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '购买时间',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '取票手机号',
  `orderNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (1, 1, 2, 2, '三排一号，三排二号', 59.00, 2, '2019-12-20 08:12:14', '18878944578', '20191220081214263863');

-- ----------------------------
-- Table structure for t_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `t_orderitem`;
CREATE TABLE `t_orderitem`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `oid` int(20) DEFAULT NULL COMMENT '订单编号',
  `roomName` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '放映厅',
  `ticketInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '票信息',
  `cinemaName` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电影院',
  `seatInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '座位',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_orderitem
-- ----------------------------
INSERT INTO `t_orderitem` VALUES (1, 1, '一号厅', '三排四座', '光合影城', '3-4');
INSERT INTO `t_orderitem` VALUES (2, 1, '一号厅', '三排五座', '光合影城', '3-5');

-- ----------------------------
-- Table structure for t_record
-- ----------------------------
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE `t_record`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '放映记录id',
  `filmId` int(11) DEFAULT NULL COMMENT '影片id',
  `cinemaId` int(11) DEFAULT NULL COMMENT '影院id',
  `roomId` int(11) DEFAULT NULL COMMENT '放映厅id',
  `startTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `endTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '预计结束时间',
  `totalSeat` int(11) DEFAULT NULL COMMENT '总座位数',
  `sellNum` int(11) DEFAULT NULL COMMENT '已售座位数',
  `profit` decimal(10, 2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_room
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '放映厅id',
  `roomName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '放映厅名',
  `seatFound` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '座位布局信息',
  `roomType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '放映厅类型',
  `seatNum` int(11) DEFAULT NULL COMMENT '座位数',
  `cinemaId` int(11) DEFAULT NULL COMMENT '影院id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_room
-- ----------------------------
INSERT INTO `t_room` VALUES (1, '光合一号厅', '普通', '2D', 55, 1);
INSERT INTO `t_room` VALUES (2, '光合二号厅', '高级', '3D', 50, 1);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户昵称',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  `animation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '生活状态',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
