import envConfig from "./envConfig.js";
import kpiConfig from "./kpiConfig.js";
import "./kpi-controller.js";
let controller=new KPIController(kpiConfig,envConfig);window.kpi=controller,console.log(controller);