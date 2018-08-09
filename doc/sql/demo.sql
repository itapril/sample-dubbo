/*
Navicat MySQL Data Transfer

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-08-09 16:24:39
*/


CREATE DATABASE IF NOT EXISTS `demo` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

USE `demo`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `uuid` varchar(64) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES ('18df860459524c448bb485ec58d5b300', 'test_demo7', '2018-08-02 19:00:43', '2018-08-02 19:00:43');
INSERT INTO `demo` VALUES ('1f9ff5f5a6e54976becc859c3106212e', 'test_demo8', '2018-08-09 11:16:24', '2018-08-09 11:16:24');
INSERT INTO `demo` VALUES ('2cc9a609c2b648e996f6f6fbbd723b1a', 'test_dem23o8', '2018-08-09 13:15:56', '2018-08-09 13:15:56');
INSERT INTO `demo` VALUES ('5e4a80c780c745df80f5002cbda428bc', 'test_demo6', '2018-08-02 18:54:29', '2018-08-02 18:54:29');
INSERT INTO `demo` VALUES ('ac68368d139343e282db475c28d69ac8', 'test_demo8', '2018-08-09 11:12:43', '2018-08-09 11:12:43');
