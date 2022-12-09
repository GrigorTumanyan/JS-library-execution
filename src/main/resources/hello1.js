//importPackage(java.lang);
//
//importPackage('./envConfig.js');
//
//import * from './envConfig.js';
import {envConfig} from "src/main/resources/envConfig.js"

import {APP_UPDATE as getKpiConfig} from "src/main/resources/kpiConfig.js"

var appConfig = import("src/main/resources/app_config.js");


var KpiController = import ("src/main/resources/kpi-controller.js")
console.log(KpiController)

//var getKpiConfig = require('./kpiConfig.js');
//
//var appConfig = require('./app_config.js');
//var KpiController = require('./kpi-controller.js');


var kpiConfig = getKpiConfig(appConfig);
var envSettings = envConfig.qa; // qa or uat


var performanceLog = false;
var consoleLog = false;
var verification_mode = 0;
var debug = false;

const getKpi = async ()=>{
    return await KpiController(
        envSettings,
        kpiConfig,
        appConfig,
        performanceLog,
        consoleLog,
        verification_mode,
        debug
    );
}

var controllerInstance = getKpi();

console.log(JSON.stringify(controllerInstance));

controllerInstance.setFieldSelection('', 'userid', 'pepsitest01.');

controllerInstance.setFieldSelection('', 'productLine', null);
controllerInstance.setFieldSelection('', 'groupid', null);

controllerInstance.setFieldSelection('', 'country', 'US');

controllerInstance.kpiConfig = getKpiConfig(
    controllerInstance.appConfig
);

function getKPIs(ids) {
   return controllerInstance.getKPIs(ids, 'ID').then(function(data) { return data;});
}

