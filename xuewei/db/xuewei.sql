/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : xuewei

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-01-24 10:37:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for d_table_name
-- ----------------------------
DROP TABLE IF EXISTS `d_table_name`;
CREATE TABLE `d_table_name` (
  `userId` int(30) NOT NULL DEFAULT '0',
  `userName` varchar(30) DEFAULT NULL,
  `passWord` varchar(30) DEFAULT NULL,
  `age` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL COMMENT '0为超级管理员，1为管理员，2为用户'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_table_name
-- ----------------------------

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `typeid` int(10) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('0', '超级管理员');
INSERT INTO `t_type` VALUES ('1', '管理员');
INSERT INTO `t_type` VALUES ('2', '用户');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` int(30) NOT NULL AUTO_INCREMENT,
  `userName` varchar(30) DEFAULT NULL,
  `passWord` varchar(30) DEFAULT NULL,
  `age` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL COMMENT '0为超级管理员，1为管理员，2为用户',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'admin', '22', '123@qq.com', '13088889999', '1');
INSERT INTO `t_user` VALUES ('2', 'zhang', 'zhang', '23', '111@123.com', '12123213214', '2');
INSERT INTO `t_user` VALUES ('3', 'ma', 'ma', '27', '222@222.com', '13222222222', '2');
INSERT INTO `t_user` VALUES ('4', 'superadmin', 'superadmin', '32', '222@222.com', '18899990000', '0');
INSERT INTO `t_user` VALUES ('5', 'zhangsan', 'zhangsan', '33', '3222@222.com', '17766663222', '2');
