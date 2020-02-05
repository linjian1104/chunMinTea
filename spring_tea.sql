/*
Navicat MySQL Data Transfer

Source Server         : bendi
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : spring_tea

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-12-17 17:27:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `allcontent`
-- ----------------------------
DROP TABLE IF EXISTS `allcontent`;
CREATE TABLE `allcontent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `lunbo` varchar(255) DEFAULT NULL,
  `demo2` varchar(255) DEFAULT NULL,
  `demo3` int(11) DEFAULT NULL,
  `demo4` int(11) DEFAULT NULL,
  `demo5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of allcontent
-- ----------------------------
INSERT INTO `allcontent` VALUES ('1', 'http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg', '功夫红茶', '工夫红茶原料细嫩,制工精细,外形条索紧直,匀齐,色泽乌润,香气浓郁,滋味醇和而甘浓,汤色,叶底红艳明亮,具有形质兼优的品质特征.,内含物质十分丰富，茶多酚和儿茶素较高，茶芽壮多毫，具有优良的发酵性能和丰富的多酚类物质', '50', '1', 'tea', '39', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('2', 'http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg', '绿茶', '绿茶是不发酵茶,防衰老、防癌、抗癌、杀菌、消炎等均有特殊效果，为发酵类茶等所不及。', '55', '1', 'tea', '31', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('3', 'http://uploads.5068.com/allimg/1809/211-1PZ1160105.jpg', '花茶', '花茶是集茶味与花香于一体，既保持了浓郁爽口的茶味，又有鲜灵芬芳的花香。花香袭人，甘芳满口，令人心旷神怡。', '30', '1', 'tea', '37', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('4', 'http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20171117/f6d91e11e2d3494faed3c4d4c112a3b9.jpeg', '乌龙茶', '茶叶中的有机化学成分和无机矿物元素含有许多营养成分和药效成分。', '55', '1', 'tea', '16', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('5', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1576200518&di=c5de31d141d8f17a76b237870cb4eadc&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.njfzny.com%2Fkindeditor%2Fphp%2F..%2Fattached%2Fimage%2F20181115%2F20181115211325_45890.jpg', '白茶', '成茶满披白毫、汤色清淡、味鲜醇、有毫香.素有“绿妆素裹”之美感，芽头肥壮，汤色黄亮，滋味鲜醇，叶底嫩匀。', '45', '1', 'tea', '70', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('6', 'http://image.chawenyi.com/201903/2019032861550_b.jpg', '南湖银芽茶', '外形似月芽，嫩绿披白毫。内质香气清高，滋味清爽，汤色嫩绿清澈，叶底绿明亮。', '50', '1', 'tea', '52', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('7', 'http://img.zx123.cn/Resources/zx123cn/uploadfile/2015/0516/e05d6df60f4b9e3bc13dc8b74bf4ff60.jpg', '春华阁', '吊顶装饰 复古风茶楼', '130', '1', 'house', '0', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('8', 'http://img.zx123.cn/Resources/zx123cn/uploadfile/2016/0613/084d101a7066af146268d0067e0f16fc.jpg', '夏梦阁', '棋与茶的交汇，古木家具的沉稳环境。', '190', '1', 'house', '0', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('9', 'http://www.tuozhe8.com/data/attachment/forum/threadcover/12/e1/1297945.jpg', '迎香阁', '古风与现代装饰的巧妙融合', '150', '1', 'house', '0', '1', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('10', 'http://img.zcool.cn/community/018ef45632ea256ac7259e0f9af769.png', '明瑞阁', '身处茶楼，却似在山林间', '150', '1', 'house', '0', '1', 'true', null, null, null, null);
INSERT INTO `allcontent` VALUES ('11', 'http://img.zcool.cn/community/0101cf5637166532f87512f6cdf09f.jpg@900w_1l_2o_100sh.jpg', '鸿福阁', '柔软的沙发，温暖色的灯光，品茶再好不过如此。', '160', '1', 'house', '0', '1', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('12', 'http://img.zx123.cn/Resources/zx123cn/uploadfile/2018/1218/2d9f89ef7a4db7c6c8c84614d7db0bd0.jpg', '华锦阁', '80平米中式禅意茶楼,宽敞明亮舒适', '160', '1', 'house', '0', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('13', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575605739653&di=47525a69852719ad4ab82b59cc4dcebc&imgtype=0&src=http%3A%2F%2Fpic.pingguolv.com%2Fuploads%2Fallimg%2F181031%2F77-1Q031160I8.jpg', '瓜子', '受广大顾客喜欢的小吃，一份200g.', '10', '1', 'snack', '85', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('14', 'http://photocdn.sohu.com/20130427/Img374279387.jpg', '黄金豆腐块', '素有“植物肉”之美称。豆腐的消化吸收率达95%以上。两小块豆腐，即可满足一个人一天钙的需要量', '15', '1', 'snack', '36', '1', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('15', 'http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg', '糕点', '面团的甜食，补充人体糖分。一份5个。', '20', '1', 'snack', '41', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('16', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575509041&di=560dea812d3ebdf1cc730befda4b1a4a&imgtype=jpg&er=1&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170818%2Ff601fbe7710541728398f09ac48a49e0.jpeg', '白毛茶', '生津解渴、醒脑提神、消食开胃、防治疴呕吐、预防龋齿、驱除口臭、降低血压等多种功效。常饮可健身益寿。', '35', '1', 'tea', '29', '1', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('17', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=814057752,4163659045&fm=26&gp=0.jpg', '黑茶', '膳食营养，助消化解油，降脂减肥，抗氧化，抗癌，降血压，降血糖，杀菌消炎，利尿解毒', '30', '1', 'tea', '18', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('18', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575509896&di=421fbea7864280818971b39def5063a0&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.cqtea.net%2Fup%2Fimg%2F20170321145717747764.jpg', '黄茶', '提神醒脑，消除疲劳，消食化滞等。对脾胃最有好处，消化不良，食欲不振、懒动肥胖、都可饮而化之。', '35', '1', 'tea', '19', '0', null, null, null, null, null);
INSERT INTO `allcontent` VALUES ('19', 'http://image.chawenyi.com/201904/2019040364716_b.jpg', '特级绿春玛玉茶', '绿春玛玉茶的品质特点是，外形条索紧结重实，白毫显露，香高持久，滋味鲜爽浓厚，伴有蜜糖香味，汤色黄绿清澈，叶底嫩黄匀整明亮。更有趣的是，常泡玛玉茶的杯壁不起茶垢，故被称为不起茶垢的绿春玛玉茶。', '30', '1', 'tea', '15', '0', 'true', null, null, null, null);
INSERT INTO `allcontent` VALUES ('20', 'http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20190311/76e0e9a61698448f9fd7b3b5654e146b.jpeg', '大红袍', '大红袍有茶多酚、茶多糖、茶氨酸三种有益成分高，具有抗癌、降血脂、增强记忆力，降血压等良好的作用。一是茶多酚特别多，其中最重要的EGCG具有抗癌功能；茶多糖含量是红茶的3.1倍，绿茶的1.7倍，可以增强人体免疫力，降低血脂；', '45', '1', 'tea', '27', '0', 'true', null, null, null, null);
INSERT INTO `allcontent` VALUES ('22', 'http://img.zcool.cn/community/019bd25632ea256ac7259e0f8f6840.png', '宁静阁', '古色装饰与盆栽的融合，给人宁静的心里感受', '125', '1', 'house', '0', '0', 'true', null, null, null, null);

-- ----------------------------
-- Table structure for `invite_code`
-- ----------------------------
DROP TABLE IF EXISTS `invite_code`;
CREATE TABLE `invite_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `invite_code` varchar(255) DEFAULT NULL,
  `state` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of invite_code
-- ----------------------------
INSERT INTO `invite_code` VALUES ('2', 'songmingjie', '1');
INSERT INTO `invite_code` VALUES ('3', 'zhouerwa', '1');
INSERT INTO `invite_code` VALUES ('4', 'songlaosan', '1');

-- ----------------------------
-- Table structure for `joinuser`
-- ----------------------------
DROP TABLE IF EXISTS `joinuser`;
CREATE TABLE `joinuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `six` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `cardId` varchar(255) DEFAULT NULL,
  `joinDate` varchar(255) DEFAULT NULL,
  `exitDate` varchar(255) DEFAULT NULL,
  `realm` tinyint(4) DEFAULT NULL,
  `workDay` tinyint(4) DEFAULT NULL COMMENT '0',
  `status` tinyint(4) DEFAULT NULL COMMENT '0\r\n',
  `realDay` tinyint(4) DEFAULT NULL COMMENT '0',
  `absenteeism` tinyint(4) DEFAULT NULL,
  `statusDate` varchar(255) DEFAULT NULL,
  `absenteeismDate` varchar(255) DEFAULT NULL,
  `localMap` varchar(255) DEFAULT NULL,
  `yearDay` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of joinuser
-- ----------------------------
INSERT INTO `joinuser` VALUES ('1', 'admin', '111111', null, '12', '12', '12', '', '', '0', '21', '-1', '2', '1', '', '', '北京市朝阳区', null);
INSERT INTO `joinuser` VALUES ('2', 'linjian', '548534', null, '20', '15680001306', '51098012456487465', '', '', '1', null, null, null, null, null, null, null, '20');
INSERT INTO `joinuser` VALUES ('26', 'liulei', '000000', '男', '54', '19940897748', '1111', '2019-09-19', null, '0', '0', '0', '0', '0', null, null, null, null);

-- ----------------------------
-- Table structure for `managers`
-- ----------------------------
DROP TABLE IF EXISTS `managers`;
CREATE TABLE `managers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of managers
-- ----------------------------
INSERT INTO `managers` VALUES ('1', 'shiyue', '13458552184', '13458552184');

-- ----------------------------
-- Table structure for `orderlist`
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `openId` varchar(255) DEFAULT NULL,
  `orderInfo` longtext,
  `orderPrice` double DEFAULT NULL,
  `orderDate` varchar(255) DEFAULT NULL,
  `orderStatus` varchar(255) DEFAULT NULL,
  `custormPrice` double DEFAULT NULL,
  `orderCount` int(11) DEFAULT NULL,
  `orderNumber` varchar(255) DEFAULT NULL,
  `houseNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=MyISAM AUTO_INCREMENT=195 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of orderlist
-- ----------------------------
INSERT INTO `orderlist` VALUES ('140', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://image.chawenyi.com/201903/2019032861550_b.jpg\",\"price\":50,\"num\":1,\"name\":\"南湖银芽茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-16  11:48:11', '已完成', '12', '0', '2019-12-16  11:48:11', '大厅');
INSERT INTO `orderlist` VALUES ('141', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575605739653&di=47525a69852719ad4ab82b59cc4dcebc&imgtype=0&src=http%3A%2F%2Fpic.pingguolv.com%2Fuploads%2Fallimg%2F181031%2F77-1Q031160I8.jpg\",\"price\":10,\"num\":1,\"name\":\"瓜子\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:42:39', '已完成', '12', '0', '2019-12-16  16:42:39', '大厅');
INSERT INTO `orderlist` VALUES ('142', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('143', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('144', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('145', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('146', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('147', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('148', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('149', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://images.quanjing.com/mhrf003/high/mhrf-dspd51180f10.jpg\",\"price\":20,\"num\":1,\"name\":\"糕点\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-16  16:44:25', '已完成', '12', '0', '2019-12-16  16:44:25', '大厅');
INSERT INTO `orderlist` VALUES ('150', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20190311/76e0e9a61698448f9fd7b3b5654e146b.jpeg\",\"price\":45,\"num\":1,\"name\":\"大红袍\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  09:20:41', '已完成', '12', '0', '2019-12-17  09:20:41', '大厅');
INSERT INTO `orderlist` VALUES ('151', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://photocdn.sohu.com/20130427/Img374279387.jpg\",\"price\":15,\"num\":1,\"name\":\"黄金豆腐块\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-17  09:43:11', '已完成', '12', '0', '2019-12-17  09:43:11', '大厅');
INSERT INTO `orderlist` VALUES ('152', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://photocdn.sohu.com/20130427/Img374279387.jpg\",\"price\":15,\"num\":1,\"name\":\"黄金豆腐块\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-17  09:43:11', '已完成', '12', '0', '2019-12-17  09:43:11', '大厅');
INSERT INTO `orderlist` VALUES ('153', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://photocdn.sohu.com/20130427/Img374279387.jpg\",\"price\":15,\"num\":1,\"name\":\"黄金豆腐块\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-17  09:43:11', '已完成', '12', '0', '2019-12-17  09:43:11', '大厅');
INSERT INTO `orderlist` VALUES ('154', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://photocdn.sohu.com/20130427/Img374279387.jpg\",\"price\":15,\"num\":1,\"name\":\"黄金豆腐块\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-17  09:43:11', '已完成', '12', '0', '2019-12-17  09:43:11', '大厅');
INSERT INTO `orderlist` VALUES ('155', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://photocdn.sohu.com/20130427/Img374279387.jpg\",\"price\":15,\"num\":1,\"name\":\"黄金豆腐块\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-17  09:43:11', '已完成', '12', '0', '2019-12-17  09:43:11', '大厅');
INSERT INTO `orderlist` VALUES ('156', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1575509041&di=560dea812d3ebdf1cc730befda4b1a4a&imgtype=jpg&er=1&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170818%2Ff601fbe7710541728398f09ac48a49e0.jpeg\",\"price\":35,\"num\":1,\"name\":\"白毛茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  09:52:12', '已完成', '12', '0', '2019-12-17  09:52:12', '大厅');
INSERT INTO `orderlist` VALUES ('157', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.chawenyi.com/201904/2019040364716_b.jpg\",\"price\":30,\"num\":1,\"name\":\"特级绿春玛玉茶\",\"isSelect\":true,\"type\":\"tea\"},{\"image\":\"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=814057752,4163659045&fm=26&gp=0.jpg\",\"price\":30,\"num\":1,\"name\":\"黑茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  09:57:04', '已完成', '12', '0', '2019-12-17  09:57:04', '大厅');
INSERT INTO `orderlist` VALUES ('158', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', '[{\"image\":\"http://photocdn.sohu.com/20130427/Img374279387.jpg\",\"price\":15,\"num\":1,\"name\":\"黄金豆腐块\",\"isSelect\":true,\"type\":\"snack\"}]', '12.8', '2019-12-17  10:40:36', '已完成', '12', '0', '2019-12-17  10:40:36', '大厅');
INSERT INTO `orderlist` VALUES ('159', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=814057752,4163659045&fm=26&gp=0.jpg\",\"price\":30,\"num\":1,\"name\":\"黑茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  11:56:41', '已完成', '12', '0', '2019-12-17  11:56:41', '大厅');
INSERT INTO `orderlist` VALUES ('160', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=814057752,4163659045&fm=26&gp=0.jpg\",\"price\":30,\"num\":1,\"name\":\"黑茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  13:56:19', '已完成', '12', '0', '2019-12-17  13:56:19', '大厅');
INSERT INTO `orderlist` VALUES ('161', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1576200518&di=c5de31d141d8f17a76b237870cb4eadc&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.njfzny.com%2Fkindeditor%2Fphp%2F..%2Fattached%2Fimage%2F20181115%2F20181115211325_45890.jpg\",\"price\":45,\"num\":2,\"name\":\"白茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:36:23', '已完成', '12', '0', '2019-12-17  14:36:23', '大厅');
INSERT INTO `orderlist` VALUES ('162', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1576200518&di=c5de31d141d8f17a76b237870cb4eadc&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.njfzny.com%2Fkindeditor%2Fphp%2F..%2Fattached%2Fimage%2F20181115%2F20181115211325_45890.jpg\",\"price\":45,\"num\":1,\"name\":\"白茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:36:23', '已完成', '12', '0', '2019-12-17  14:36:23', '大厅');
INSERT INTO `orderlist` VALUES ('163', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:36:23', '已完成', '12', '0', '2019-12-17  14:36:23', '大厅');
INSERT INTO `orderlist` VALUES ('164', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"},{\"image\":\"http://uploads.5068.com/allimg/1809/211-1PZ1160105.jpg\",\"price\":30,\"num\":1,\"name\":\"花茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:46:55', '已完成', '12', '0', '2019-12-17  14:46:55', '大厅');
INSERT INTO `orderlist` VALUES ('165', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20171117/f6d91e11e2d3494faed3c4d4c112a3b9.jpeg\",\"price\":55,\"num\":1,\"name\":\"乌龙茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:55:22', '已完成', '12', '0', '2019-12-17  14:55:22', '大厅');
INSERT INTO `orderlist` VALUES ('166', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:57:32', '已完成', '12', '0', '2019-12-17  14:57:32', '大厅');
INSERT INTO `orderlist` VALUES ('167', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  14:58:57', '已完成', '12', '0', '2019-12-17  14:58:57', '大厅');
INSERT INTO `orderlist` VALUES ('168', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:01:01', '已完成', '12', '0', '2019-12-17  15:01:01', '大厅');
INSERT INTO `orderlist` VALUES ('169', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:05:55', '已完成', '12', '0', '2019-12-17  15:05:55', '大厅');
INSERT INTO `orderlist` VALUES ('170', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:07:04', '已完成', '12', '0', '2019-12-17  15:07:04', '大厅');
INSERT INTO `orderlist` VALUES ('171', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:23:10', '已完成', '12', '0', '2019-12-17  15:23:10', '大厅');
INSERT INTO `orderlist` VALUES ('172', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:23:10', '已完成', '12', '0', '2019-12-17  15:23:10', '大厅');
INSERT INTO `orderlist` VALUES ('173', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20171117/f6d91e11e2d3494faed3c4d4c112a3b9.jpeg\",\"price\":55,\"num\":1,\"name\":\"乌龙茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:23:10', '已完成', '12', '0', '2019-12-17  15:23:10', '大厅');
INSERT INTO `orderlist` VALUES ('174', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:30:19', '已完成', '12', '0', '2019-12-17  15:30:19', '大厅');
INSERT INTO `orderlist` VALUES ('175', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:30:19', '已完成', '12', '0', '2019-12-17  15:30:19', '大厅');
INSERT INTO `orderlist` VALUES ('176', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:42:19', '已完成', '12', '0', '2019-12-17  15:42:19', '大厅');
INSERT INTO `orderlist` VALUES ('177', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20171117/f6d91e11e2d3494faed3c4d4c112a3b9.jpeg\",\"price\":55,\"num\":1,\"name\":\"乌龙茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  15:42:19', '已完成', '12', '0', '2019-12-17  15:42:19', '大厅');
INSERT INTO `orderlist` VALUES ('178', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:03:18', '已完成', '12', '0', '2019-12-17  16:03:18', '大厅');
INSERT INTO `orderlist` VALUES ('179', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:03:18', '已完成', '12', '0', '2019-12-17  16:03:18', '大厅');
INSERT INTO `orderlist` VALUES ('180', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.chawenyi.com/201903/2019032861550_b.jpg\",\"price\":50,\"num\":1,\"name\":\"南湖银芽茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:03:18', '已完成', '12', '0', '2019-12-17  16:03:18', '大厅');
INSERT INTO `orderlist` VALUES ('181', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:03:18', '已完成', '12', '0', '2019-12-17  16:03:18', '大厅');
INSERT INTO `orderlist` VALUES ('182', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.chawenyi.com/201904/2019040364716_b.jpg\",\"price\":30,\"num\":1,\"name\":\"特级绿春玛玉茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:07:41', '已完成', '12', '0', '2019-12-17  16:07:41', '大厅');
INSERT INTO `orderlist` VALUES ('183', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:07:41', '已完成', '12', '0', '2019-12-17  16:07:41', '大厅');
INSERT INTO `orderlist` VALUES ('184', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20190311/76e0e9a61698448f9fd7b3b5654e146b.jpeg\",\"price\":45,\"num\":1,\"name\":\"大红袍\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:07:41', '已完成', '12', '0', '2019-12-17  16:07:41', '大厅');
INSERT INTO `orderlist` VALUES ('185', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.chawenyi.com/201904/2019040364716_b.jpg\",\"price\":30,\"num\":1,\"name\":\"特级绿春玛玉茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:07:41', '已完成', '12', '0', '2019-12-17  16:07:41', '大厅');
INSERT INTO `orderlist` VALUES ('186', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:27:16', '已完成', '12', '0', '2019-12-17  16:27:16', '大厅');
INSERT INTO `orderlist` VALUES ('187', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:27:16', '已完成', '12', '0', '2019-12-17  16:27:16', '大厅');
INSERT INTO `orderlist` VALUES ('188', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:33:46', '已完成', '12', '0', '2019-12-17  16:33:46', '大厅');
INSERT INTO `orderlist` VALUES ('189', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/images/20180828/82b6e4fe790a4b318de649855cd77003.jpeg\",\"price\":55,\"num\":1,\"name\":\"绿茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:33:46', '已完成', '12', '0', '2019-12-17  16:33:46', '大厅');
INSERT INTO `orderlist` VALUES ('190', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://uploads.5068.com/allimg/1809/211-1PZ1160105.jpg\",\"price\":30,\"num\":1,\"name\":\"花茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:33:46', '已完成', '12', '0', '2019-12-17  16:33:46', '大厅');
INSERT INTO `orderlist` VALUES ('191', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20171117/f6d91e11e2d3494faed3c4d4c112a3b9.jpeg\",\"price\":55,\"num\":1,\"name\":\"乌龙茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:33:46', '已完成', '12', '0', '2019-12-17  16:33:46', '大厅');
INSERT INTO `orderlist` VALUES ('192', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:33:46', '已完成', '12', '0', '2019-12-17  16:33:46', '大厅');
INSERT INTO `orderlist` VALUES ('193', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://uploads.5068.com/allimg/1809/211-1PZ1160105.jpg\",\"price\":30,\"num\":1,\"name\":\"花茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  16:33:46', '已完成', '12', '0', '2019-12-17  16:33:46', '大厅');
INSERT INTO `orderlist` VALUES ('194', 'o7Nhp5Lqo91i_z4SzUGScTLHaRPo', '[{\"image\":\"http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg\",\"price\":50,\"num\":1,\"name\":\"功夫红茶\",\"isSelect\":true,\"type\":\"tea\"}]', '12.8', '2019-12-17  17:23:22', '已完成', '12', '0', '2019-12-17  17:23:22', '大厅');

-- ----------------------------
-- Table structure for `shoppingcar`
-- ----------------------------
DROP TABLE IF EXISTS `shoppingcar`;
CREATE TABLE `shoppingcar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openid` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=434 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of shoppingcar
-- ----------------------------

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffId` int(11) NOT NULL AUTO_INCREMENT,
  `telephone` varchar(255) DEFAULT NULL,
  `checkInDay` varchar(255) DEFAULT NULL,
  `checkInYear` varchar(255) DEFAULT NULL,
  `checkInMonth` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staffId`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('2', '0', '0', '0', '0');
INSERT INTO `staff` VALUES ('5', '12', '12,13,14,15,16,17,17', '2019', '12');
INSERT INTO `staff` VALUES ('6', '12', '1,3,5,7,9,10,12,13,15,17,19,20,21,24,25,26,29', '2019', '11');
INSERT INTO `staff` VALUES ('9', '15680001306', '16,17,17', '2019', '12');
INSERT INTO `staff` VALUES ('8', '', '17,16', '2019', '12');
INSERT INTO `staff` VALUES ('10', '19940897748', '17', '2019', '12');

-- ----------------------------
-- Table structure for `teapj`
-- ----------------------------
DROP TABLE IF EXISTS `teapj`;
CREATE TABLE `teapj` (
  `pj_id` int(11) NOT NULL AUTO_INCREMENT,
  `pj_score` varchar(11) DEFAULT NULL,
  `pj_content` varchar(255) DEFAULT NULL,
  `pj_icon` varchar(255) DEFAULT NULL,
  `pj_date` varchar(255) DEFAULT NULL,
  `pj_ansContent` varchar(255) DEFAULT NULL,
  `pj_ansDate` varchar(255) DEFAULT NULL,
  `pj_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pj_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of teapj
-- ----------------------------
INSERT INTO `teapj` VALUES ('1', '3', '这个项目虽然只是用来测试，但是环境还是不错，服务员也很给力!!!', 'https://wx.qlogo.cn/mmopen/vi_32/12lic3oWibJa9MXzn5bhWuLf9vD1wTJE4XpCXgbWl8icicyEw7Nyicuo8GdAkm2JGia0s3kDqrle0Z3OuYkpkUiczBoVg/132', '2014-03-10 10:23', '感谢您的回复，欢迎您下次光临!', '2014-03-10 10:23', 'Rabbi');
INSERT INTO `teapj` VALUES ('2', '5', '我是林建', 'https://wx.qlogo.cn/mmopen/vi_32/5T98QoeVBeqGNLFfDiakJppibhN3Q64ZQtibIfnQpQwWbEGsVlLcJ8uSO9IECkicgRybEldOiaElkNqYzvFbTyZD4EA/132', '2015-04-08 12:20', '我是刘磊', '2016-04-08 12:20', 'Rabbi');

-- ----------------------------
-- Table structure for `tea_sc`
-- ----------------------------
DROP TABLE IF EXISTS `tea_sc`;
CREATE TABLE `tea_sc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openId` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `price` double(255,0) DEFAULT NULL,
  `num` int(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `demo2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tea_sc
-- ----------------------------
INSERT INTO `tea_sc` VALUES ('48', 'owcCm5PNHntgDyI3XxZazbv1Hkgc', 'http://image.suning.cn/uimg/sop/commodity/113581741812086093648839_x.jpg', '功夫红茶', '工夫红茶原料细嫩,制工精细,外形条索紧直,匀齐,色泽乌润,香气浓郁,滋味醇和而甘浓,汤色,叶底红艳明亮,具有形质兼优的品质特征.,内含物质十分丰富，茶多酚和儿茶素较高，茶芽壮多毫，具有优良的发酵性能和丰富的多酚类物质', '50', '1', 'tea', null);
