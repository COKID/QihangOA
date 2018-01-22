# Host: localhost  (Version 5.7.20-log)
# Date: 2018-01-22 17:55:05
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "borrow_log"
#

DROP TABLE IF EXISTS `borrow_log`;
CREATE TABLE `borrow_log` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `borrow_name` varchar(255) DEFAULT NULL COMMENT '借阅书名',
  `borrow_user` varchar(255) DEFAULT NULL COMMENT '借阅人',
  `borrow_date` varchar(255) DEFAULT NULL COMMENT '借阅日期',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='借阅信息';

#
# Data for table "borrow_log"
#


#
# Structure for table "department"
#

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "department"
#

INSERT INTO `department` VALUES (1,'开发部'),(2,'市场部'),(3,'行政部'),(4,'人力资源部');

#
# Structure for table "library"
#

DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
  `BookName` varchar(255) NOT NULL COMMENT '书名',
  `author` varchar(255) DEFAULT NULL COMMENT '作者',
  `publisher` varchar(255) DEFAULT NULL COMMENT '出版社',
  `publish_date` varchar(255) DEFAULT NULL COMMENT '出版日期',
  `total_num` varchar(255) DEFAULT NULL COMMENT '总数目',
  `price` varchar(255) DEFAULT NULL COMMENT '单价',
  `bill_num` varchar(255) DEFAULT NULL COMMENT '发票号',
  `register_date` varchar(255) DEFAULT NULL COMMENT '登记日期',
  `buy_people` varchar(255) DEFAULT NULL COMMENT '购置人',
  `deal_people` varchar(255) DEFAULT NULL COMMENT '经办人',
  `available` varchar(255) DEFAULT NULL COMMENT '可借数目',
  PRIMARY KEY (`BookName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "library"
#

INSERT INTO `library` VALUES ('Cocoa入门：使用Objective-C（第3版）','Paris Buttfield-Addison，Jon Manning             ',' 中国电力出版社','2015.01','1','39','10845431','2017-11-17','张智翔','张亚菲','1'),('iOS开发指南 （第5版）','关东升','人民邮电出版社','2017.05','1','85','10845431','2017-11-17','张智翔','张亚菲','1'),('Spring Boot实战','Craig Walls','人民邮电出版社','2016.09','1','46.6','10845431','2017-11-17','张智翔','张亚菲','1'),('Spring Cloud微服务实战','翟永超','电子工业出版社','2017.05','1','70.3','10845431','2017-11-17','张智翔','张亚菲','1'),('你不知道的JavaScript（上卷）','Kyle Simpson','人民邮电出版社','2015.04','1','38.7','10845431','2017-11-17','张智翔','张亚菲','1'),('你不知道的JavaScript（中卷）','Kyle Simpson','人民邮电出版社','2016.08','1','62.4','10845431','2017-11-17','张智翔','张亚菲','1'),('图灵程序设计丛书:学习R','Richard Cotton','人民邮电出版社','2014.06','1','55.5','47405952','2017-11-17','张智翔','张亚菲','1'),('图解Java多线程设计模式','结城浩','人民邮电出版社','2017.08','1','68','47405952','2017-11-17','张智翔','张亚菲','1'),('机器学习','周志华','清华大学出版社','2016.01','1','69.67','47405952','2017-11-17','张智翔','张亚菲','1'),('机器学习:从公理到算法','于剑','清华大学出版社','2017.07','1','63.5',NULL,'2017-11-17','张智翔','张亚菲','1'),('深度学习','Ian Goodfellow','人民邮电出版社','2017.07','1','120.3','47405952','2017-11-17','张智翔','张亚菲','1'),('统计学习方法','李航','清华大学出版社','2012.03','1','30.93','47405952','2017-11-17','张智翔','张亚菲','1'),('统计自然语言处理(第2版)','宗成庆','清华大学出版社','2013.08','1','71.2','47405952','2017-11-17','张智翔','张亚菲','1'),('计算机视觉：算法与应用（套装共2册）','Richard Szeliski','清华大学出版社','2012.01','2','98.8','10845431','2017-11-17','张智翔','张亚菲','2');

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `QihangID` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `deparment` varchar(2) DEFAULT NULL COMMENT '部门',
  `grade` varchar(255) DEFAULT NULL COMMENT '年级',
  `major` varchar(255) DEFAULT NULL COMMENT '专业',
  `tel` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `mail` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `github` varchar(255) DEFAULT NULL COMMENT 'github地址',
  `blog` varchar(255) DEFAULT NULL COMMENT '博客地址',
  PRIMARY KEY (`QihangID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

