/*
 Navicat Premium Data Transfer

 Source Server         : 182.254.159.91
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : 182.254.159.91:3306
 Source Schema         : cep

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 23/08/2019 19:35:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cep_rule
-- ----------------------------
DROP TABLE IF EXISTS `cep_rule`;
CREATE TABLE `cep_rule`  (
  `id` int(20) NOT NULL COMMENT '唯一标识',
  `rule_trigger_id` int(20) NOT NULL,
  `rule_name` varchar(128) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '规则名称',
  `from_destination` varchar(64) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '数据的来源',
  `type` tinyint(4) NULL DEFAULT NULL COMMENT '类型，当前默认为json',
  `status` tinyint(2) UNSIGNED ZEROFILL NOT NULL COMMENT '0：规则未启动标识\r\n1：规则启动标识\r\n2：规则删除标识\r\n',
  `condition_type` int(1) NULL DEFAULT NULL COMMENT '触发条件类型，1标识topic，2标识流向关系型数据局',
  `broker_url` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '触发Topic，流向的broker',
  `to_destination` varchar(64) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '需要将触发事件后，信息发布流向的Topic',
  `databaseUrl` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '流向关系数据库',
  `create_time` datetime(0) NOT NULL COMMENT '默认为当前时间',
  `error_destination` varchar(64) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '错误时，需要发布信息流向的Topic',
  `error_code` varchar(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `error_message` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `ex_param` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for rule_trigger
-- ----------------------------
DROP TABLE IF EXISTS `rule_trigger`;
CREATE TABLE `rule_trigger`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `rule_id` int(20) NOT NULL COMMENT '规则的唯一标识',
  `filter_tag` tinyint(2) NULL DEFAULT NULL COMMENT '过滤条件\r\n1标识作为筛选项，0则不是。可以根据标识获取那些字段是需要被筛选出来',
  `payload` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '每个字段的定义的数据',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for topic_list
-- ----------------------------
DROP TABLE IF EXISTS `topic_list`;
CREATE TABLE `topic_list`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `topic_name` varchar(64) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `topic_content` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '事件信息的描述',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_owner` varchar(64) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '事件的创建人\r\n',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
