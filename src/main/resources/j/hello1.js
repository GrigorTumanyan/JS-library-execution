//import(java.lang);

//import('./envConfig.js');

//import * from './envConfig.js';


var getKpiConfig = require('./kpiConfig.js');

var appConfig = require('./app_config.js');
var KpiController = require('./kpi-controller.js');


var kpiConfig = getKpiConfig(appConfig);
var envSettings = envConfig.qa; // qa or uat
consoleLog(envSettings.host);

//var performanceLog = false;
//var consoleLog = false;
//var verification_mode = 0;
//var debug = false;
//
//var controllerInstance = new KpiController(
//    envSettings,
//    kpiConfig,
//    appConfig,
//    performanceLog,
//    consoleLog,
//    verification_mode,
//    debug
//);
//
//
//controllerInstance.setFieldSelection('', 'userid', 'pepsitest01.');
//
//controllerInstance.setFieldSelection('', 'productLine', null);
//controllerInstance.setFieldSelection('', 'groupid', null);
//
//controllerInstance.setFieldSelection('', 'country', 'US');
//
//controllerInstance.kpiConfig = getKpiConfig(
//    controllerInstance.appConfig
//);
//
//function getKPIs(ids) {
//   return controllerInstance.getKPIs(ids, 'ID').then(function(data) { return data;});
//}
//
