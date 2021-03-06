CREATE TABLE `CLIENT_VETERAN_INFO` (
  `VETERAN_INFO_KEY` bigint(20) NOT NULL AUTO_INCREMENT,
  `CLIENT_KEY` bigint(20) DEFAULT NULL,
  `PREVIOUS_VET_INFO_KEY` bigint(20) DEFAULT NULL,
  `INFORMATION_DATE` date DEFAULT NULL,
  `YEAR_ENTERED_MILITARY` int(11) DEFAULT NULL,
  `YEAR_LEFT_MILITARY` int(11) DEFAULT NULL,
  `SERVED_IN_THEATRE_GCT` int(11) DEFAULT NULL,
  `MILITARY_BRANCH_CODE` int(11) DEFAULT NULL,
  `MILITARY_DISCHARGE_CODE` int(11) DEFAULT NULL,
  `REC_ACTIVE_GCT` int(11) DEFAULT '1',
  `ENTRY_DATE_TIME` timestamp NULL DEFAULT NULL,
  `ENTRY_USER_KEY` bigint(20) DEFAULT NULL,
  `LOG_DATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `LOG_USER_KEY` bigint(20) DEFAULT NULL,
  `WORLDWARII_GCT` int(11) DEFAULT NULL,
  `KOREANWAR_GCT` int(11) DEFAULT NULL,
  `VIETNAMWAR_GCT` int(11) DEFAULT NULL,
  `PERSIANGULF_OPERDESERTSTORM_GCT` int(11) DEFAULT NULL,
  `AFGHANISTAN_OPERENDURFREEDOM_GCT` int(11) DEFAULT NULL,
  `IRAQ_OPERIRAQIFREEDOM_GCT` int(11) DEFAULT NULL,
  `IRAQ_OPERNEWDAWN_GCT` int(11) DEFAULT NULL,
  `OTHERTHEATRE_GCT` int(11) DEFAULT NULL,
  `ACT_DATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`VETERAN_INFO_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;