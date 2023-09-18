// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2020-2022 MariaDB Corporation Ab

package org.mariadb.r2dbc.util;

import java.util.HashMap;
import java.util.Map;

public final class CharsetEncodingLength {

  // This array stored character length for every collation
  // query to generate:
  //   select  id, maxlen
  //   from information_schema.character_sets, information_schema.collations
  //   where character_sets.character_set_name = collations.character_set_name
  //   order by id
  public static final Map<Integer, Integer> maxCharlen;

  static {
    maxCharlen = new HashMap<>();
    maxCharlen.put(1, 2);
    maxCharlen.put(2, 1);
    maxCharlen.put(3, 1);
    maxCharlen.put(4, 1);
    maxCharlen.put(5, 1);
    maxCharlen.put(6, 1);
    maxCharlen.put(7, 1);
    maxCharlen.put(8, 1);
    maxCharlen.put(9, 1);
    maxCharlen.put(10, 1);
    maxCharlen.put(11, 1);
    maxCharlen.put(12, 3);
    maxCharlen.put(13, 2);
    maxCharlen.put(14, 1);
    maxCharlen.put(15, 1);
    maxCharlen.put(16, 1);
    maxCharlen.put(18, 1);
    maxCharlen.put(19, 2);
    maxCharlen.put(20, 1);
    maxCharlen.put(21, 1);
    maxCharlen.put(22, 1);
    maxCharlen.put(23, 1);
    maxCharlen.put(24, 2);
    maxCharlen.put(25, 1);
    maxCharlen.put(26, 1);
    maxCharlen.put(27, 1);
    maxCharlen.put(28, 2);
    maxCharlen.put(29, 1);
    maxCharlen.put(30, 1);
    maxCharlen.put(31, 1);
    maxCharlen.put(32, 1);
    maxCharlen.put(33, 3);
    maxCharlen.put(34, 1);
    maxCharlen.put(35, 2);
    maxCharlen.put(36, 1);
    maxCharlen.put(37, 1);
    maxCharlen.put(38, 1);
    maxCharlen.put(39, 1);
    maxCharlen.put(40, 1);
    maxCharlen.put(41, 1);
    maxCharlen.put(42, 1);
    maxCharlen.put(43, 1);
    maxCharlen.put(44, 1);
    maxCharlen.put(45, 4);
    maxCharlen.put(46, 4);
    maxCharlen.put(47, 1);
    maxCharlen.put(48, 1);
    maxCharlen.put(49, 1);
    maxCharlen.put(50, 1);
    maxCharlen.put(51, 1);
    maxCharlen.put(52, 1);
    maxCharlen.put(53, 1);
    maxCharlen.put(54, 4);
    maxCharlen.put(55, 4);
    maxCharlen.put(56, 4);
    maxCharlen.put(57, 1);
    maxCharlen.put(58, 1);
    maxCharlen.put(59, 1);
    maxCharlen.put(60, 4);
    maxCharlen.put(61, 4);
    maxCharlen.put(62, 4);
    maxCharlen.put(63, 1);
    maxCharlen.put(64, 1);
    maxCharlen.put(65, 1);
    maxCharlen.put(66, 1);
    maxCharlen.put(67, 1);
    maxCharlen.put(68, 1);
    maxCharlen.put(69, 1);
    maxCharlen.put(70, 1);
    maxCharlen.put(71, 1);
    maxCharlen.put(72, 1);
    maxCharlen.put(73, 1);
    maxCharlen.put(74, 1);
    maxCharlen.put(75, 1);
    maxCharlen.put(76, 3);
    maxCharlen.put(77, 1);
    maxCharlen.put(78, 1);
    maxCharlen.put(79, 1);
    maxCharlen.put(80, 1);
    maxCharlen.put(81, 1);
    maxCharlen.put(82, 1);
    maxCharlen.put(83, 3);
    maxCharlen.put(84, 2);
    maxCharlen.put(85, 2);
    maxCharlen.put(86, 2);
    maxCharlen.put(87, 2);
    maxCharlen.put(88, 2);
    maxCharlen.put(89, 1);
    maxCharlen.put(90, 2);
    maxCharlen.put(91, 3);
    maxCharlen.put(92, 1);
    maxCharlen.put(93, 1);
    maxCharlen.put(94, 1);
    maxCharlen.put(95, 2);
    maxCharlen.put(96, 2);
    maxCharlen.put(97, 3);
    maxCharlen.put(98, 3);
    maxCharlen.put(99, 1);
    maxCharlen.put(101, 4);
    maxCharlen.put(102, 4);
    maxCharlen.put(103, 4);
    maxCharlen.put(104, 4);
    maxCharlen.put(105, 4);
    maxCharlen.put(106, 4);
    maxCharlen.put(107, 4);
    maxCharlen.put(108, 4);
    maxCharlen.put(109, 4);
    maxCharlen.put(110, 4);
    maxCharlen.put(111, 4);
    maxCharlen.put(112, 4);
    maxCharlen.put(113, 4);
    maxCharlen.put(114, 4);
    maxCharlen.put(115, 4);
    maxCharlen.put(116, 4);
    maxCharlen.put(117, 4);
    maxCharlen.put(118, 4);
    maxCharlen.put(119, 4);
    maxCharlen.put(120, 4);
    maxCharlen.put(121, 4);
    maxCharlen.put(122, 4);
    maxCharlen.put(123, 4);
    maxCharlen.put(124, 4);
    maxCharlen.put(128, 2);
    maxCharlen.put(129, 2);
    maxCharlen.put(130, 2);
    maxCharlen.put(131, 2);
    maxCharlen.put(132, 2);
    maxCharlen.put(133, 2);
    maxCharlen.put(134, 2);
    maxCharlen.put(135, 2);
    maxCharlen.put(136, 2);
    maxCharlen.put(137, 2);
    maxCharlen.put(138, 2);
    maxCharlen.put(139, 2);
    maxCharlen.put(140, 2);
    maxCharlen.put(141, 2);
    maxCharlen.put(142, 2);
    maxCharlen.put(143, 2);
    maxCharlen.put(144, 2);
    maxCharlen.put(145, 2);
    maxCharlen.put(146, 2);
    maxCharlen.put(147, 2);
    maxCharlen.put(148, 2);
    maxCharlen.put(149, 2);
    maxCharlen.put(150, 2);
    maxCharlen.put(151, 2);
    maxCharlen.put(159, 2);
    maxCharlen.put(160, 4);
    maxCharlen.put(161, 4);
    maxCharlen.put(162, 4);
    maxCharlen.put(163, 4);
    maxCharlen.put(164, 4);
    maxCharlen.put(165, 4);
    maxCharlen.put(166, 4);
    maxCharlen.put(167, 4);
    maxCharlen.put(168, 4);
    maxCharlen.put(169, 4);
    maxCharlen.put(170, 4);
    maxCharlen.put(171, 4);
    maxCharlen.put(172, 4);
    maxCharlen.put(173, 4);
    maxCharlen.put(174, 4);
    maxCharlen.put(175, 4);
    maxCharlen.put(176, 4);
    maxCharlen.put(177, 4);
    maxCharlen.put(178, 4);
    maxCharlen.put(179, 4);
    maxCharlen.put(180, 4);
    maxCharlen.put(181, 4);
    maxCharlen.put(182, 4);
    maxCharlen.put(183, 4);
    maxCharlen.put(192, 3);
    maxCharlen.put(193, 3);
    maxCharlen.put(194, 3);
    maxCharlen.put(195, 3);
    maxCharlen.put(196, 3);
    maxCharlen.put(197, 3);
    maxCharlen.put(198, 3);
    maxCharlen.put(199, 3);
    maxCharlen.put(200, 3);
    maxCharlen.put(201, 3);
    maxCharlen.put(202, 3);
    maxCharlen.put(203, 3);
    maxCharlen.put(204, 3);
    maxCharlen.put(205, 3);
    maxCharlen.put(206, 3);
    maxCharlen.put(207, 3);
    maxCharlen.put(208, 3);
    maxCharlen.put(209, 3);
    maxCharlen.put(210, 3);
    maxCharlen.put(211, 3);
    maxCharlen.put(212, 3);
    maxCharlen.put(213, 3);
    maxCharlen.put(214, 3);
    maxCharlen.put(215, 3);
    maxCharlen.put(223, 3);
    maxCharlen.put(224, 4);
    maxCharlen.put(225, 4);
    maxCharlen.put(226, 4);
    maxCharlen.put(227, 4);
    maxCharlen.put(228, 4);
    maxCharlen.put(229, 4);
    maxCharlen.put(230, 4);
    maxCharlen.put(231, 4);
    maxCharlen.put(232, 4);
    maxCharlen.put(233, 4);
    maxCharlen.put(234, 4);
    maxCharlen.put(235, 4);
    maxCharlen.put(236, 4);
    maxCharlen.put(237, 4);
    maxCharlen.put(238, 4);
    maxCharlen.put(239, 4);
    maxCharlen.put(240, 4);
    maxCharlen.put(241, 4);
    maxCharlen.put(242, 4);
    maxCharlen.put(243, 4);
    maxCharlen.put(244, 4);
    maxCharlen.put(245, 4);
    maxCharlen.put(246, 4);
    maxCharlen.put(247, 4);
    maxCharlen.put(248, 4);
    maxCharlen.put(249, 4);
    maxCharlen.put(250, 4);
    maxCharlen.put(255, 4);
    maxCharlen.put(256, 4);
    maxCharlen.put(257, 4);
    maxCharlen.put(258, 4);
    maxCharlen.put(259, 4);
    maxCharlen.put(260, 4);
    maxCharlen.put(261, 4);
    maxCharlen.put(262, 4);
    maxCharlen.put(263, 4);
    maxCharlen.put(264, 4);
    maxCharlen.put(265, 4);
    maxCharlen.put(266, 4);
    maxCharlen.put(267, 4);
    maxCharlen.put(268, 4);
    maxCharlen.put(269, 4);
    maxCharlen.put(270, 4);
    maxCharlen.put(271, 4);
    maxCharlen.put(273, 4);
    maxCharlen.put(274, 4);
    maxCharlen.put(275, 4);
    maxCharlen.put(277, 4);
    maxCharlen.put(278, 4);
    maxCharlen.put(279, 4);
    maxCharlen.put(280, 4);
    maxCharlen.put(281, 4);
    maxCharlen.put(282, 4);
    maxCharlen.put(283, 4);
    maxCharlen.put(284, 4);
    maxCharlen.put(285, 4);
    maxCharlen.put(286, 4);
    maxCharlen.put(287, 4);
    maxCharlen.put(288, 4);
    maxCharlen.put(289, 4);
    maxCharlen.put(290, 4);
    maxCharlen.put(291, 4);
    maxCharlen.put(292, 4);
    maxCharlen.put(293, 4);
    maxCharlen.put(294, 4);
    maxCharlen.put(296, 4);
    maxCharlen.put(297, 4);
    maxCharlen.put(298, 4);
    maxCharlen.put(300, 4);
    maxCharlen.put(303, 4);
    maxCharlen.put(304, 4);
    maxCharlen.put(305, 4);
    maxCharlen.put(306, 4);
    maxCharlen.put(307, 4);
    maxCharlen.put(308, 4);
    maxCharlen.put(309, 4);
    maxCharlen.put(310, 4);
    maxCharlen.put(311, 4);
    maxCharlen.put(312, 4);
    maxCharlen.put(313, 4);
    maxCharlen.put(314, 4);
    maxCharlen.put(315, 4);
    maxCharlen.put(316, 4);
    maxCharlen.put(317, 4);
    maxCharlen.put(318, 4);
    maxCharlen.put(319, 4);
    maxCharlen.put(320, 4);
    maxCharlen.put(321, 4);
    maxCharlen.put(322, 4);
    maxCharlen.put(323, 4);
    maxCharlen.put(576, 3);
    maxCharlen.put(577, 3);
    maxCharlen.put(578, 3);
    maxCharlen.put(608, 4);
    maxCharlen.put(609, 4);
    maxCharlen.put(610, 4);
    maxCharlen.put(640, 2);
    maxCharlen.put(641, 2);
    maxCharlen.put(642, 2);
    maxCharlen.put(672, 4);
    maxCharlen.put(673, 4);
    maxCharlen.put(674, 4);
    maxCharlen.put(736, 4);
    maxCharlen.put(737, 4);
    maxCharlen.put(738, 4);
    maxCharlen.put(1025, 2);
    maxCharlen.put(1027, 1);
    maxCharlen.put(1028, 1);
    maxCharlen.put(1030, 1);
    maxCharlen.put(1031, 1);
    maxCharlen.put(1032, 1);
    maxCharlen.put(1033, 1);
    maxCharlen.put(1034, 1);
    maxCharlen.put(1035, 1);
    maxCharlen.put(1036, 3);
    maxCharlen.put(1037, 2);
    maxCharlen.put(1040, 1);
    maxCharlen.put(1042, 1);
    maxCharlen.put(1043, 2);
    maxCharlen.put(1046, 1);
    maxCharlen.put(1048, 2);
    maxCharlen.put(1049, 1);
    maxCharlen.put(1050, 1);
    maxCharlen.put(1052, 2);
    maxCharlen.put(1054, 1);
    maxCharlen.put(1056, 1);
    maxCharlen.put(1057, 3);
    maxCharlen.put(1059, 2);
    maxCharlen.put(1060, 1);
    maxCharlen.put(1061, 1);
    maxCharlen.put(1062, 1);
    maxCharlen.put(1063, 1);
    maxCharlen.put(1064, 1);
    maxCharlen.put(1065, 1);
    maxCharlen.put(1067, 1);
    maxCharlen.put(1069, 4);
    maxCharlen.put(1070, 4);
    maxCharlen.put(1071, 1);
    maxCharlen.put(1074, 1);
    maxCharlen.put(1075, 1);
    maxCharlen.put(1077, 1);
    maxCharlen.put(1078, 4);
    maxCharlen.put(1079, 4);
    maxCharlen.put(1080, 4);
    maxCharlen.put(1081, 1);
    maxCharlen.put(1082, 1);
    maxCharlen.put(1083, 1);
    maxCharlen.put(1084, 4);
    maxCharlen.put(1085, 4);
    maxCharlen.put(1086, 4);
    maxCharlen.put(1088, 1);
    maxCharlen.put(1089, 1);
    maxCharlen.put(1090, 1);
    maxCharlen.put(1091, 1);
    maxCharlen.put(1092, 1);
    maxCharlen.put(1093, 1);
    maxCharlen.put(1094, 1);
    maxCharlen.put(1095, 1);
    maxCharlen.put(1096, 1);
    maxCharlen.put(1097, 1);
    maxCharlen.put(1098, 1);
    maxCharlen.put(1099, 1);
    maxCharlen.put(1101, 1);
    maxCharlen.put(1102, 1);
    maxCharlen.put(1103, 1);
    maxCharlen.put(1104, 1);
    maxCharlen.put(1105, 1);
    maxCharlen.put(1106, 1);
    maxCharlen.put(1107, 3);
    maxCharlen.put(1108, 2);
    maxCharlen.put(1109, 2);
    maxCharlen.put(1110, 2);
    maxCharlen.put(1111, 2);
    maxCharlen.put(1112, 2);
    maxCharlen.put(1113, 1);
    maxCharlen.put(1114, 2);
    maxCharlen.put(1115, 3);
    maxCharlen.put(1116, 1);
    maxCharlen.put(1117, 1);
    maxCharlen.put(1119, 2);
    maxCharlen.put(1120, 2);
    maxCharlen.put(1121, 3);
    maxCharlen.put(1122, 3);
    maxCharlen.put(1125, 4);
    maxCharlen.put(1147, 4);
    maxCharlen.put(1152, 2);
    maxCharlen.put(1174, 2);
    maxCharlen.put(1184, 4);
    maxCharlen.put(1206, 4);
    maxCharlen.put(1216, 3);
    maxCharlen.put(1238, 3);
    maxCharlen.put(1248, 4);
    maxCharlen.put(1270, 4);
  }
}
